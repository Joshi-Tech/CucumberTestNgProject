import com.deque.axe.AXE;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.BaseTest;

import java.net.URL;

public class AXETest {
    WebDriver driver;

   private static final URL scriptUrl = AXETest.class.getResource("/axe.min.js");

   @BeforeMethod
    public void setUp(){
       new BaseTest().launchWebsite();
       driver = new ChromeDriver();
       driver.get("https://www.nopcommerce.com/en/boards/topic/94854/nopcommerce-460-roadmap-discussion");
       driver.manage().window().maximize();
   }

   @Test
   public void accessabilityTest(){
     JSONObject axe  = new AXE.Builder(driver,scriptUrl).analyze();
    JSONArray violations = axe.getJSONArray("violations");
    if(violations.length()==0){
        System.out.println("No errors were found");
    }else {
        AXE.writeResults("AXEAllyTest", axe);
        Assert.assertTrue(false,AXE.report(violations));
    }
   }

    @AfterMethod
    public void tearDown(){
       driver.quit();
   }
}
