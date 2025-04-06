# Reserva de Salas — Microsserviços

Este projeto é um sistema de **reserva de salas**, desenvolvido com arquitetura baseada em **microsserviços**. Ele é dividido em três serviços principais:

- `usuario-service`: gerenciamento de usuários
- `sala-service`: cadastro de salas disponíveis
- `reserva-service`: criação de reservas de salas

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- PostgreSQL
- Docker & Docker Compose
- HTML + JS
- Lombok

---

## Estrutura de Microsserviços

Cada serviço roda de forma isolada com seu próprio banco de dados:

- `usuario-service`: porta `8091`, banco `user_usuarios`
- `sala-service`: porta `8092`, banco `user_salas`
- `reserva-service`: porta `8093`, banco `user_reservas`
- `frontend-service`: porta `8080`, interface simples para testes

Todos os serviços se comunicam via REST e rodam em containers separados.

---

## Como executar o projeto

### Pré-requisitos

- Docker
- Docker Compose

### Subir o projeto

```bash
docker compose up --build
