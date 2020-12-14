package com.product.repository.inventory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.inventory.wm.model.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{
	@Query("FROM Item WHERE upc=?1")
	List<Item> findByUPC(String UPC);
}
