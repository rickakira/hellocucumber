# language: pt
  @selenium
  Funcionalidade: Abrir o site da Totvs (lambda)
    Abrindo o site da Totvs para ver as soluções de mercado

    Cenário de Fundo:
      Acessa o site da Totvs
      Vai para o link "Segmentos > Financial Services"

    # Podemos adicionar comentários
    Cenario: Verificando os produtos disponíveis
      Quando Acessar o Financial Services com lambda
      Então vou procurar os "<produtos>" disponíveis usando lambda

      Exemplos:
      | produtos              |
      | Investimentos Ativo   |
      | Investimentos Passivo |
