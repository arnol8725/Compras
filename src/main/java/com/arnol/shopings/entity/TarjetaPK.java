package com.arnol.shopings.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tarjeta database table.
 * 
 */
@Embeddable
public class TarjetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	//private static final long serialVersionUID = 1L;

	@Column(name="id_tarjeta")
	private int idTarjeta;

	@Column(name="id_banco", insertable=false, updatable=false)
	private int idBanco;

	public TarjetaPK() {
	}
	public int getIdTarjeta() {
		return this.idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public int getIdBanco() {
		return this.idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TarjetaPK)) {
			return false;
		}
		TarjetaPK castOther = (TarjetaPK)other;
		return 
			(this.idTarjeta == castOther.idTarjeta)
			&& (this.idBanco == castOther.idBanco);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTarjeta;
		hash = hash * prime + this.idBanco;
		
		return hash;
	}
}