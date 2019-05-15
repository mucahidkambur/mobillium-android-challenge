package com.app.appchallenge.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.appchallenge.database.ApiInterface;
import com.app.appchallenge.database.entity.pojos.VitrinResult;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataViewModel extends ViewModel {

    private MutableLiveData<List<VitrinResult>> dataList;
    private final MutableLiveData<Boolean> loading = new MutableLiveData<>();

    public LiveData<Boolean> getLoading() {
        return loading;
    }

    public LiveData<List<VitrinResult>> getDatas(){
        if (dataList == null){
            dataList = new MutableLiveData<>();
            loadDatas();
        }
        return dataList;
    }

    private void loadDatas(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.vitrinova.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<VitrinResult>> call = apiInterface.getData();

        call.enqueue(new Callback<List<VitrinResult>>() {
            @Override
            public void onResponse(Call<List<VitrinResult>> call, Response<List<VitrinResult>> response) {
                dataList.setValue(response.body());
                loading.setValue(true);
            }

            @Override
            public void onFailure(Call<List<VitrinResult>> call, Throwable t) {

            }
        });
    }
}
