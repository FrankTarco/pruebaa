package com.cibertec.bot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@Column(name="id")
	private int id_usuario;
	private String apellido;
	private String email;
	private int enabled;
	private String nombre;
	private String password;
	private String perfil;
	private String telefono;
	private String username;
}
