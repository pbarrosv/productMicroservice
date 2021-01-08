package com.springboot.app.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
