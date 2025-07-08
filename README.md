# 📋 Customer Manager - Desafio Técnico

Sistema completo de gerenciamento de clientes com backend em Java (Spring Boot 3.3+) e frontend em React/Next.js, seguindo boas práticas de arquitetura, modularização e responsividade. Projeto implementado com enfoque em qualidade de código, validação, SSR e organização.

---

## 🚀 Tecnologias Utilizadas

### Backend
- Java 17+
- Spring Boot 3.3.13
- Bean Validation
- Banco de dados H2 (em memória)
- Maven ou Gradle

- ## 📌 Funcionalidades

### Backend (API)
- `POST /clientes` – Cadastrar novo cliente
- `GET /clientes` – Listar todos os clientes
- `GET /clientes/{id}` – Obter detalhes de um cliente por ID

---
### Json para cadastro de cliente
```json
{
  "id": "UUID",
  "nome": "João Silva",
  "email": "joao@email.com",
  "dataNascimento": "1990-01-01"
}
```
### Como executar

- cd customer-manager 

- ./mvnw clean install

- ./mvnw spring-boot:run