package com.lab.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_products")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Product {

	@Id //Llave Primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto generacion de los valores de la llave primaria
	private Long id;
	private String name;
	private String description;
	private Double stock;
	private Double price;
	private String status;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP) //Trabajar con fechas TIMESTAMP = Fecha y hora
	private Date createAt;
	
	//Relacion muchos a uno, LAZY = cargar cuando sea necesario
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id") //Mapeo de columnas
	private Category category;
	
}
