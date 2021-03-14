#Author: mateusefigenio55@gmail.com




Feature: Pesquisa
  Eu como usuario quero realizar uma pesquisa para validar as informacoes


Background: Acessar o google
Given que eu esteja no google "https://www.google.com.br"

 
  Scenario: Pesquisar informacao  
    When pesquisar "informacao"
    Then valido o texto "informacao"
    
