package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driverParametro){
        driver = driverParametro;
    }

    private String nome = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    private String sobreNome = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]";
    private String email = "//*[@id=\"eid\"]/input";
    private String telefone = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";
    private String clicarGenero = "radiooptions";
    private String selHobbies = "checkbox2";
    private String selSkill = "Skills";



    public void preencherNome(String Nome){
        driver.findElement(By.xpath(nome)).sendKeys(Nome);
    }
    public void preencherSobreNome(String sobrenome){
        driver.findElement(By.xpath(sobreNome)).sendKeys(sobrenome);
    }
    public void preencherEmail(String Email){
        driver.findElement(By.xpath(email)).sendKeys(Email);
    }
    public void preencherTelefone(String Telefone){
        driver.findElement(By.xpath(telefone)).sendKeys(Telefone);
    }
    public void clicarGenero(){
        driver.findElement(By.name(clicarGenero)).click();
    }
    public void clicarHobbie(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        driver.findElement(By.id(selHobbies)).click();
    }
    public void selecionarSkill(String skill){
        Select select1 = new Select(driver.findElement(By.id(selSkill)));
        select1.selectByVisibleText(skill);
    }
}



