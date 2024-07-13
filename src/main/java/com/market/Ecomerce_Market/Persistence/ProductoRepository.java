package com.market.Ecomerce_Market.Persistence;

import com.market.Ecomerce_Market.Domain.Product;
import com.market.Ecomerce_Market.Domain.Repository.ProductRepository;
import com.market.Ecomerce_Market.Persistence.CRUD.ProductoCrudRepository;
import com.market.Ecomerce_Market.Persistence.Entity.Producto;
import com.market.Ecomerce_Market.Persistence.Mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

//    Tiene que ser de tipo Spring
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScaseProducts(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prod -> mapper.toProducts(prod));
    }

    @Override
    public Optional<List<Product>> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> Collections.singletonList(mapper.toProduct(producto)));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProdcuto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId){
        productoCrudRepository.deleteById(productId);
    }
}
