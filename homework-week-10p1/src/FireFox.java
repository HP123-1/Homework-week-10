import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        String url1 = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.gecko.driver",
                "drivers/geckodriver.exe");

        WebDriver driver2 = new FirefoxDriver();
        driver2.getTitle();
        driver2.get(url1);
        driver2.manage().window().maximize();
        driver2.getTitle();
        String getTitle = driver2.getTitle();
        System.out.println(getTitle);
        driver2.close();


    }
}
