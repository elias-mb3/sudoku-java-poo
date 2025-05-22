## 🎯 Escopo do Projeto

### Objetivo

Desenvolver um jogo de Sudoku em Java com foco em aprendizado de Programação Orientada a Objetos (POO) e organização de projetos com boas práticas, incluindo um menu interativo no terminal.

### Funcionalidades incluídas

- Geração de tabuleiro de Sudoku (com valores fixos passados via `args` no `main`)
- Interface via terminal com menu interativo
- Entrada do usuário em campos vazios
- Validação das regras do Sudoku (sem números repetidos em linha, coluna ou bloco)
- Verificação de vitória (Sudoku resolvido corretamente)
- Reinício do jogo com os números fixos
- Verificação de status do jogo (não iniciado, incompleto, completo) e detecção de erros
- Remoção de números adicionados pelo jogador
- Encerramento válido somente se o tabuleiro estiver corretamente preenchido

### Menu Interativo

O jogo deve apresentar um menu com as seguintes opções:

1. **Iniciar um novo jogo**  
   Exibe o jogo inicial, com os espaços preenchidos apenas pelos números fixos informados via argumentos no `main`.

2. **Colocar um novo número**  
   Solicita:

   - Número a ser colocado
   - Índice horizontal (linha)
   - Índice vertical (coluna)  
     Não permite sobrescrever números fixos ou já preenchidos.

3. **Remover um número**  
   Solicita os índices (linha e coluna) do número a ser removido.  
   Não é possível remover números fixos — deve informar ao usuário.

4. **Verificar jogo**  
   Exibe o estado atual do tabuleiro.

5. **Verificar status do jogo**  
   Mostra se o jogo está:

   - Não iniciado
   - Incompleto
   - Completo  
     Além disso, verifica se há erros de conflito nas regras do Sudoku.

6. **Limpar jogo**  
   Remove todos os números adicionados pelo usuário, mantendo apenas os fixos.

7. **Finalizar o jogo**  
   Tenta encerrar o jogo. Se todos os espaços estiverem preenchidos corretamente, o jogo é encerrado com sucesso.  
   Caso contrário, o sistema informa ao usuário que ainda há espaços inválidos ou vazios.

---

### Fora do escopo (versão inicial)

- Níveis de dificuldade
- Timer ou cronômetro
- Salvamento de jogo
- Pontuação e rankings
- Suporte a mobile

---

### Tecnologias e ferramentas

- Java 17 ou superior
- Interface via terminal
- Organização em pacotes seguindo boas práticas de POO
- GitHub Projects para acompanhamento do progresso
