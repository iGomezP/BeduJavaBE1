package org.bedu.java.backend.ProyectoFinalModulo2.entity;


import com.opencsv.bean.CsvBindByName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="productos")
public class Producto{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 80)
	@CsvBindByName(column = "Nombre")
	private String name;

	@Column(name = "price", nullable = false)
	@CsvBindByName(column = "Precio")
	private int price;

	@Column(name="stock", nullable = false)
	@CsvBindByName(column = "Piezas")
	private int stock;

	@Enumerated(EnumType.STRING)
	@Column(name = "photo")
	@CsvBindByName(column = "Fotos")
	private Photo photo = Photo.NO;

	@Column(name = "layaway", nullable = false, length = 3)
	@CsvBindByName(column = "Apartado")
	private int layaway;

	@Column(name = "create_date")
	@CreationTimestamp
	private Date create_date;

	@Column(name = "last_update")
	@UpdateTimestamp
	private Date last_update;

	public enum Photo{
		SI, NO
	}
}
