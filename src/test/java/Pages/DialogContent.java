package Pages;

import Utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // ------------------------------
    // Ortak Butonlar
    // ------------------------------
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

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;



    // ------------------------------
    //TEC-23 Locatorları
    // ------------------------------



    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement delete;

    @FindBy(xpath = "//td[text()='Efecan']/../td[7]/div/ms-edit-button/button")
    private WebElement editButtonOption;

    @FindBy(xpath = "//td[text()='Efe Han']/../td[7]/div/ms-delete-button/button")
    private WebElement deleteButtonOption;

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

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'FIELD.ORDER')]//input")
    private WebElement order;

    //-------------------------------------



// ------------------------------
    // TEC-16 Butonları
// ------------------------------

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]//button")
    private WebElement addButtonField;

    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stageInput;

    @FindBy(xpath = "//span[contains(text(),'Student Registration')]")
    private WebElement studentReg;

    @FindBy(xpath = "//span[contains(text(),'Examination') and @class='mat-option-text']")
    private WebElement examination;

    @FindBy(xpath = "//span[contains(text(),'Employment')]")
    private WebElement employment;

    @FindBy(xpath = "//span[contains(text(),'Certificate')]")
    private WebElement certificate;

    @FindBy(id = "//span[contains(text(),'Contract') and @class='mat-option-text']")
    private WebElement contract;

    @FindBy(id = "//span[contains(text(),'Dismissal') and @class='mat-option-text']")
    private WebElement dismissal;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement descriptionInput;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='required']")
    private WebElement required;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement active;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='useCamera']")
    private WebElement useCamera;

    @FindBy(xpath= "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchName;

    @FindBy(xpath = "//span[contains(text(),'Stage')]//ancestor::label")
    private WebElement searchDocStage;

    @FindBy(xpath = "//span[contains(text(),'All')]")
    private WebElement all;


// ------------------------------
    // TEC-18 Butonları
// ------------------------------
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//span[contains(text(),'Field Type')]")
    private WebElement fieldType;

    @FindBy(xpath = "//span[contains(text(),'Number')]")
    private WebElement numOpt;

    @FindBy(xpath = "//span[contains(text(),'Text')]//parent::mat-option")
    private WebElement txtOptn;

    @FindBy(xpath = "//span[contains(text(),'Integer')]")
    private WebElement intOptn;

    @FindBy(xpath = "m//span[contains(text(),'List of Value')]")
    private WebElement LoVOptn;

    @FindBy(id = "//span[contains(text(),'Date')]")
    private WebElement dateOptn;

    //---------------------------------

    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement = nameInput; break;
            case "bankAccountsName" : myElement = bankAccountsName;break;
            case "Iban" : myElement = Iban;break;
            case "IntegrationCode" : myElement = IntegrationCode;break;
            case "descriptionInput" : myElement = descriptionInput; break;
            case "searchName" : myElement = searchName; break;
            case "codeInput" : myElement = codeInput; break;
            case "searchInput" : myElement = searchInput; break;
            case "order" : myElement = order; break;
            case "shortName" : myElement = shortName; break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "addButton" : myElement = addButton; break;
            case "currencyEUR" : myElement = currencyEUR;break;
            case "saveButton" : myElement = saveButton;break;
            case "currency" : myElement = currency;break;
            case "deleteButton" : myElement = deleteButton; break;
            case "deleteDialogBtn" : myElement = deleteDialogBtn; break;
            case "editButton" : myElement = editButton; break;
            case "searchButton" : myElement = searchButton; break;
            case "stageInput" : myElement = stageInput; break;
            case "searchDocStage" : myElement = searchDocStage; break;
            case "studentReg" : myElement = studentReg; break;
            case "examination" : myElement = examination; break;
            case "employment" : myElement = employment; break;
            case "certificate" : myElement = certificate; break;
            case "contract" : myElement = contract; break;
            case "dismissal" : myElement = dismissal; break;
            case "required" : myElement = required; break;
            case "active" : myElement = active; break;
            case "useCamera" : myElement = useCamera; break;
            case "all" : myElement = all; break;
            case "fieldType" : myElement = fieldType; break;
            case "numOpt" : myElement = numOpt; break;
            case "txtOptn" : myElement = txtOptn; break;
            case "intOptn" : myElement = intOptn; break;
            case "LoVOptn" : myElement = LoVOptn; break;
            case "dateOptn" : myElement = dateOptn; break;
            case "delete" : myElement = delete; break;
            case "editButtonOption" : myElement = editButtonOption; break;
            case "deleteButtonOption" : myElement = deleteButtonOption; break;


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
