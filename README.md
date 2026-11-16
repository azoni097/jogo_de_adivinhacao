<div align="center">

# 🎯 Jogo de Adivinhação em Java

**Um jogo de console desenvolvido em Java puro, com código modularizado e os primeiros passos em Programação Orientada a Objetos.**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow?style=for-the-badge)
![Licença](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)
![Plataforma](https://img.shields.io/badge/Plataforma-Console-blue?style=for-the-badge)

</div>

---

## 📑 Sumário

- [Sobre o projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias e conceitos aplicados](#-tecnologias-e-conceitos-aplicados)
- [Estrutura do projeto](#-estrutura-do-projeto)
- [Como executar](#-como-executar)
- [Como jogar](#-como-jogar)
- [Exemplo de execução](#-exemplo-de-execução)
- [Decisões de design](#-decisões-de-design)
- [Roadmap](#-roadmap)
- [Aprendizados](#-aprendizados)
- [Como contribuir](#-como-contribuir)
- [Licença](#-licença)
- [Autor](#-autor)

---

## 📖 Sobre o projeto

O **Jogo de Adivinhação** é uma aplicação de console em que o computador sorteia um número secreto e o jogador precisa descobri-lo em um número limitado de tentativas, recebendo dicas de "maior" ou "menor" a cada palpite.

O projeto foi construído **exclusivamente com Java**, sem frameworks ou bibliotecas externas, com o objetivo de praticar e demonstrar:

- Lógica de programação e estruturas de controle;
- Entrada de dados pelo teclado com `Scanner`;
- Armazenamento dinâmico de dados com `ArrayList`;
- **Modularização** do código em métodos e classes com responsabilidades bem definidas;
- Os **primeiros conceitos de Programação Orientada a Objetos (POO)**.

---

## ✨ Funcionalidades

- 🎲 Sorteio de um número secreto a cada partida;
- ⌨️ Leitura dos palpites do jogador via `Scanner`;
- 💡 Dicas após cada tentativa (o número é maior ou menor);
- 📋 Histórico de palpites armazenado em um `ArrayList`;
- 🔁 Opção de jogar novamente sem reiniciar o programa;
- 🛡️ Validação de entradas inválidas (letras, valores fora do intervalo etc.);
- 🧩 Código organizado em módulos, facilitando manutenção e evolução.

---

## 🛠 Tecnologias e conceitos aplicados

| Categoria | Detalhes |
|---|---|
| **Linguagem** | Java 17+ (compatível com versões anteriores a partir do Java 8) |
| **Entrada de dados** | `java.util.Scanner` |
| **Coleções** | `java.util.ArrayList` (lista dinâmica) |
| **Aleatoriedade** | `java.util.Random` |
| **Paradigma** | Programação estruturada + início de POO |
| **Organização** | Código modularizado (métodos e classes com responsabilidade única) |

### Conceitos de POO presentes

- **Classes e objetos**
- **Encapsulamento** (atributos privados com getters/setters)
- **Construtores**
- **Separação de responsabilidades** entre lógica do jogo e interface com o usuário

---

## 📂 Estrutura do projeto

> ⚠️ Ajuste a árvore abaixo para refletir exatamente a organização do seu repositório.

```
jogo-de-adivinhacao/
│
├── src/
│   ├── Main.java          # Ponto de entrada da aplicação
│   ├── Jogo.java          # Lógica principal do jogo (sorteio, validação, tentativas)
│   ├── Jogador.java       # Representa o jogador (nome, histórico de palpites)
│   └── Utils.java         # Métodos auxiliares (leitura, validação, formatação)
│
├── .gitignore
├── LICENSE
└── README.md
```

### Responsabilidade de cada módulo

| Arquivo | Responsabilidade |
|---|---|
| `Main.java` | Inicia o programa e controla o fluxo geral (menu / jogar novamente) |
| `Jogo.java` | Gera o número secreto, compara palpites e controla as tentativas |
| `Jogador.java` | Guarda os dados do jogador e a lista de palpites (`ArrayList<Integer>`) |
| `Utils.java` | Funções reutilizáveis de entrada e validação |

---

## 🚀 Como executar

### Pré-requisitos

- [JDK 8 ou superior](https://adoptium.net/) instalado
- Git (opcional, para clonar o repositório)

Para verificar se o Java está instalado:

```bash
java -version
javac -version
```

### Passo a passo

**1. Clone o repositório**

```bash
git clone https://github.com/SEU-USUARIO/jogo-de-adivinhacao.git
cd jogo-de-adivinhacao
```

**2. Compile os arquivos**

```bash
javac -d bin src/*.java
```

**3. Execute o jogo**

```bash
java -cp bin Main
```

### Executando em uma IDE

Também é possível abrir o projeto no **IntelliJ IDEA**, **Eclipse** ou **VS Code** (com o *Extension Pack for Java*) e executar a classe `Main`.

---

## 🎮 Como jogar

1. Inicie o programa;
2. O computador sorteia um número secreto dentro de um intervalo definido;
3. Digite o seu palpite e pressione **Enter**;
4. O jogo informa se o número secreto é **maior** ou **menor** que o palpite;
5. Continue até acertar ou até acabarem as tentativas;
6. Ao final, veja o histórico dos seus palpites e escolha se deseja jogar novamente.

---

## 💻 Exemplo de execução

```text
=====================================
      JOGO DE ADIVINHAÇÃO
=====================================
Estou pensando em um número entre 1 e 100.
Você tem 7 tentativas. Boa sorte!

Tentativa 1/7 - Digite seu palpite: 50
📉 Muito alto! Tente um número menor.

Tentativa 2/7 - Digite seu palpite: 25
📈 Muito baixo! Tente um número maior.

Tentativa 3/7 - Digite seu palpite: 37
🎉 Parabéns! Você acertou em 3 tentativas!

Seus palpites: [50, 25, 37]

Deseja jogar novamente? (s/n):
```

> 💡 Dica: substitua o exemplo acima por um print real do seu terminal ou por um GIF da partida.

---

## 🧠 Decisões de design

- **Modularização:** cada parte do código possui uma única responsabilidade, o que torna o programa mais legível, testável e fácil de expandir.
- **`ArrayList` em vez de array fixo:** o histórico de palpites cresce dinamicamente conforme o jogador faz tentativas, sem necessidade de definir o tamanho previamente.
- **Início de POO:** a lógica do jogo e os dados do jogador foram separados em classes, preparando o projeto para evoluções como herança, interfaces e polimorfismo.
- **Validação de entrada:** o programa trata entradas inesperadas para evitar que o jogo seja encerrado por erros de digitação.

---

## 🗺 Roadmap

- [x] Jogo funcional no console
- [x] Uso de `Scanner` e `ArrayList`
- [x] Código modularizado
- [x] Primeiros conceitos de POO
- [ ] Níveis de dificuldade (fácil, médio, difícil)
- [ ] Sistema de pontuação e ranking
- [ ] Salvar histórico de partidas em arquivo
- [ ] Aplicar herança e polimorfismo (ex.: diferentes modos de jogo)
- [ ] Tratamento de exceções personalizado
- [ ] Testes unitários com JUnit
- [ ] Interface gráfica (Swing ou JavaFX)

---

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, foram praticados:

- Estruturas condicionais e de repetição (`if`, `while`, `do-while`);
- Manipulação de coleções com `ArrayList`;
- Leitura e validação de dados do usuário;
- Criação e uso de classes, objetos e métodos;
- Boas práticas de organização e legibilidade de código;
- Versionamento com Git e documentação com Markdown.

---

## 🤝 Como contribuir

Contribuições, sugestões e feedbacks são muito bem-vindos!

1. Faça um **fork** do projeto;
2. Crie uma branch para sua feature: `git checkout -b feature/minha-feature`;
3. Faça o commit das alterações: `git commit -m "feat: adiciona minha feature"`;
4. Envie para a sua branch: `git push origin feature/minha-feature`;
5. Abra um **Pull Request**.

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

**Seu Nome**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/SEU-PERFIL)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/SEU-USUARIO)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:seuemail@exemplo.com)

---

<div align="center">

⭐ Se este projeto foi útil ou interessante, deixe uma estrela no repositório!

</div>
