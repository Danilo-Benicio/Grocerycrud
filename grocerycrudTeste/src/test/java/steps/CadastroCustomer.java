package steps;

import java.awt.AWTException;
import java.io.IOException;

import Pages.Cadastro;
import Pages.Home;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import runner.Executa;

public class CadastroCustomer {
	Home home = new Home();
	Cadastro cad = new Cadastro();
@Before
	public void iniciaTest() {
		Executa.abrirNavegador();
	}
@After
	public void finalizaTest() {
		Executa.fecharNavegador();
	}

	@Dado("que selecione um tema valido")
	public void queSelecioneUmTemaValido() {

		home.vesaoECadastro();
	}

	@Dado("selecione add customer")
	public void selecioneAddCustomer() {
		home.addCadCustomer();
	}

	@Quando("preencher as informacoes com dados validos")
	public void preencherAsInformacoesComDadosValidos() throws AWTException {
		cad.dadosPessoaisValidos();
	}

	@Quando("clicar em salvar")
	public void clicarEmSalvar() {
		cad.save();
	}

	@Entao("valido cadastro salvo")
	public void validoCadastroSalvo() throws IOException, InterruptedException {
		cad.Validar();

	}

	@Quando("preencher as informacoes com dados em branco")
	public void preencherAsInformacoesComDadosEmBranco() {
		cad.dadosPessoaisBranco();
	}

	@Entao("cadastro nao salvo")
	public void cadastroNaoSalvo() throws IOException, InterruptedException {
		cad.Validar();
	}

}
