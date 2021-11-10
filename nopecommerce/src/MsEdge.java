import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MsEdge {


    public static void main(String[] args) {
        //  String url = "https://www.nopcommerce.com/en/demo";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.nopcommerce.com/en/demo");
        driver.manage().window().maximize();
        // driver.getTitle();
        driver.close();

    }


}




