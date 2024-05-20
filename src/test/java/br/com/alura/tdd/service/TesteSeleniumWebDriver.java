package br.com.alura.tdd.service;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteSeleniumWebDriver  {

	
	
	
		@Test
	    public void run() {
	        // Configuração do WebDriver
	        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        // Acessar a página do Google
	        driver.get("https://www.google.com");

	        // Localizar o campo de pesquisa
	        WebElement campoPesquisa = driver.findElement(By.name("q"));

	        // Inserir um termo de busca
	        campoPesquisa.sendKeys("Java Spring Selenium");

	        // Submeter o formulário
	        campoPesquisa.submit();

	        // Aguardar a página de resultados carregar
	        try {
	            Thread.sleep(2000); // Espera 5 segundos para a página carregar (não é a melhor prática, apenas para simplificar)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        WebElement url ; 
	        // Verificar se a página de resultados contém o título da primeira página
	        WebElement primeiroResultado = driver.findElement(By.cssSelector("h3"));
	        if (primeiroResultado.getText().contains("Teste de UI com Selenium")) {
	            System.out.println("Teste passou! Encontrou o resultado esperado.");
	           
	            primeiroResultado.findElement(By.xpath("./parent::a")).click();
//	            if (!url.getText().isEmpty()) {
//					System.out.println("Achou o elemento com link");
//				}
	        } else {
	            System.out.println("Teste falhou! Não encontrou o resultado esperado.");
	        }

	        // Fechar o navegador
	       // driver.quit();
	    }
	
	
	
	
	
	
}
