package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mytest extends  WebDrivers {
    @Test
    public void firsttest(){
        driver.get("https://mail.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Mail.ru: почта, поиск в интернете, новости, игры"));

        WebElement loginput = driver.findElement(By.id("mailbox:login"));
        loginput.click();
        loginput.sendKeys("exampleforjob@mail.ru");
        driver.findElement(By.id("mailbox:submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailbox:password")));

        WebElement Passinput = driver.findElement(By.id("mailbox:password"));
        Passinput.click();
        Passinput.sendKeys("qweqazxswedc");

        driver.findElement(By.id("mailbox:submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PH_logoutLink")));
        //driver.findElement(By.cssSelector("[class=\"portal-menu__logo portal-menu__logo_compact\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PH_logoutLink"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("auth-form")));


























    }

}
