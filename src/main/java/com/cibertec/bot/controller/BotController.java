package com.cibertec.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.bot.entity.Citas;
import com.cibertec.bot.repository.CitaRepository;
import com.cibertec.bot.repository.TipoCitaRepository;

@RestController
@RequestMapping("/rest")
public class BotController {

	@Autowired
	private CitaRepository repo;
	
	@Autowired
	private TipoCitaRepository tpRepo;
	
	@GetMapping("/listatipos")
	public ResponseEntity<?>listarTipos(){
		return ResponseEntity.ok(tpRepo.findAll());
	}
	
	@GetMapping("/listarcitas")
	public ResponseEntity<?>listarCitas(){
		return ResponseEntity.ok(repo.findAll());
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?>registrarCita(@RequestBody Citas cita){
		cita.setId_usuario(1);
		return ResponseEntity.ok(repo.save(cita));
	}
	
}
