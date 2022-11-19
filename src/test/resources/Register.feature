#language:pt
  @register
  Funcionalidade: Como usuário do site Register, eu desejo realizar um cadastro e validar cadastro com sucesso

    @teste001
    Cenario: Validar cadastro com sucesso no site Register
      Dado que eu acesso o site Register
      Quando preencho o campo nome com valor "Jamily"
      E preencho o campo Sobrenome com valor "Cruz"
      E preencho o campo email com valor "jamily1402@gmail.com"
      E preencho o campo telefone com valor "11 965421608"
      E clico no genero FeMale
      E clico no Hobbies Movies
      E seleciono o Skill "Android"
      E seleciono o Country
