package com.cibertec.bot.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="citas")
public class Citas {

	@Id
	private int id_cita;
	private double altura;
	private int dni;
	private int estado;
	private Date fecha;
	private double peso;
	private String sexo;
	private int id_tipo_cita;
	private int id_usuario;
	
	@ManyToOne
	@JoinColumn(name="id_usuario",insertable = false,updatable = false)
	private Usuario objUsuario;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_cita",insertable = false,updatable = false)
	private TipoCita objTipoCita;
}
