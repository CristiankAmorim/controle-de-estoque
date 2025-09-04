# Sistema de Controle de Estoque (Java)

Este é um projeto de aplicação console em Java, com o objetivo de aplicar os conceitos de **herança**, **polimorfismo**, **interfaces**, **tratamento de exceções** e **abstração**.

## 💡 Objetivo

Implementar um sistema de controle de estoque para diferentes tipos de produtos (acessórios e roupas), com gerenciamento de vendas, reposição automática e exibição de estoque final.

## 📦 Funcionalidades

- Registro de produtos de diferentes tipos;
- Menu interativo para vendas e reposição;
- Controle de estoque mínimo e máximo;
- Tratamento de exceções para vendas inválidas ou com estoque insuficiente;
- Interface `Item` padronizando os comportamentos dos produtos;
- Exibição do estoque final de todos os itens ao encerrar o sistema.


## 🛠️ Tecnologias Utilizadas

-  ![Java](https://img.shields.io/badge/Java-%23ED8B00.svg??style=for-the-badge&logo=openjdk&logoColor=white) (JDK 17+)
- Paradigmas de POO: herança, polimorfismo, abstração;
- Scanner (entrada do usuário);
- Tratamento de exceções personalizadas.


  ## 📊 Diagrama de Classes UML

```mermaid
classDiagram
    direction LR

    class Item {
        <<interface>>
        +venda()
        +estoqueFinal()
        +reposicaoDeEstoque()
    }

    class Peca {
        <<abstract>>
        -String descricao
        -int quantidade
        -int estoqueMinimo
        -int estoqueMaximo
        +Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo)
        +venda()*
        +reposicaoDeEstoque()
        +getDescricao()
        +getQuantidade()
        +setQuantidade(int quantidade)
    }

    class Acessorio {
        +Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo)
        +venda()
        +reposicaoDeEstoque()
        +estoqueFinal()
    }

    class RoupaTamanhoUnico {
        +RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo)
        +venda()
        +reposicaoDeEstoque()
        +estoqueFinal()
    }

    class RoupaPMG {
        -String descricao
        -int quantidadeP
        -int quantidadeM
        -int quantidadeG
        -int estoqueMinimo
        -int estoqueMaximo
        +RoupaPMG(String descricao, int qP, int qM, int qG, int estoqueMinimo, int estoqueMaximo)
        +venda()
        +reposicaoDeEstoque()
        +estoqueFinal()
    }

    class EstoqueInsuficienteException {
        +EstoqueInsuficienteException(String message)
    }

    class Aplicacao {
        +main(String[] args)
    }

    %% Relações
    Item <|.. Acessorio
    Item <|.. RoupaTamanhoUnico
    Item <|.. RoupaPMG

    Peca <|-- Acessorio
    Peca <|-- RoupaTamanhoUnico

