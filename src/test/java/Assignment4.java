import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment4 {

    WebDriver driver;
    String mainUrl = "https://romanceabroad.com/";

    String HOME_LINK = "//a[text()='HOME']";

    By HOW_WE_WORK_LINK = By.xpath("//a[text()='HOW WE WORK']");
    By GIFTS_LINK = By.xpath("//a[text()='GIFTS']");
    By PRETTY_WOMEN = By.cssSelector("a[href$='search']");
    By TOUR_TO_UKRAINE_LINK = By.xpath("//a[text()='TOUR TO UKRAINE']");
    By BLOG_LINK = null;
    By SIGN_IN_LINK = By.xpath("//a[text()='SIGN IN']");
    By TITLE = By.xpath("//h1");
    By LINK_XPATH = By.xpath("//ul/li/a");

    int linkCount = 3;
    String exepectedHomeUrl = "https://romanceabroad.com/#";
    String exepectedHowWeWorkUrl = "https://romanceabroad.com/content/view/how-it-works";
    String expectedGifts = "https://romanceabroad.com/store/category-sweets";
    String expectedTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedBlog = "https://romanceabroad.com/content/view/blog";
    String expectedSignIn = "https://romanceabroad.com/";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }

    @Test
    public void testHomeLink() {

        driver.findElement(By.xpath(HOME_LINK)).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHomeUrl);

    }

    @Test
    public void testHowWeWorkLink() {

        driver.findElement(HOW_WE_WORK_LINK).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHowWeWorkUrl);

    }

    @Test
    public void testPrettyWomenkLinkcss() {

        WebElement PRETTY_WOMEN_LINK = driver.findElement(PRETTY_WOMEN);
        PRETTY_WOMEN_LINK.click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        String actualTitle = driver.findElement(TITLE).getText();
        Assert.assertEquals(actualTitle, "Single Ukrainian women online");

    }

    @Test
    public void testPhotosLink() {

        WebElement PHOTO_LINK = driver.findElements(LINK_XPATH).get(linkCount);
        PHOTO_LINK.click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        String actualTitle = driver.findElement(TITLE).getText();
        Assert.assertEquals(actualTitle, "Ukrainian women photos");

    }

    @Test
    public void testLoginPhoto() {

        WebElement PHOTO_LINK = driver.findElements(LINK_XPATH).get(linkCount);
        PHOTO_LINK.click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        driver.findElement(By.id("ajax_login_link")).click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password")).sendKeys("test@gmail.com");
        String actualTitle = driver.findElement(TITLE).getText();
        Assert.assertEquals(actualTitle, "Ukrainian women photos");

    }

    @Test
    public void testGiftsLink() {

        driver.findElement(GIFTS_LINK).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedGifts);
    }

    @Test
    public void testTourToUkraineLink() {

        driver.findElement(TOUR_TO_UKRAINE_LINK).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedTourToUkraine);

    }

    @Test
    public void testBlogLink() {

        driver.findElement(BLOG_LINK).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedBlog);

    }

    @Test
    public void testSignInLink() {

        driver.findElement(SIGN_IN_LINK).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedSignIn);



    }

}