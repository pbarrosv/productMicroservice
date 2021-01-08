package com.springboot.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.productos.models.entity.Producto;
import com.springboot.app.productos.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository productoRepo;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoRepo.findById(id).orElse(null);
	}

}
