# Projeto de Formulário Java Swing para CRUD de Cidades

Este é um projeto de exemplo que demonstra a criação de um aplicativo de desktop Java Swing para realizar operações CRUD em informações de cidades, incluindo nome, CEP e um ID exclusivo. Os dados são armazenados em um banco de dados MySQL.

## Funcionalidades

O aplicativo possui as seguintes funcionalidades:

- **Cadastrar**: Adicione informações de uma nova cidade, incluindo nome e CEP.
- **Listar**: Exiba uma lista de todas as cidades cadastradas, mostrando nome, CEP e ID.
- **Editar**: Atualize as informações de uma cidade existente.
- **Excluir**: Remova uma cidade da lista.

## Tecnologias Utilizadas

- Java Swing: Para a criação da interface gráfica.
- Java: A linguagem de programação utilizada.
- MySQL: O banco de dados utilizado para armazenar os dados das cidades.

## Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
- Ambiente de desenvolvimento Java, como [Eclipse](https://www.eclipse.org/ide/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/).
- [MySQL](https://www.mysql.com/) instalado e configurado.

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `provaa2`:

   ```sql
   CREATE DATABASE provaa2;
   USE provaa2;
  
    CREATE TABLE cidades (
        cidID INT PRIMARY KEY AUTO_INCREMENT,
        cidNome VARCHAR(255) NOT NULL,
        cidCep VARCHAR(10) NOT NULL
    );
   ```
 ## Como Executar o Projeto

1. Clone este repositório para sua máquina local usando o comando:
  git clone https://github.com/Lupescoder/Java-Swing.git

2. Abra o projeto em seu ambiente de desenvolvimento Java.

3. Configure as informações de conexão com o banco de dados no código-fonte, incluindo URL, usuário e senha do banco de dados MySQL.

4. Execute o aplicativo a partir do arquivo principal (`prova.java` ou similar).

5. O aplicativo será iniciado, e a interface de usuário Swing será exibida. Os dados serão armazenados no banco de dados MySQL.
