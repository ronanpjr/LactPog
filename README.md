# LactPog — Sistema de Gestão de Processamento de Laticínios

O **LactPog** é uma solução robusta para o gerenciamento de inventário em indústrias de laticínios. Desenvolvido em Java, o projeto prioriza a aplicação rigorosa de princípios de Engenharia de Software e Padrões de Projeto para garantir um sistema escalável, modular e de fácil manutenção.

## 🛠 Tecnologias

* **Linguagem:** Java (JDK 22 Preview).
* **Ambiente de Desenvolvimento:** IntelliJ IDEA e VS Code.
* **Gestão de Build:** Automação via scripts de shell para compilação e execução.

## 📐 Arquitetura e Padrões de Projeto

O sistema demonstra a aplicação prática de padrões de projeto consolidados (GoF) para resolver problemas complexos de acoplamento e criação de objetos:

* **Facade (Fachada):** Implementado através da classe `Facade` para fornecer uma interface simplificada e unificada que orquestra as interações entre os subsistemas de autenticação, estoque de insumos e produtos finais.
* **Factory Method (Fábrica):** Utilizado para desacoplar a lógica de criação de produtos da sua utilização. As classes `ProductFactory` e `CheeseFactory` gerenciam a instanciação de objetos como `Milk`, `Packaging`, `Yeast` e `Cheese`.
* **Singleton:** Aplicado nos gerenciadores `ProductManager` e `CheeseManager` para assegurar a existência de uma única instância global de controle de dados, garantindo a integridade do estado do sistema.
* **Observer (Observador):** Estabelece uma dependência de um-para-muitos. Quando o volume de estoque atinge níveis críticos, os observadores (`StorageObserver`) são automaticamente notificados para disparar alertas de reposição.

## 📦 Módulos do Sistema

O software é organizado em camadas lógicas para separação de responsabilidades:

1. **Módulo de Compras (Insumos):** Gerencia a entrada de matérias-primas como leite, fermentos e embalagens, com geração automática de relatórios de custos.
2. **Módulo de Produção/Vendas:** Controla o estoque de produtos acabados (queijos), permitindo o registro de saídas e monitoramento de validade.
3. **Segurança e Acesso:** Sistema de autenticação que valida credenciais de usuários e administradores, protegendo o acesso às funcionalidades críticas da fachada.

## 🚀 Execução

O projeto conta com automação via `tasks.json` para facilitar o ciclo de desenvolvimento:

* **Build:** Compilação de todos os pacotes (Authentication, Entities, Estoques) para o diretório `/bin`.
* **Run:** Execução da classe principal a partir do classpath configurado.

---
