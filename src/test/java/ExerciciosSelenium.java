import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciciosSelenium {

    WebDriver driver = new ChromeDriver();

    @Test
    public void testeExerciciosSelenium() throws InterruptedException{
//        Exercício 01
        driver.get("file:///C:/Users/wbraguin/OneDrive%20-%20Capgemini/Documents/Register.html");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Pyetra");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Braguini");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Rua Ana Pereira Mello, 253");
        driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("braguinipy@gmail.com");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("11957248400");

//        Exercício 02
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).isSelected());

//    Exercício 03
        driver.findElement(By.xpath("//*[@id='checkbox2']")).click();
        Assert.assertTrue("Checkbox não selecionado", driver.findElement(By.xpath("//*[@id='checkbox2']")).isSelected());
        Assert.assertFalse("Checkbox selecionado", driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());

//        Exercício 04
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();

//       Listas Option
//        com click tem que navegar até o elemento
        driver.findElement(By.xpath("//*[@id='Skills']/option[35]")).click();
        Thread.sleep(2000);
        //Selecionar Lista Option/Select com Select Selenium
        WebElement selectElement = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Linux");

//        Countries
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.xpath("//*[@id='country']/option[11]")).click();

//        Birthday
        driver.findElement(By.xpath("//*[@id='yearbox']/option[89]")).click();
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id='daybox']/option[16]")).click();

//        Password
        driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

    }

    @After
    public void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
