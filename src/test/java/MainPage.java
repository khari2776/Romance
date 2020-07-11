import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";

    @BeforeMethod
    public void setUp () {
        
    }

    @Test
    public void testMainPage() {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
        driver.quit();
    }
        @Test
        public void testMainPage2() {

            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(mainUrl);
            driver.quit();
       }
    }

