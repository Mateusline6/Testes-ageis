@chucknorris
Feature: Pesquisa google
  Eu como usario quero fazer pesquisas



Background: Acessar Site do google
 Given que esteja no site "https://www.google.com.br"
 
 @teste1
  Scenario: Pesquisa escola
    When pesquisa nome "E2E treinamentos"
    Then Valido nome "E2E treinamentos" da pesquisa

  @teste2
  Scenario Outline: Pesquisar itens
    When pesquisar nome <item>
    Then validar nome <status> da pesquisa

    Examples: 
      |item   			 | status       |
      | "Informação" |  "Informação"|
      | "Inovação" 	 |  "Inovação"  |
      | "Educação"   |  "Educação"  |
  
  
   