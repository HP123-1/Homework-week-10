import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        String url = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();
        driver1.get(url);
        driver1.manage().window().maximize();
        driver1.getTitle();
        String getTitle = driver1.getTitle();
        System.out.println(getTitle);
        driver1.close();

    }
}
