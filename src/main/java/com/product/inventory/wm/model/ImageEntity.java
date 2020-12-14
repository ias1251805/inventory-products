package com.product.inventory.wm.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"thumbnailImage",
"mediumImage",
"largeImage",
"entityType"
})
public class ImageEntity {

@JsonProperty("thumbnailImage")
private String thumbnailImage;
@JsonProperty("mediumImage")
private String mediumImage;
@JsonProperty("largeImage")
private String largeImage;
@JsonProperty("entityType")
private String entityType;

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

@JsonProperty("entityType")
public String getEntityType() {
return entityType;
}

@JsonProperty("entityType")
public void setEntityType(String entityType) {
this.entityType = entityType;
}

}