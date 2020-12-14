package com.product.inventory.wm.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.inventory.wm.model.Item;
import com.product.inventory.wm.serviceImpl.WalmartServiceImpl;
import com.product.repository.inventory.InventoryRepository;
import com.product.repository.inventory.ItemRepository;

@RestController
@RequestMapping(value = "products")
public class InventoryController {
	@Autowired
	WalmartServiceImpl walmartService = new WalmartServiceImpl();
	@Autowired
	private InventoryRepository inventoryRepository;

	@Autowired
	private ItemRepository itemRepository;

	@GetMapping(path = "/getItemDetailsByUPC", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> getItemDetailsUPC(@RequestParam String UPC) {
		Item item;
		if (!itemRepository.findByUPC(UPC).isEmpty()) {
			item = itemRepository.findByUPC(UPC).get(0);
		} else {
			item = walmartService.getProductInfoByUPC(UPC).getItems().get(0);
		}
		return ResponseEntity.ok().body(item);
	}

	@PostMapping(path = "/addItem")
	public @ResponseBody String addNewUser(@RequestBody Item item, @RequestParam int quantityAdd) {

		if (itemRepository.findByUPC(item.getUpc()).isEmpty()) {

			try {

				URL url = new URL(item.getThumbnailImage());
				InputStream is = url.openStream();
				byte[] buff = new byte[8000];

				int bytesRead = 0;

				ByteArrayOutputStream bao = new ByteArrayOutputStream();

				while ((bytesRead = is.read(buff)) != -1) {
					bao.write(buff, 0, bytesRead);
				}

				item.setThumbnailImage(getEncodedImage(item.getThumbnailImage()));
				item.setMediumImage(getEncodedImage(item.getMediumImage()));
				item.setLargeImage(getEncodedImage(item.getLargeImage()));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			item.setQuantity(quantityAdd);
			inventoryRepository.save(item);
		}else {
			Item dbItem = itemRepository.findByUPC(item.getUpc()).get(0);
			int endQuantity = dbItem.getQuantity() + quantityAdd;
			item.setItemId(dbItem.getItemId());
			item.setQuantity(endQuantity);
			itemRepository.save(item);
			
		}
		
		return "Saved";
	}

	public void updateItemQuantity(String UPC, int quantityAdd) {
		
	}

	private String getEncodedImage(String urlString) throws IOException {
		URL url = new URL(urlString);
		InputStream is = url.openStream();
		byte[] buff = new byte[8000];

		int bytesRead = 0;

		ByteArrayOutputStream bao = new ByteArrayOutputStream();

		while ((bytesRead = is.read(buff)) != -1) {
			bao.write(buff, 0, bytesRead);
		}

		byte[] data = bao.toByteArray();
		return Base64.getEncoder().encodeToString(data);
	}

}
