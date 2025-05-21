# Produtos 

Este projeto é uma aplicação RESTful desenvolvida com Spring Boot, focada no gerenciamento de produtos.  
Ele demonstra práticas avançadas de desenvolvimento backend, incluindo mapeamento JPA, integração com banco de dados e operações CRUD completas.

## Funcionalidades

- Persistência de produtos no banco de dados
- Criação de endpoints RESTful para operações CRUD
- Busca de produtos com parâmetros dinâmicos
- Execução de scripts SQL na inicialização da aplicação
- Configuração de conexão com o banco de dados

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (H2)
- Maven

##  Requisitos

- Java 17 instalado
- Maven 3.8+
- Banco de dados configurado (ou uso do H2 em memória)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Guiiferreira/Spring-Boot-Expert.git
   cd Spring-Boot-Expert
2. Configure o application.properties com as credenciais do seu banco de dados.
3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   
  ## Endpoints
POST /produtos – Cria um novo produto

GET /produtos – Lista todos os produtos

GET /produtos/{id} – Obtém detalhes de um produto específico

PUT /produtos/{id} – Atualiza um produto existente

DELETE /produtos/{id} – Remove um produto

GET /produtos/search?param=valor – Busca produtos com base em parâmetros
Reddit

## Estrutura do Projeto
Produto.java – Entidade JPA que representa o produto

ProdutoRepository.java – Interface para operações de banco de dados

ProdutoController.java – Controlador REST que gerencia as requisições

data.sql – Script SQL para popular o banco de dados na inicialização
