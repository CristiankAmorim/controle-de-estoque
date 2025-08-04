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

## 🧱 Estrutura de Classes

aplicacao/

└── Aplicacao.java | Classe principal com menu de interação

pecas/

├── Peca.java | Classe abstrata base

├── Acessorio.java | Subclasse para acessórios

├── RoupaTamanhoUnico.java | Subclasse para roupas com tamanho único

└── RoupaPMG.java | Implementação para roupas P, M, G

interfac/

└── Item.java | Interface com métodos padrão dos produtos

excecao/

└── EstoqueInsuficienteException.java | Exceção personalizada para vendas inválidas

## 🛠️ Tecnologias Utilizadas

-  ![Java](https://img.shields.io/badge/Java-%23ED8B00.svg??style=for-the-badge&logo=openjdk&logoColor=white) (JDK 17+)
- Paradigmas de POO: herança, polimorfismo, abstração;
- Scanner (entrada do usuário);
- Tratamento de exceções personalizadas.
