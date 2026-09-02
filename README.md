# Granora 📝 💰

API REST para controle de finanças pessoais simples, desenvolvida com Java e Spring Boot.

> 🚧 Projeto em desenvolvimento — funcionalidades sendo adicionadas aos poucos.

## Tecnologias

- Java 21
- Spring Boot 4
- Spring Security + JWT (Auth0 java-jwt)
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
2. Configure as variáveis de ambiente `DB_USUARIO`, `DB_SENHA`, `DB_HOST`, `DB_PORTA`, `DB_NOME` e `JWT_SECRET` (veja `application.properties`).
3. Rode a aplicação:

```bash
./mvnw spring-boot:run
```

### Autenticação
A API usa autenticação via token JWT:

1. Crie um usuário em POST /usuario.
2. Faça login em POST /login enviando apelido e senha — a resposta traz o token.
3. Envie esse token no header `Authorization: Bearer <token>` nas demais requisições.

## Métricas
<img alt="" src="https://github.com/EduardaStef/granora-backend/blob/feat/melhoria-esteira/github-metrics.svg"></img>