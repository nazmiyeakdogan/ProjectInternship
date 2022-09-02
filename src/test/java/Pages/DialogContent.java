package Pages;

import Utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;


    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "acceptCookies" : myElement =acceptCookies; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;

        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas


    }













}
