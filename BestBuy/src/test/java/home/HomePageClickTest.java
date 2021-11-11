package home;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageClickTest extends HomePage {

    @Test
    public void bestBuyLogo(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnBestBuyLogo();
    }

    @Test
    public void hamburgerMenu(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnHamburgerMenu();
    }

    @Test
    public void searchBar(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnSearchBar();
    }

    @Test
    public void storeLocator(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnStoreLocatorIcon();
    }

    @Test
    public void shoppingCart(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnShoppingCartIcon();
    }
}
