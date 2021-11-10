import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {
      //  String url = "https://www.nopcommerce.com/en/demo";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/demo");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.close();

    }


}
