<div align="center">

# 🎯 Jogo de Adivinhação em Java

**Um jogo de console desenvolvido em Java puro, com código modularizado e os primeiros passos em Programação Orientada a Objetos.**

</div>
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

---

### Executando em uma IDE

Execute o projeto no **IntelliJ IDEA**, **Eclipse** ou **VS Code** (com o *Extension Pack for Java*) e executar a classe `Main`.

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


---

## 🗺 Roadmap

- [x] Jogo funcional no console
- [x] Uso de `Scanner` e `ArrayList`
- [x] Código modularizado
- [x] Primeiros conceitos de POO
- [x] Níveis de dificuldade (fácil, médio, difícil)
- [ ] Sistema de pontuação e ranking
- [ ] Salvar histórico de partidas em arquivo
- [ ] Aplicar herança e polimorfismo (ex.: diferentes modos de jogo)
- [ ] Tratamento de exceções personalizado
- [ ] Interface gráfica (Swing ou JavaFX)

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

**Vitória Azoni Amaral**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/SEU-PERFIL)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/SEU-USUARIO)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:seuemail@exemplo.com)

---

<div align="center">

⭐ Se este projeto foi útil ou interessante, deixe uma estrela no repositório!

</div>
