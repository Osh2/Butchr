package com.codeclan.butchr.repositories;

import com.codeclan.butchr.models.stock.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

//    List<Item> findByItemType(String type);
}
