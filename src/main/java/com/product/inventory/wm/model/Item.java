package com.product.inventory.wm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "itemId", "parentItemId", "name", "msrp", "salePrice", "upc", "categoryPath", "shortDescription",
		"longDescription", "brandName", "thumbnailImage", "mediumImage", "largeImage", "productTrackingUrl",
		"standardShipRate", "twoThreeDayShippingRate", "color", "marketplace", "sellerInfo", "productUrl",
		"customerRating", "numReviews", "customerRatingImage", "categoryNode", "rhid", "bundle", "clearance", "stock",
		"addToCartUrl", "affiliateAddToCartUrl", "freeShippingOver35Dollars", "giftOptions", "imageEntities",
		"availableOnline" })
@Entity
public class Item {
	
	@JsonProperty("itemId")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  itemId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("msrp")
	private Double msrp;
	@JsonProperty("salePrice")
	private Double salePrice;
	@JsonProperty("upc")
	@Column(columnDefinition="varchar(50)",unique=true)
	private String upc;
	@JsonProperty("shortDescription")
	@Column(columnDefinition="varchar(2000)")
	private String shortDescription;
	@JsonProperty("brandName")
	private String brandName;
	@JsonProperty("thumbnailImage")
	@Column(columnDefinition="blob")
	private String thumbnailImage;
	@JsonProperty("mediumImage")
	@Column(columnDefinition="blob")
	private String mediumImage;
	@JsonProperty("largeImage")
	@Column(columnDefinition="blob")
	private String largeImage;
	@JsonProperty("sellerInfo")
	private String sellerInfo;
	@JsonProperty("productUrl")
	private String productUrl;
	@JsonProperty("imageEntities")
	@Transient
	private List<ImageEntity> imageEntities;
	@JsonProperty("availableOnline")
	private Boolean availableOnline;
	private int quantity;
	
	
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Double getMsrp() {
		return msrp;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("msrp")
	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	@JsonProperty("salePrice")
	public Double getSalePrice() {
		return salePrice;
	}

	@JsonProperty("salePrice")
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	@JsonProperty("upc")
	public String getUpc() {
		return upc;
	}

	@JsonProperty("upc")
	public void setUpc(String upc) {
		this.upc = upc;
	}

	@JsonProperty("shortDescription")
	public String getShortDescription() {
		return shortDescription;
	}

	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@JsonProperty("brandName")
	public String getBrandName() {
		return brandName;
	}

	@JsonProperty("brandName")
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@JsonProperty("thumbnailImage")
	public String getThumbnailImage() {
		return thumbnailImage;
	}

	@JsonProperty("thumbnailImage")
	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	@JsonProperty("mediumImage")
	public String getMediumImage() {
		return mediumImage;
	}

	@JsonProperty("mediumImage")
	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}

	@JsonProperty("largeImage")
	public String getLargeImage() {
		return largeImage;
	}

	@JsonProperty("largeImage")
	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

	@JsonProperty("sellerInfo")
	public String getSellerInfo() {
		return sellerInfo;
	}

	@JsonProperty("sellerInfo")
	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

	@JsonProperty("productUrl")
	public String getProductUrl() {
		return productUrl;
	}

	@JsonProperty("productUrl")
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@JsonProperty("imageEntities")
	public List<ImageEntity> getImageEntities() {
		return imageEntities;
	}

	@JsonProperty("imageEntities")
	public void setImageEntities(List<ImageEntity> imageEntities) {
		this.imageEntities = imageEntities;
	}

	@JsonProperty("availableOnline")
	public Boolean getAvailableOnline() {
		return availableOnline;
	}

	@JsonProperty("availableOnline")
	public void setAvailableOnline(Boolean availableOnline) {
		this.availableOnline = availableOnline;
	}

}