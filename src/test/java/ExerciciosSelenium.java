import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {

    WebDriver driver = new ChromeDriver();

    @Test
    public void testeExerciciosSelenium(){
        driver.get("file:///C:/Users/wbraguin/OneDrive%20-%20Capgemini/Documents/Register.html");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Pyetra");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Braguini");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua Ana Pereira Mello, 253");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("braguinipy@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("11957248400");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[35]")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[11]")).click();

    }
}
