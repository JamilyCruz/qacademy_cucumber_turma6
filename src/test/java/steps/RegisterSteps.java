package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.RegisterPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
WebDriver driver;
RegisterPage registerPage;
@Before("@register")
public void iniciar(){
        driver = new ChromeDriver();
        //driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After("@register")
    public void fechar(){
    driver.quit();
    }
    @AfterStep("@register")
    public void print(){
    TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
    byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
    InputStream printStream = new ByteArrayInputStream(printBytes);
    Allure.addAttachment("register",printStream);
}


    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @Quando("preencho o campo nome com valor {string}")
    public void preenchoOCampoNomeComValor(String nome) {
        registerPage = new RegisterPage(driver);
        registerPage.preencherNome(nome);
    }

    @E("preencho o campo Sobrenome com valor {string}")
    public void preenchoOCampoSobrenomeComValor(String sobrenome) {
        registerPage.preencherSobreNome(sobrenome);
    }

    @E("preencho o campo email com valor {string}")
    public void preenchoOCampoEmailComValor(String email) {
    registerPage.preencherEmail(email);
    }

    @E("preencho o campo telefone com valor {string}")
    public void preenchoOCampoTelefoneComValor(String telefone) {
    registerPage.preencherTelefone(telefone);
    }

    @E("clico no genero FeMale")
    public void clicoNoGeneroFeMale() {
    registerPage.clicarGenero();
    }

    @E("clico no Hobbies Movies")
    public void clicoNoHobbiesMovies() {
        registerPage.clicarHobbie();
    }

    @E("seleciono o Skill {string}")
    public void selecionoOSkill(String skill) {
    registerPage.selecionarSkill(skill);
    }

}
