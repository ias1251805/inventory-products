package com.product.inventory.wm.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"compositeWood",
"mainimageurl",
"replenishmentStartDate"
})

public class Attributes {

@JsonProperty("compositeWood")
private String compositeWood;
@JsonProperty("mainimageurl")
private String mainimageurl;
@JsonProperty("replenishmentStartDate")
private String replenishmentStartDate;

@JsonProperty("compositeWood")
public String getCompositeWood() {
return compositeWood;
}

@JsonProperty("compositeWood")
public void setCompositeWood(String compositeWood) {
this.compositeWood = compositeWood;
}

@JsonProperty("mainimageurl")
public String getMainimageurl() {
return mainimageurl;
}

@JsonProperty("mainimageurl")
public void setMainimageurl(String mainimageurl) {
this.mainimageurl = mainimageurl;
}

@JsonProperty("replenishmentStartDate")
public String getReplenishmentStartDate() {
return replenishmentStartDate;
}

@JsonProperty("replenishmentStartDate")
public void setReplenishmentStartDate(String replenishmentStartDate) {
this.replenishmentStartDate = replenishmentStartDate;
}

}