package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {

    //----------------------TOP NAV left to right---------------------------------------------

    @FindBy(how = How.XPATH, using = "//img[@alt='BestBuy.com']")
    public static WebElement bestBuyLogoWebElement;
    public static WebElement getBestbuyLogoWebElement(){
        return bestBuyLogoWebElement;
    }
    public void clickOnBestBuyLogo(){
        getBestbuyLogoWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//nav[@class='hamburger-menu']")
    public static WebElement hamburgerMenu;
    public static WebElement getHamburgerMenu(){
        return hamburgerMenu;
    }
    public void clickOnHamburgerMenu(){
        getHamburgerMenu().click();
    }

    @FindBy(how = How.XPATH, using = "//form[@name='frmSearch']")
    public static WebElement searchBar;
    public static WebElement getSearchBar(){
        return searchBar;
    }
    public void clickOnSearchBar(){
        getSearchBar().click();
    }

    @FindBy (how = How.XPATH, using = "//div[@id='shop-location-tooltip-9738c34a-de17-4c91-9e2b-309d04362b90']")
    public static WebElement storeLocatorIcon;
    public static WebElement getStoreLocatorIcon(){
        return storeLocatorIcon;
    }
    public void clickOnStoreLocatorIcon(){
        getStoreLocatorIcon().click();
    }

    @FindBy (how = How.XPATH, using = "//div[@class= 'cart-icon']" )
    public static WebElement shoppingCartIcon;
    public static WebElement getShoppingCartIcon(){
        return shoppingCartIcon;
    }
    public void clickOnShoppingCartIcon(){
        getShoppingCartIcon().click();
    }
}
