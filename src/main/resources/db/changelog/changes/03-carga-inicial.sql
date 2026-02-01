-- liquibase formatted sql

-- changeset eduardo.oszika:3
-- Inserindo Usuario Admin
-- NOTA: A senha está como 'admin' (texto puro).
-- Se configurarmos BCrypt no Spring Security depois, precisaremos atualizar para o hash.
INSERT INTO usuarios (id, login, senha, role)
VALUES ('123e4567-e89b-12d3-a456-426614174000', 'admin', 'admin', 'ADMIN');

-- Inserindo Personagens de Hunter x Hunter

-- Gon Freecss
INSERT INTO personagem (id, nome, idade, historia)
VALUES ('a1b2c3d4-e5f6-7890-1234-56789abcdef0', 'Gon Freecss', 12, 'Um garoto otimista que busca encontrar seu pai, Ging. Possui olfato apurado e usa a técnica Jajanken (Pedra, Papel e Tesoura). Tipo de Nen: Reforço.');

-- Killua Zoldyck
INSERT INTO personagem (id, nome, idade, historia)
VALUES ('b2c3d4e5-f678-9012-3456-7890abcdef01', 'Killua Zoldyck', 12, 'Ex-assassino de elite da família Zoldyck e melhor amigo de Gon. É imune a venenos e transuta sua aura em eletricidade (Godspeed). Tipo de Nen: Transformação.');

-- Kurapika
INSERT INTO personagem (id, nome, idade, historia)
VALUES ('c3d4e5f6-7890-1234-5678-90abcdef0123', 'Kurapika', 17, 'O último sobrevivente do clã Kurta. Busca recuperar os Olhos Escarlates de seu povo. Usa correntes conjuradas com diferentes habilidades. Tipo de Nen: Materialização (Especialista quando os olhos ficam vermelhos).');

-- Leorio Paradinight
INSERT INTO personagem (id, nome, idade, historia)
VALUES ('d4e5f678-9012-3456-7890-abcdef012345', 'Leorio Paradinight', 19, 'Estudante de medicina que quer ser médico para ajudar os pobres. Possui grande força física e projeta seus golpes através de portais. Tipo de Nen: Emissão.');

-- Hisoka Morow
INSERT INTO personagem (id, nome, idade, historia)
VALUES ('e5f67890-1234-5678-90ab-cdef01234567', 'Hisoka Morow', 28, 'Um mágico enigmático e lutador excepcional que busca oponentes fortes. Sua habilidade principal é a Bungee Gum, que possui propriedades de goma e borracha. Tipo de Nen: Transformação.');