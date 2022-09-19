package elementos;

import org.openqa.selenium.By;

public class Elementos {
                    
	//elementos da Home
	public By versao = By.xpath("//*[text()='Bootstrap V4 Theme']");
	public By btnAdd = By.xpath("//a[@class='btn btn-default btn-outline-dark']//i[@class='el el-plus']");
    
	
	// elementos de cadastro
	public By name = By.id("field-customerName");
	public By lastName = By.id("field-contactLastName");
	public By contactFirstName = By.id("field-contactFirstName");
	public By phone = By.id("field-phone");
	public By adrress1 = By.id("field-addressLine1");
	public By adrress2 = By.id("field-addressLine2");
	public By city = By.id("field-city");
	public By state = By.id("field-state");
	public By postalCode = By.id("field-postalCode");
	public By country = By.id("field-country");
	public By fromEmployeer = By.xpath("//span[text()='Select from Employeer']");
	public By selectEmployeer = By.xpath("//option[text()='Bott']");
	public By creditLimit = By.id("field-creditLimit");
	public By delete = By.id("field-deleted");

	
	//elementos de save e validação
	public By btnSave = By.id("form-button-save");
	public By textValidacao = By.xpath("//*[text()='Your data has been successfully stored into the database. ']");
}
