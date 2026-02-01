-- liquibase formatted sql

-- changeset eduardo.oszika:1
CREATE TABLE personagem
(
    id       CHAR(36)     NOT NULL PRIMARY KEY,
    nome     VARCHAR(255) NOT NULL,
    idade    INT,
    historia TEXT
);