package com.product.repository.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.inventory.wm.model.Item;
@Repository
public interface InventoryRepository extends JpaRepository<Item,Long>{

}
