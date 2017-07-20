package cucumber.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.configs.Navegador;


public class HomePage extends Navegador {

	public void preencherEmail(String email) {
		System.out.println("Preenchi o email " + email);
		WebElement caixaDeEmail = driver.findElement(By.name("email"));
		System.out.println(caixaDeEmail);
		caixaDeEmail.clear();
		caixaDeEmail.sendKeys(email);
	}

	public void clicarBotao() {
		System.out.println("Cliquei no botão ");
		WebElement botao = driver.findElement(By.cssSelector("#corpo > div > div.secao-principal.row-fluid > div.coluna.span3.esquerda > div:nth-child(2) > div > div > div > div > div.newsletter-cadastro.input-conteiner > button"));
		botao.click();
	}

	public void abrirSite() {
		System.out.println("Abri o site ");
		driver.get("http://tghcastro.lojaintegrada.com.br/");
	}

	public String obterMensagem() throws InterruptedException {
		System.out.println("Obtive Mensagem ");
		Thread.sleep(1000);
		WebElement mensagem = driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/span"));
		return mensagem.getText();
		
	}
}
