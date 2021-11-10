import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {


    public static void main(String[] args) {
        String url1 = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url1);
        driver.manage().window().maximize();
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
