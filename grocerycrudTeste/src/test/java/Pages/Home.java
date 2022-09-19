package Pages;

import elementos.Elementos;
import metodos.Metodos;

public class Home {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void vesaoECadastro() {

		metodos.clicar(el.versao);

	}

	public void addCadCustomer() {
		metodos.clicar(el.btnAdd);
	}
}
