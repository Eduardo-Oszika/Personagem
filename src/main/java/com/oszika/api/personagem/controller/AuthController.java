package com.oszika.api.personagem.controller;

import com.oszika.api.personagem.infra.security.TokenService;
import com.oszika.api.personagem.model.Usuario;
import com.oszika.api.personagem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository repository; // Você precisa criar essa interface vazia estendendo JpaRepository

    @Autowired
    private TokenService tokenService;

    // DTO para receber os dados (pode criar em arquivo separado)
    public record DadosLogin(String login, String senha) {
    }

    // DTO para devolver o token
    public record DadosTokenJWT(String token) {
    }

    @PostMapping("/login")
    public ResponseEntity efetuarLogin(@RequestBody DadosLogin dados) {

        Optional<Usuario> usuarioOptinal = repository.findByLogin(dados.login());


        if (usuarioOptinal.isPresent()) {
            Usuario usuario = usuarioOptinal.get();

            if (usuario.getSenha().equals(dados.senha())) {
                var token = tokenService.gerarToken(usuario);
                return ResponseEntity.ok(new DadosTokenJWT(token));
            }
        }

        return ResponseEntity.status(403).body("Usuário ou senha inválidos");
    }
}