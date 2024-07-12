package com.market.Ecomerce_Market.Persistence.Mapper;

import com.market.Ecomerce_Market.Domain.Category;
import com.market.Ecomerce_Market.Persistence.Entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target="productos", ignore= true)
    Categoria toCategoria(Category category);
}
