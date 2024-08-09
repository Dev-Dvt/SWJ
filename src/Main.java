import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Setup Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://indiaserver.sypramtechnology.com:5010/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[6]/div/button")).click();
//        driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div[1]/div[6]/div/button")).click();
    }
}