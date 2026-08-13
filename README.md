# Granora 📝 💰
API REST para controle de finanças pessoais simples, desenvolvida com Java e Spring Boot.

> 🚧 Projeto em desenvolvimento — funcionalidades sendo adicionadas aos poucos.

### Status
[![Fluxo CI](https://github.com/EduardaStef/granora-backend/actions/workflows/workflow.yml/badge.svg)](https://github.com/EduardaStef/granora-backend/actions/workflows/workflow.yml)

## Tecnologias

- Java 21
- Spring Boot 4
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Como rodar o projeto

### Pré-requisitos
- Java 21+
- Maven
- PostgreSQL rodando localmente

### Configuração

1. Crie um banco chamado `granora` no PostgreSQL.
2. Configure as variáveis de ambiente `DB_USUARIO`, `DB_SENHA` e `DB_URL` (veja `application.properties`).
3. Rode a aplicação:

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.
