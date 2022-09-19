#language:pt
#autor:nilosdan8@gmail.com


@teste
Funcionalidade: fazer cadastro customizado no site
Como usuario Quero fazer cadastro Para validar informacoes


@valido
Cenario: cadastro com dados validos
Dado que selecione um tema valido 
E selecione add customer
Quando preencher as informacoes com dados validos
E clicar em salvar
Entao valido cadastro salvo

@branco
Cenario: cadastro com dados em branco
Dado que selecione um tema valido 
E selecione add customer
Quando preencher as informacoes com dados em branco
E clicar em salvar
Entao cadastro nao salvo