import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {


        public static void main(String[] args) {
            //  String url = "https://www.nopcommerce.com/en/demo";

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.nopcommerce.com/en/demo");
            driver.manage().window().maximize();
           // driver.getTitle();
            driver.close();

        }


    }



