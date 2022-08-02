package Test;

import QaUtil.TestBase;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import static QaUtil.TestBase.driver;

public class Test1  {
    TestBase tstbase = new TestBase(driver);
    @Test

  public void PracticeForm(){
        tstbase.initiallization();
        String expectedName = "Fatima";
        driver.findElement(By.id("firstName")).isEnabled();
        driver.findElement(By.id("firstName")).sendKeys("Fatima");
       String ActualFirstName= driver.findElement(By.id("firstName")).getText();
        System.out.println(ActualFirstName);
       // Assert.assertEquals(ActualFirstName,expectedName,"Testcase Passed");

    }


}
