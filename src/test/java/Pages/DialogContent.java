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

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//button[@matbadgeoverlap='false']")
    private WebElement addBankAccounts;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement bankAccountsName;

    @FindBy(xpath=" //ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement Iban;

    @FindBy(xpath="(//mat-select[@role='combobox'])[3]")
    private WebElement currency;

    @FindBy(xpath="(//mat-option[@role='option'])[3]//span")
    private WebElement currencyEUR;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement IntegrationCode;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;


    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "loginButton" : myElement = loginButton;break;
            case "bankAccountsName" : myElement = bankAccountsName;break;
            case "Iban" : myElement = Iban;break;
            case "IntegrationCode" : myElement = IntegrationCode;break;

        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "addBankAccounts" : myElement = addBankAccounts;break;
            case "currencyEUR" : myElement = currencyEUR;break;
            case "saveButton" : myElement = saveButton;break;
            case "currency" : myElement = currency;break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;

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
