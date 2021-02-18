package com.codeclan.butchr.repositories;

import com.codeclan.butchr.models.stock.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
