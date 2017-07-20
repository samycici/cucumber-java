package cucumber.configs;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/resources/NewsLetter.feature", glue= "cucumber.steps", format = "json:target/cucumber-validacao-firefox.json")

public class Runner {
	static Navegador navegador = new Navegador();
	
	@BeforeClass
	public static void antesDoTeste() throws IOException {
		navegador.abrirNavegador();
	}

	@AfterClass
	public static void depoisDoTeste() {
		navegador.fechar();
	}

}
