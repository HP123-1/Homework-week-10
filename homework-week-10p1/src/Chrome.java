import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get(baseUrl);
        driver1.manage().window().maximize();
        driver1.getTitle();
        String getTitle = driver1.getTitle();
        System.out.println(getTitle);
        driver1.close();


    }
}
