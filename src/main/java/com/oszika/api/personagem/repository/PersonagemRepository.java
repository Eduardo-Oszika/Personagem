package com.oszika.api.personagem.repository;

import com.oszika.api.personagem.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, UUID> {
}
