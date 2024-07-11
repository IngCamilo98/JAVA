package com.market.Ecomerce_Market.Persistence;

import com.market.Ecomerce_Market.Persistence.CRUD.ProductoCrudRepository;
import com.market.Ecomerce_Market.Persistence.Entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
