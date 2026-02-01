-- liquibase formatted sql

-- changeset eduardo.oszika:2
CREATE TABLE usuarios
(
    id       CHAR(36)     NOT NULL PRIMARY KEY,
    login    VARCHAR(100) NOT NULL UNIQUE,
    senha    VARCHAR(255) NOT NULL,
    role     VARCHAR(20)  DEFAULT 'USER'
);