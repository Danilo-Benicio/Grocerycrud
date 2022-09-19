package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import elementos.Elementos;
import metodos.Metodos;

public class Cadastro {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void dadosPessoaisValidos() throws AWTException {
		try {
			Robot robot = new Robot();

			metodos.escrever(el.name, "teste");
			metodos.escrever(el.lastName, "teste");
			metodos.escrever(el.contactFirstName, "testinho");
			metodos.escrever(el.phone, "912345678");
			metodos.escrever(el.adrress1, "rua teste");
			metodos.escrever(el.adrress2, "rua teste2");
			metodos.escrever(el.city, "Sao paulo");
			metodos.escrever(el.state, "sao paulo");
			metodos.escrever(el.postalCode, "00000000");
			metodos.escrever(el.country, "teste");
			metodos.escrever(el.creditLimit, "20000");
			metodos.escrever(el.delete, "new");
			metodos.clicar(el.fromEmployeer);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

	
		
			
		} catch (Exception e) {
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		}
}
		
		
		

	public void save() {
		metodos.clicar(el.btnSave);
	}

	public void Validar()  {
		metodos.aguardar(3000);
		metodos.validarTexto(el.textValidacao, "test");
		metodos.scrshot("cadastro concluido");
	}

	public void dadosPessoaisBranco() {

		metodos.escrever(el.name, "");
		metodos.escrever(el.lastName, "");
		metodos.escrever(el.contactFirstName, "");
		metodos.escrever(el.phone, "");
		metodos.escrever(el.adrress1, "");
		metodos.escrever(el.adrress2, "");
		metodos.escrever(el.city, "");
		metodos.escrever(el.state, "sp");
		metodos.escrever(el.postalCode, "");
		metodos.escrever(el.country, "");
		metodos.escrever(el.creditLimit, "");
		metodos.escrever(el.delete, "");

	}

}
