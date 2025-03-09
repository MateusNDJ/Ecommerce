#  E-commerce API

Uma API RESTful robusta para um sistema de e-commerce, desenvolvida com Spring Boot 3, Java 17, PostgreSQL e autenticação JWT.

##  Visão Geral

Esta API fornece funcionalidades essenciais para um sistema de e-commerce, incluindo gerenciamento de usuários, produtos e pedidos. A autenticação JWT garante a segurança das operações, e o Swagger UI facilita a exploração e teste dos endpoints.

## ️ Tecnologias

* **Java 17:** Linguagem de programação principal.
* **Spring Boot 3:** Framework para desenvolvimento rápido de aplicações Java.
* **Spring Security:** Para autenticação e autorização com JWT.
* **Spring Data JPA:** Para persistência de dados com PostgreSQL.
* **PostgreSQL:** Banco de dados relacional.
* **Swagger UI:** Para documentação e teste da API.
* **Gradle:** Sistema de build.

## ⚙️ Instalação

1.  **Clone o repositório:**

    ```bash
    git clone [https://github.com/seu-usuario/ecommerce-api.git](https://github.com/seu-usuario/ecommerce-api.git)
    cd ecommerce-api
    ```

2.  **Configure o banco de dados:**

    * Crie um banco de dados `ecommerce` no PostgreSQL.
    * Edite `src/main/resources/application.properties` com suas credenciais:

        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
        spring.datasource.username=seu-usuario
        spring.datasource.password=sua-senha
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        ```

3.  **Execute a aplicação:**

    * Usando o IntelliJ IDEA, execute a classe `EcommerceApplication.java`.
    * Ou, via terminal, execute `./gradlew bootRun`.

    A API estará disponível em `http://localhost:8080`.

##  Estrutura do Projeto
