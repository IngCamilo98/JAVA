package com.market.Ecomerce_Market.Persistence.CRUD;

import com.market.Ecomerce_Market.Persistence.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


}
