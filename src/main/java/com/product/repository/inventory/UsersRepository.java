package com.product.repository.inventory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.inventory.wm.model.Users;
@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{
	@Query("FROM Users WHERE email=?1")
	Users findByEmail(String email);
}
