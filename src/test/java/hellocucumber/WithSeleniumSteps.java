package hellocucumber;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.java8.Pt;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class WithSeleniumSteps implements Pt {

    WebDriver webDriver = null;

    private String URL = "https://www.totvs.com/financial-services";

    public void acessaSite() {
        Path path = FileSystems.getDefault().getPath("src/driver/geckodriver.exe");
//        Path path = FileSystems.getDefault().getPath("src/driver/geckodriver");
        System.setProperty("webdriver.gecko.driver",path.toString());

        webDriver = new FirefoxDriver();
        webDriver.navigate().to(URL);
    }


    @Quando("^Acessar o Financial Services$")
    public void acessarOFinancialServices() {
        acessaSite();
    }

    @Então("vou procurar os {string} disponíveis")
    public void vouProcurarOsProdutosDisponiveis(String produtoProcurado) {
        String produto = webDriver.findElement(By.xpath("//*[text()[contains(.,'"+ produtoProcurado +"')]]")).getText().toUpperCase();
        Assert.assertEquals(produto, produtoProcurado.toUpperCase());
    }
}
