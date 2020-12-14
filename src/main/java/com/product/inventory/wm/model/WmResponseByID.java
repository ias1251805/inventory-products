package com.product.inventory.wm.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"itemId",
"parentItemId",
"name",
"salePrice",
"categoryPath",
"shortDescription",
"longDescription",
"brandName",
"thumbnailImage",
"mediumImage",
"largeImage",
"productTrackingUrl",
"ninetySevenCentShipping",
"standardShipRate",
"twoThreeDayShippingRate",
"marketplace",
"shipToStore",
"freeShipToStore",
"sellerInfo",
"productUrl",
"variants",
"bestMarketplacePrice",
"categoryNode",
"rhid",
"bundle",
"clearance",
"preOrder",
"stock",
"attributes",
"addToCartUrl",
"affiliateAddToCartUrl",
"freeShippingOver35Dollars",
"maxItemsInOrder",
"giftOptions",
"imageEntities",
"offerType",
"isTwoDayShippingEligible",
"availableOnline"
})
public class WmResponseByID {

@JsonProperty("itemId")
private Integer itemId;
@JsonProperty("parentItemId")
private Integer parentItemId;
@JsonProperty("name")
private String name;
@JsonProperty("salePrice")
private Double salePrice;
@JsonProperty("categoryPath")
private String categoryPath;
@JsonProperty("shortDescription")
private String shortDescription;
@JsonProperty("longDescription")
private String longDescription;
@JsonProperty("brandName")
private String brandName;
@JsonProperty("thumbnailImage")
private String thumbnailImage;
@JsonProperty("mediumImage")
private String mediumImage;
@JsonProperty("largeImage")
private String largeImage;
@JsonProperty("productTrackingUrl")
private String productTrackingUrl;
@JsonProperty("ninetySevenCentShipping")
private Boolean ninetySevenCentShipping;
@JsonProperty("standardShipRate")
private Double standardShipRate;
@JsonProperty("twoThreeDayShippingRate")
private Double twoThreeDayShippingRate;
@JsonProperty("marketplace")
private Boolean marketplace;
@JsonProperty("shipToStore")
private Boolean shipToStore;
@JsonProperty("freeShipToStore")
private Boolean freeShipToStore;
@JsonProperty("sellerInfo")
private String sellerInfo;
@JsonProperty("productUrl")
private String productUrl;
@JsonProperty("variants")
private List<Integer> variants = null;
@JsonProperty("bestMarketplacePrice")
private BestMarketplacePrice bestMarketplacePrice;
@JsonProperty("categoryNode")
private String categoryNode;
@JsonProperty("rhid")
private String rhid;
@JsonProperty("bundle")
private Boolean bundle;
@JsonProperty("clearance")
private Boolean clearance;
@JsonProperty("preOrder")
private Boolean preOrder;
@JsonProperty("stock")
private String stock;
@JsonProperty("attributes")
private Attributes attributes;
@JsonProperty("addToCartUrl")
private String addToCartUrl;
@JsonProperty("affiliateAddToCartUrl")
private String affiliateAddToCartUrl;
@JsonProperty("freeShippingOver35Dollars")
private Boolean freeShippingOver35Dollars;
@JsonProperty("maxItemsInOrder")
private Integer maxItemsInOrder;
private List<ImageEntity> imageEntities = null;
@JsonProperty("offerType")
private String offerType;
@JsonProperty("isTwoDayShippingEligible")
private Boolean isTwoDayShippingEligible;
@JsonProperty("availableOnline")
private Boolean availableOnline;

@JsonProperty("itemId")
public Integer getItemId() {
return itemId;
}

@JsonProperty("itemId")
public void setItemId(Integer itemId) {
this.itemId = itemId;
}

@JsonProperty("parentItemId")
public Integer getParentItemId() {
return parentItemId;
}

@JsonProperty("parentItemId")
public void setParentItemId(Integer parentItemId) {
this.parentItemId = parentItemId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("salePrice")
public Double getSalePrice() {
return salePrice;
}

@JsonProperty("salePrice")
public void setSalePrice(Double salePrice) {
this.salePrice = salePrice;
}

@JsonProperty("categoryPath")
public String getCategoryPath() {
return categoryPath;
}

@JsonProperty("categoryPath")
public void setCategoryPath(String categoryPath) {
this.categoryPath = categoryPath;
}

@JsonProperty("shortDescription")
public String getShortDescription() {
return shortDescription;
}

@JsonProperty("shortDescription")
public void setShortDescription(String shortDescription) {
this.shortDescription = shortDescription;
}

@JsonProperty("longDescription")
public String getLongDescription() {
return longDescription;
}

@JsonProperty("longDescription")
public void setLongDescription(String longDescription) {
this.longDescription = longDescription;
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

@JsonProperty("productTrackingUrl")
public String getProductTrackingUrl() {
return productTrackingUrl;
}

@JsonProperty("productTrackingUrl")
public void setProductTrackingUrl(String productTrackingUrl) {
this.productTrackingUrl = productTrackingUrl;
}

@JsonProperty("ninetySevenCentShipping")
public Boolean getNinetySevenCentShipping() {
return ninetySevenCentShipping;
}

@JsonProperty("ninetySevenCentShipping")
public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
this.ninetySevenCentShipping = ninetySevenCentShipping;
}

@JsonProperty("standardShipRate")
public Double getStandardShipRate() {
return standardShipRate;
}

@JsonProperty("standardShipRate")
public void setStandardShipRate(Double standardShipRate) {
this.standardShipRate = standardShipRate;
}

@JsonProperty("twoThreeDayShippingRate")
public Double getTwoThreeDayShippingRate() {
return twoThreeDayShippingRate;
}

@JsonProperty("twoThreeDayShippingRate")
public void setTwoThreeDayShippingRate(Double twoThreeDayShippingRate) {
this.twoThreeDayShippingRate = twoThreeDayShippingRate;
}

@JsonProperty("marketplace")
public Boolean getMarketplace() {
return marketplace;
}

@JsonProperty("marketplace")
public void setMarketplace(Boolean marketplace) {
this.marketplace = marketplace;
}

@JsonProperty("shipToStore")
public Boolean getShipToStore() {
return shipToStore;
}

@JsonProperty("shipToStore")
public void setShipToStore(Boolean shipToStore) {
this.shipToStore = shipToStore;
}

@JsonProperty("freeShipToStore")
public Boolean getFreeShipToStore() {
return freeShipToStore;
}

@JsonProperty("freeShipToStore")
public void setFreeShipToStore(Boolean freeShipToStore) {
this.freeShipToStore = freeShipToStore;
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

@JsonProperty("variants")
public List<Integer> getVariants() {
return variants;
}

@JsonProperty("variants")
public void setVariants(List<Integer> variants) {
this.variants = variants;
}

@JsonProperty("bestMarketplacePrice")
public BestMarketplacePrice getBestMarketplacePrice() {
return bestMarketplacePrice;
}

@JsonProperty("bestMarketplacePrice")
public void setBestMarketplacePrice(BestMarketplacePrice bestMarketplacePrice) {
this.bestMarketplacePrice = bestMarketplacePrice;
}

@JsonProperty("categoryNode")
public String getCategoryNode() {
return categoryNode;
}

@JsonProperty("categoryNode")
public void setCategoryNode(String categoryNode) {
this.categoryNode = categoryNode;
}

@JsonProperty("rhid")
public String getRhid() {
return rhid;
}

@JsonProperty("rhid")
public void setRhid(String rhid) {
this.rhid = rhid;
}

@JsonProperty("bundle")
public Boolean getBundle() {
return bundle;
}

@JsonProperty("bundle")
public void setBundle(Boolean bundle) {
this.bundle = bundle;
}

@JsonProperty("clearance")
public Boolean getClearance() {
return clearance;
}

@JsonProperty("clearance")
public void setClearance(Boolean clearance) {
this.clearance = clearance;
}

@JsonProperty("preOrder")
public Boolean getPreOrder() {
return preOrder;
}

@JsonProperty("preOrder")
public void setPreOrder(Boolean preOrder) {
this.preOrder = preOrder;
}

@JsonProperty("stock")
public String getStock() {
return stock;
}

@JsonProperty("stock")
public void setStock(String stock) {
this.stock = stock;
}

@JsonProperty("attributes")
public Attributes getAttributes() {
return attributes;
}

@JsonProperty("attributes")
public void setAttributes(Attributes attributes) {
this.attributes = attributes;
}

@JsonProperty("addToCartUrl")
public String getAddToCartUrl() {
return addToCartUrl;
}

@JsonProperty("addToCartUrl")
public void setAddToCartUrl(String addToCartUrl) {
this.addToCartUrl = addToCartUrl;
}

@JsonProperty("affiliateAddToCartUrl")
public String getAffiliateAddToCartUrl() {
return affiliateAddToCartUrl;
}

@JsonProperty("affiliateAddToCartUrl")
public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
this.affiliateAddToCartUrl = affiliateAddToCartUrl;
}

@JsonProperty("freeShippingOver35Dollars")
public Boolean getFreeShippingOver35Dollars() {
return freeShippingOver35Dollars;
}

@JsonProperty("freeShippingOver35Dollars")
public void setFreeShippingOver35Dollars(Boolean freeShippingOver35Dollars) {
this.freeShippingOver35Dollars = freeShippingOver35Dollars;
}

@JsonProperty("maxItemsInOrder")
public Integer getMaxItemsInOrder() {
return maxItemsInOrder;
}

@JsonProperty("maxItemsInOrder")
public void setMaxItemsInOrder(Integer maxItemsInOrder) {
this.maxItemsInOrder = maxItemsInOrder;
}


@JsonProperty("imageEntities")
public List<ImageEntity> getImageEntities() {
return imageEntities;
}

@JsonProperty("imageEntities")
public void setImageEntities(List<ImageEntity> imageEntities) {
this.imageEntities = imageEntities;
}

@JsonProperty("offerType")
public String getOfferType() {
return offerType;
}

@JsonProperty("offerType")
public void setOfferType(String offerType) {
this.offerType = offerType;
}

@JsonProperty("isTwoDayShippingEligible")
public Boolean getIsTwoDayShippingEligible() {
return isTwoDayShippingEligible;
}

@JsonProperty("isTwoDayShippingEligible")
public void setIsTwoDayShippingEligible(Boolean isTwoDayShippingEligible) {
this.isTwoDayShippingEligible = isTwoDayShippingEligible;
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