import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseUI {

    @Test
    public void testCreateRegistration() {

        driver.findElement(Locator.JOIN_BUTTON).click();
        driver.findElement(Locator.EMAIL).sendKeys(Data.EMAIL_ID);
        driver.findElement(Locator.PASSWORD).sendKeys(Data.PASS);
        driver.findElement(Locator.NEXT_BUTTON).click();

        driver.findElement(Locator.USERNAME).sendKeys(Data.USER);
        driver.findElement(Locator.PHONE).sendKeys(Data.PHONE);
        driver.findElement(Locator.LOCATION).sendKeys(Data.LOC);
        driver.findElement(Locator.CONFORM_BUTTON).click();

    }

}
