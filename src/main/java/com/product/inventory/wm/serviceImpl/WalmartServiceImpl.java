package com.product.inventory.wm.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.product.inventory.wm.model.WMResponseByUPC;
@Service
public class WalmartServiceImpl {
	
	@Value("${wm.apikey}")
    private String wmApiKey;
	public WMResponseByUPC getProductInfoByUPC(String UPC) {

		RestTemplate restTemplate = new RestTemplate();
		WMResponseByUPC response = restTemplate.getForObject(
				"http://api.walmartlabs.com/v1/items?apiKey={apikey}&upc={upc}", WMResponseByUPC.class,
				wmApiKey, UPC);

		return response;

	}
}
