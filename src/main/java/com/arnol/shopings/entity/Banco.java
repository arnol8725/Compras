package com.arnol.shopings.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the banco database table.
 * 
 */
@Entity
@Table(name="banco")
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idBanco")
	@GeneratedValue
	private int idBanco;

	@Column(name="descBanco")
	private String descBanco;

	//bi-directional many-to-one association to Tarjeta
	
	@OneToMany(fetch= FetchType.EAGER,mappedBy="id_banco")
	private Set<Tarjeta> tarjetas = new HashSet<Tarjeta>();
	
	

	public Banco() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Banco(int idBanco, String descBanco, Set<Tarjeta> tarjetas) {
		super();
		this.idBanco = idBanco;
		this.descBanco = descBanco;
		this.tarjetas = tarjetas;
	}



	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getDescBanco() {
		return descBanco;
	}

	public void setDescBanco(String descBanco) {
		this.descBanco = descBanco;
	}

	public Set<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Set<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}