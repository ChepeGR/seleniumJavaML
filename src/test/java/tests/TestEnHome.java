package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageML;
import pages.ResultPageML;

public class TestEnHome extends BaseTest {

    ResultPageML resultPageML;
    @Test(priority = 1)
    public void firstTest(){
        homePageML = new HomePageML(driver);
        homePageML.searchBoquita("Boca Juniors");
        resultPageML = homePageML.searchWord();
        String title = resultPageML.getResult();
        Assert.assertEquals(title, "Solo tiendas oficiales", "no bobilon");
    }

    @Test(priority = 2)
    public void secondTest(){
        String title = resultPageML.getResult();
        Assert.assertEquals(title, "Solo tiendas oficiales", "no bobilon");
    }

}
