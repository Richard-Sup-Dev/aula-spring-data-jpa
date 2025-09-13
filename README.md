# Aula Spring Data JPA: Persistência de Dados em Java

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-white?style=for-the-badge&logo=spring&logoColor=6DB33F)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

### Descrição do Projeto

Este projeto é um exemplo de aplicação em **Spring Boot** focado no aprendizado do **Spring Data JPA**. Ele demonstra como conectar uma aplicação Java a um banco de dados **PostgreSQL**, criar uma entidade (`User`) e usar um repositório para realizar operações de persistência de dados (salvar, buscar, etc.) de forma simplificada.

O código inicializa a conexão com o banco de dados e executa uma operação de salvamento de um usuário ao iniciar a aplicação, utilizando o `CommandLineRunner`.

### Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.2.5
- **Persistência:** Spring Data JPA
- **Banco de Dados:** PostgreSQL
- **Gerenciador de Dependências:** Apache Maven
- **Ferramentas:** Lombok

### Como Rodar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Richard-Sup-Dev/aula-spring-data-jpa.git](https://github.com/Richard-Sup-Dev/aula-spring-data-jpa.git)
    ```
2.  **Configure o Banco de Dados:**
    * Abra o arquivo `src/main/resources/application.properties`.
    * Substitua as informações de conexão com o seu banco de dados PostgreSQL.

3.  **Execute a Aplicação:**
    * Abra o projeto no IntelliJ IDEA.
    * Execute a classe `AulaSpringDataJpaApplication.java`.

### Estrutura do Projeto
