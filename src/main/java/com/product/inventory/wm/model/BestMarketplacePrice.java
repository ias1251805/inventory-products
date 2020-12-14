package com.product.inventory.wm.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"price",
"sellerInfo",
"standardShipRate",
"availableOnline",
"clearance"
})

public class BestMarketplacePrice {

@JsonProperty("price")
private Double price;
@JsonProperty("sellerInfo")
private String sellerInfo;
@JsonProperty("standardShipRate")
private Double standardShipRate;
@JsonProperty("availableOnline")
private Boolean availableOnline;
@JsonProperty("clearance")
private Boolean clearance;

@JsonProperty("price")
public Double getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(Double price) {
this.price = price;
}

@JsonProperty("sellerInfo")
public String getSellerInfo() {
return sellerInfo;
}

@JsonProperty("sellerInfo")
public void setSellerInfo(String sellerInfo) {
this.sellerInfo = sellerInfo;
}

@JsonProperty("standardShipRate")
public Double getStandardShipRate() {
return standardShipRate;
}

@JsonProperty("standardShipRate")
public void setStandardShipRate(Double standardShipRate) {
this.standardShipRate = standardShipRate;
}

@JsonProperty("availableOnline")
public Boolean getAvailableOnline() {
return availableOnline;
}

@JsonProperty("availableOnline")
public void setAvailableOnline(Boolean availableOnline) {
this.availableOnline = availableOnline;
}

@JsonProperty("clearance")
public Boolean getClearance() {
return clearance;
}

@JsonProperty("clearance")
public void setClearance(Boolean clearance) {
this.clearance = clearance;
}

}