package Teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTeste {
    @Test
    public void testFazerLoginNoTask () {
        System.setProperty("webdriver.chrome.driver", "/home/pedrolana/Documents/Pessoal/Estudo/Test/Drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("http://www.juliodelima.com.br/taskit/");

        navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.id("signinbox")).findElement((By.name("login"))).sendKeys("pedrodelana");
        navegador.findElement(By.id("signinbox")).findElement((By.name("password"))).sendKeys("palmeiras");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        Assert.assertEquals("Hi, Pedro",saudacao);

        navegador.quit();
    }
}
