package com.oszika.api.personagem.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Data
@Entity
@Table(name = "personagem")
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id; // O Hibernate converterá automaticamente para o CHAR(36)

    @Column(nullable = false)
    private String nome;

    private Integer idade;

    @Column(columnDefinition = "TEXT")
    private String historia;
}