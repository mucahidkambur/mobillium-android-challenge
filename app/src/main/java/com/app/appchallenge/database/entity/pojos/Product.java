
package com.app.appchallenge.database.entity.pojos;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Product implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("old_price")
    @Expose
    private Integer oldPrice;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("max_installment")
    @Expose
    private Object maxInstallment;
    @SerializedName("commission_rate")
    @Expose
    private Integer commissionRate;
    @SerializedName("cargo_time")
    @Expose
    private Integer cargoTime;
    @SerializedName("is_cargo_free")
    @Expose
    private Boolean isCargoFree;
    @SerializedName("is_new")
    @Expose
    private Boolean isNew;
    @SerializedName("reject_reason")
    @Expose
    private Object rejectReason;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("difference")
    @Expose
    private String difference;
    @SerializedName("is_editor_choice")
    @Expose
    private Boolean isEditorChoice;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("is_owner")
    @Expose
    private Boolean isOwner;
    @SerializedName("is_approved")
    @Expose
    private Boolean isApproved;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("is_liked")
    @Expose
    private Boolean isLiked;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("shop")
    @Expose
    private Shop shop;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Object getMaxInstallment() {
        return maxInstallment;
    }

    public void setMaxInstallment(Object maxInstallment) {
        this.maxInstallment = maxInstallment;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCargoTime() {
        return cargoTime;
    }

    public void setCargoTime(Integer cargoTime) {
        this.cargoTime = cargoTime;
    }

    public Boolean getIsCargoFree() {
        return isCargoFree;
    }

    public void setIsCargoFree(Boolean isCargoFree) {
        this.isCargoFree = isCargoFree;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Object getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(Object rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }

    public Boolean getIsEditorChoice() {
        return isEditorChoice;
    }

    public void setIsEditorChoice(Boolean isEditorChoice) {
        this.isEditorChoice = isEditorChoice;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
