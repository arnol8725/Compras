package com.arnol.shopings.entity;

import java.io.Serializable;
import javax.persistence.*;




/**
 * The persistent class for the tarjeta database table.
 * 
 */
@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TarjetaPK id;
	
	@Column(name="desc_tarjeta")
	private String descTarjeta;
	
	@ManyToOne
	@JoinColumn(name="id_banco",insertable=false, updatable=false)
	private Banco id_banco;
		

}