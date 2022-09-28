#Author: Filipe Dias

Feature: Validar username da API do Github
 Como usuario 
 Quero enviar uma requisiçao do tipo Get
 Para validar: username, name, location e email do usuário

 
  Scenario: Validar dados do usuario de Id 1 na API do Github
  
    Given que acesse api do github    
    When enviar uma requisicao do tipo get 
    And valido o username "mojombo", id "1", name "Tom Preston-Werner", blog "http://tom.preston-werner.com", location "San Francisco" do usuario
    Then valido status code
    