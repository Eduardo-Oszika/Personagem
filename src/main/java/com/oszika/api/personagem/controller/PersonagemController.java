package com.oszika.api.personagem.controller;

import com.oszika.api.personagem.model.Personagem;
import com.oszika.api.personagem.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
    private PersonagemRepository repository;

    @GetMapping
    public List<Personagem> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Personagem> criar(@RequestBody Personagem personagem) {
        Personagem salvo = repository.save(personagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}
