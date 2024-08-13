# Cadastro de Usuários com Singleton e Adapter

Este projeto demonstra a implementação de um sistema simples de dados de usuários em Java, utilizando os padrões de projeto Singleton e Adapter.

## Estrutura do Projeto

- **Database.java**: Implementa o padrão Singleton para garantir que apenas uma instância do banco de dados seja criada durante o ciclo de vida da aplicação.
- **User.java**: Classe de modelo que representa um usuário.
- **UserAdapter.java**: Implementa o padrão Adapter para adaptar o objeto `User` e fornecer métodos de acesso.
- **Client.java**: Classe principal que executa o exemplo.

## Requisitos

- Java 8 ou superior
- Biblioteca JDBC

## Diagrama e Classe

classDiagram
    class Database {
        -instance : Database
        -connection : Connection
        +getInstance() : Database
        +getConnection() : Connection
    }

    class User {
        -id : int
        -name : String
        -email : String
        +getId() : int
        +getName() : String
        +getEmail() : String
    }

    class UserAdapter {
        -user : User
        +UserAdapter(User user)
        +getUserId() : int
        +getUserName() : String
        +getUserEmail() : String
    }

    class Client {
        +main(args : String[]) : void
    }

    Database o-- UserAdapter : uses
    UserAdapter o-- User : adapts
    Client o-- Database : accesses







## Executando o Projeto

1. Clone este repositório:

    ```bash
    git clone https://github.com/seuusuario/Padroes-de-projetos.git
    ```

2. Compile o código:

    ```bash
    javac Client.java
    ```

3. Execute a aplicação:

    ```bash
    java Client
    ```

## Contribuição

Sinta-se à vontade para contribuir com este projeto enviando pull requests ou reportando problemas.

## Licença

Este projeto está licenciado sob os termos da MIT License. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
