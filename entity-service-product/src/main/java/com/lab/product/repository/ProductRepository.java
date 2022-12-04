package com.lab.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.product.entity.Category;
import com.lab.product.entity.Product;

import java.util.List;

//extends: hereda todo el contenido de una clase dentro de la clase a la que se le aplica extends
	//(todo no depende de private)

//JpaRepository = Metodos de acceso a BD
//JpaRepository<Entidad, Tipo de llave primaria>
public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findByCategory(Category category);
	
}
