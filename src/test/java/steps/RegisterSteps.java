package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterSteps {
WebDriver driver;
    public void iniciar(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
    }

    @Quando("preencho o campo nome com valor {string}")
    public void preenchoOCampoNomeComValor(String arg0) {
    }

    @E("preencho o campo Sobrenome com valor {string}")
    public void preenchoOCampoSobrenomeComValor(String arg0) {
    }

    @E("preencho o campo email com valor {string}")
    public void preenchoOCampoEmailComValor(String arg0) {
    }

    @E("preencho o campo telefone com valor {string}")
    public void preenchoOCampoTelefoneComValor(String arg0) {
    }

    @E("clico no genero FeMale")
    public void clicoNoGeneroFeMale() {
    }

    @E("clico no Hobbies Movies")
    public void clicoNoHobbiesMovies() {
    }

    @E("seleciono o Skill {string}")
    public void selecionoOSkill(String arg0) {
    }

    @E("seleciono o Country")
    public void selecionoOCountry() {
    }
}
