# 📝 Gerenciador de Tarefas em Java

Este projeto foi desenvolvido como **teste técnico** para uma **vaga de Desenvolvedor Back-end Java**.  
Trata-se de um gerenciador de tarefas simples feito em **Java puro**, utilizando o padrão de **camadas** (models, regras de negócio e interface).

## 📌 Funcionalidades

- Criar uma nova lista de tarefas
- Adicionar tarefas com descrição
- Listar todas as tarefas
- Alterar o status da tarefa (pendente, andamento, concluído)
- Alterar a descrição da tarefa
- Remover tarefas
- Menu interativo via terminal

## 📦 Estrutura do Projeto

```bash
.
├── models/
│   └── Tarefa.java
├── rn/
│   └── TarefasRn.java
├── enums/
│   └── TarefaStatusEnum.java
├── ListaTarefas.java

```

- **models/Tarefa.java:** Representa o modelo de uma tarefa.

- **rn/TarefasRn.java:** Contém as regras de negócio da aplicação.

- **ListaTarefas.java:** Classe principal com o menu e execução do programa.

## ✅ Como Executar

### 1.Clone o repositório:

```bash

git clone https://github.com/daniilooo/gerenciadordetarefas.git

```

### 2. Compile os arquivos:

```bash

javac .\rn\TarefasRn.java .\models\Tarefa.java .\listaTarefas.java

```

### 3. Execute o programa:

```bash

java listaTarefas

```

## 🧠 O que foi avaliado nesse teste?

- Organização do código
- Separação de responsabilidades (modelo, regra de negócio, interface)
- Uso de boas práticas
- Uso correto de listas, entrada de dados e estruturas de controle

## 🧪 Tecnologias

- Java 8+
- Console (interface via terminal)
- Java Collections (List, ArrayList)
- Scanner para leitura de entrada

## ❗ Observações

> Projeto desenvolvido como parte de um processo seletivo. Sem fins comerciais. Licença de uso educacional.