package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import utils.Drivers;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
	    tags = "@teste",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Executa extends Drivers {
	
	public static void abrirNavegador() {
		
		String navegador = "Chrome";
	    String url = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";
		
	    
	    if (navegador.equalsIgnoreCase("Chrome")) {
			   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
		}else if(navegador.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
		public static void fecharNavegador() {
			driver.quit();
		}

	


}
