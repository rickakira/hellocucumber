# language: pt
  @junit
  Funcionalidade: Já é sexta-feira?
    Todo mundo quer saber se hoje é sexta-feira

      Esquema do Cenario: Hoje é ou não é Sexta
      Dado que hoje é "<dia>"
      Quando alguem questionar se é Sexta
      Então vou falar que é "<resposta>"

      Exemplos:
      | dia     | resposta |
      | Segunda | Não...   |
      | Terça   | Não...   |
      | Quarta  | Não...   |
      | Quinta  | Não...   |
      | Sexta   | Breja!   |