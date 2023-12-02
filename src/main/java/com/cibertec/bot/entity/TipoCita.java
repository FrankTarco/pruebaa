package com.cibertec.bot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipocita")
public class TipoCita {

	@Id
	private int id_tipo_cita;
	private String nombre;
	
}
