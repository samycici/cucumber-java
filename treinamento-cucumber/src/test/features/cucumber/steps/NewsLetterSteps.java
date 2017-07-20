package cucumber.steps;

import java.util.UUID;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import cucumber.po.HomePage;

public class NewsLetterSteps {
	
	HomePage home = new HomePage();
	String email_gerado;

	@Dado("^que esteja na home$")
	public void que_esteja_na_home() throws Throwable {
		home.abrirSite();
	}

	@Dado("^que meu e-mail ainda não foi cadastrado na newsletter$")
	public void que_meu_e_mail_ainda_não_foi_cadastrado_na_newsletter() throws Throwable {
		email_gerado = UUID.randomUUID().toString().substring(1,15)+ "@gmail.com";
	}

	@Quando("^cadastro meu e-mail$")
	public void cadastro_meu_e_mail() throws Throwable {
		home.preencherEmail(email_gerado.toString());
		home.clicarBotao();
	}

	@Então("^visualizo a mensagem de sucesso do cadastro da newsletter$")
	public void visualizo_a_mensagem_de_sucesso_do_cadastro_da_newsletter() throws Throwable {
		String mensagemEsperada = "Obrigado por se inscrever! Aguarde novidades da nossa loja em breve.";
		String mensagemAtual = home.obterMensagem();

		Assert.assertEquals(mensagemEsperada, mensagemAtual);
	}
}
