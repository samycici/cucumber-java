# language: pt
	Funcionalidade: Cadastrar um e-mail para receber Newsletter
	  Como cliente
	  Para receber promoções 
	  Quero cadastra meu e-mail para receber as Newsletter
	
	  Contexto: 
	    Dado que esteja na home
	
	  Cenário: Cadastrar um e-mail válido não cadastrado
	    Dado que meu e-mail ainda não foi cadastrado na newsletter
	    Quando cadastro meu e-mail
	    Então visualizo a mensagem de sucesso do cadastro da newsletter