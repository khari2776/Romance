import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment2 {
    WebDriver driver;
    String mainUrl = "https://romanceabroad.com/";

    String exepectedHomeUrl = "https://romanceabroad.com/#";
    String exepectedHowWeWorkUrl = "https://romanceabroad.com/content/view/how-it-works";
    String exepectedPrettyWomen = "https://romanceabroad.com/users/search";
    String exepectedPhotos = "https://romanceabroad.com/media/index";
    String expectedGifts = "https://romanceabroad.com/store/category-sweets";
    String expectedTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedBlog = "https://romanceabroad.com/content/view/blog";
    String expectedSignIn = "https://romanceabroad.com/";
    String expectedBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedJoinForFree = "https://romanceabroad.com/";




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


        driver.findElement(By.linkText("HOME")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHomeUrl);

    }

    @Test
    public void testHomeLinkCss() {

        driver.findElement(By.cssSelector("a[href$='#']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHomeUrl);





    }

    @Test
    public void testHowWeWorkLink() {

        driver.findElement(By.xpath("//a[text()='HOW WE WORK']")).click();
        //driver.findElement(By.linkText("HOW WE WORK")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHowWeWorkUrl);

    }

    @Test
    public void testHowWeWorkLinkCss() {

        driver.findElement(By.cssSelector("a[href$='how-it-works']\n" +
                "\n")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedHowWeWorkUrl);


    }

    @Test
    public void testPrettyWomenkLink() {

        driver.findElement(By.xpath("//a[text()='PRETTY WOMEN']")).click();
        //driver.findElement(By.linkText("PRETTY WOMEN")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedPrettyWomen);
    }
    @Test
    public void testPrettyWomenkLinkcss() {

        driver.findElement(By.cssSelector("a[href$='search']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedPrettyWomen);
    }
    @Test
    public void testPhotos() {

        driver.findElement(By.xpath("//a[text()='PHOTOS']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedPhotos);
    }
    @Test
    public void testPhotoscss() {

        driver.findElement(By.cssSelector("a[href$='index']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, exepectedPhotos);
    }

    @Test
    public void testgifts() {

        driver.findElement(By.xpath("//a[text()='GIFTS']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedGifts);
    }
    @Test
    public void testgiftscss() {

        driver.findElement(By.cssSelector("a[href$='sweets']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedGifts);
    }
    @Test
    public void testTourToUkraine() {

        driver.findElement(By.xpath("//a[text()='TOUR TO UKRAINE']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedTourToUkraine);
    }
    @Test
    public void testTourToUkrainecss() {

        driver.findElement(By.cssSelector("a.nav-link[href$='ukraine']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedTourToUkraine);
    }
    @Test
    public void testBlog() {

        //driver.findElement(By.xpath("//div[@id='navbarResponsive']//a[text()='BLOG']")).click();
        driver.findElement(By.xpath("//a[text()='BLOG']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedBlog);
    }
    @Test
    public void testBlogcss() {

        driver.findElement(By.cssSelector("a.nav-link[href$='blog']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedBlog);
    }
    @Test
    public void testSignIn() {

        driver.findElement(By.xpath("//a[@id='ajax_login_link']")).click();

        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedSignIn);
    }
    @Test
    public void testSignIncss() {

        driver.findElement(By.cssSelector("#ajax_login_link")).click();

        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedSignIn);
    }

    @Test
    public void testBookNow() {

        driver.findElement(By.xpath("//a[text()='BOOK NOW ']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedBookNow);
    }
    @Test
    public void testBookNowcss() {

        driver.findElement(By.cssSelector("a[href$='ukraine']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedBookNow);
    }
    @Test
    public void testJoinFree() {

        driver.findElement(By.xpath("//button[@id='show-registration-block']")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedJoinForFree);
    }
    @Test
    public void testJoinFreecss() {

        driver.findElement(By.cssSelector("#show-registration-block")).click();
        String actualHomeUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedJoinForFree);
    }




}
