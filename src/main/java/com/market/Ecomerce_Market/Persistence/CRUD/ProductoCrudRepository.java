package com.market.Ecomerce_Market.Persistence.CRUD;

import com.market.Ecomerce_Market.Persistence.Entity.Categoria;
import com.market.Ecomerce_Market.Persistence.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
