🛒 E-commerce API
🚀 API RESTful para um sistema de e-commerce desenvolvido com Spring Boot, Java, PostgreSQL e JWT Authentication.

📌 Índice
Tecnologias
Instalação
Configuração do Banco de Dados
Endpoints da API
Testando com Swagger
Autor
🛠 Tecnologias
Este projeto utiliza as seguintes tecnologias:
✅ Java 17
✅ Spring Boot 3
✅ Spring Security (JWT Authentication)
✅ Spring Data JPA
✅ PostgreSQL
✅ Swagger UI

⚙️ Instalação
1️⃣ Clone o repositório
bash
Copiar
Editar
git clone https://github.com/seu-usuario/ecommerce-api.git
cd ecommerce-api
2️⃣ Configure o Banco de Dados
Antes de rodar o projeto, crie um banco de dados no PostgreSQL:

sql
Copiar
Editar
CREATE DATABASE ecommerce;
Em seguida, edite o arquivo src/main/resources/application.properties para conectar ao banco:

properties
Copiar
Editar
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Rodando o projeto
Para iniciar a API, use o IntelliJ IDEA ou execute no terminal:

bash
Copiar
Editar
./gradlew bootRun
A API estará disponível em http://localhost:8080 🚀

📂 Estrutura do Projeto
bash
Copiar
Editar
ecommerce-api/
│── src/
│   ├── main/java/com/ecommerce/
│   │   ├── model/         # Modelos do banco de dados
│   │   ├── repository/    # Acesso ao banco de dados
│   │   ├── service/       # Regras de negócio
│   │   ├── controller/    # Endpoints da API
│   │   ├── security/      # Autenticação JWT
│   │   ├── EcommerceApplication.java  # Classe principal
│   ├── test/              # Testes unitários
│── build.gradle           # Dependências do projeto
│── application.properties # Configuração da aplicação
🔥 Endpoints da API
📌 Usuário (/users)
Método	Endpoint	Descrição
POST	/register	Registra um novo usuário
Exemplo de requisição:

json
Copiar
Editar
POST /users/register
{
  "username": "mateus",
  "password": "123456"
}
📌 Produtos (/products)
Método	Endpoint	Descrição
POST	/products	Adiciona um novo produto
GET	/products	Lista todos os produtos
Exemplo de requisição:

json
Copiar
Editar
POST /products
{
  "name": "Notebook Gamer",
  "description": "16GB RAM, SSD 512GB",
  "price": 5999.99
}
📌 Pedidos (/orders)
Método	Endpoint	Descrição
POST	/orders	Cria um novo pedido
GET	/orders/{id}	Lista pedidos por usuário
📖 Testando com Swagger
Acesse a documentação da API via Swagger UI:
🔗 http://localhost:8080/swagger-ui/index.html

👨‍💻 Autor
👤 Mateus Nobrega
📧 mateusnobrega180@gmail.com
