package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void enter(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void validarTexto(By elemento, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertTrue(textoCapturado.contains(textoEsperado));
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
		
	}

	public void scrshot(String nomeEvidencia)  {
		
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			
		}

	}

	public void aguardar(int tempo) {

		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("**erro Metodo Aguardar");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}
}
