package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageML {

        WebDriver driver;

        public HomePageML(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "cb1-edit")
        private WebElement inputBox;

        @FindBy(className = "nav-icon-search")
        private WebElement searchIcon;

        public void searchBoquita(String boquita){
            inputBox.click();
            inputBox.sendKeys(boquita);
        }

        public ResultPageML searchWord(){
        searchIcon.click();
        return new ResultPageML(driver);
    }

}

