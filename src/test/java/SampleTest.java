import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testHelloWorld() {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.27.0");
        driver.close();
    }
}
