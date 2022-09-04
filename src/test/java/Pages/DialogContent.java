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

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;


    // ------------------------------
    //TEC-23 Locatorları
    // ------------------------------
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

    //-------------------------------------



// ------------------------------
    // TEC-16 Butonları
// ------------------------------
    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stageInput;

    @FindBy(xpath = "//span[contains(text(),'Student Registration')]")
    private WebElement studentReg;

    @FindBy(xpath = "")
    private WebElement examination;

    @FindBy(xpath = "//span[contains(text(),'Employment')]")
    private WebElement employment;

    @FindBy(xpath = "//span[contains(text(),'Certificate')]")
    private WebElement certificate;

    @FindBy(id = "")
    private WebElement contract;

    @FindBy(id = "")
    private WebElement dismissal;


    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement descriptionInput;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='required']")
    private WebElement required;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement active;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='useCamera']")
    private WebElement useCamera;



    @FindBy(id = "ms-text-field-0")
    private WebElement searchName;

    @FindBy(id = "ms-text-field-1")
    private WebElement searchCode;

    @FindBy(id="mat-select-value-9")
    private WebElement fieldType;

    @FindBy(id = "mat-option-21")
    private WebElement txtOptn;

    @FindBy(id = "mat-option-22")
    private WebElement intOptn;

    @FindBy(id = "mat-option-23")
    private WebElement LoVOptn;

    @FindBy(id = "mat-option-24")
    private WebElement dateOptn;

// ------------------------------
    // TEC-18 Butonları
// ------------------------------
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;



    @FindBy(id = "ms-text-field-6")
    private WebElement searchDocName;

    @FindBy(id = "mat-select-12")
    private WebElement searchDocStage;

    @FindBy(id = "mat-option-36")
    private WebElement all;

    @FindBy(id = "mat-option-37")
    private WebElement searchStudentReg;

    @FindBy(id = "mat-option-38")
    private WebElement searchExamination;

    @FindBy(id = "mat-option-39")
    private WebElement searchEmployment;

    @FindBy(id = "mat-option-40")
    private WebElement searchCertificate;

    @FindBy(id = "mat-option-41")
    private WebElement searchContract;

    @FindBy(id = "mat-option-42")
    private WebElement searchDismissal;

    @FindBy(id = "mat-slide-toggle-61-input")
    private WebElement searchRequired;

    @FindBy(id = "mat-slide-toggle-62-input")
    private WebElement searchActive;

    @FindBy(id = "mat-slide-toggle-63")
    private WebElement searchUseCamera;

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
            case "searchCode" : myElement = searchCode; break;
            case "codeInput" : myElement = codeInput; break;
            case "searchDocName" : myElement = searchDocName; break;
            case "searchInput": myElement = searchInput; break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "addButton" : myElement = addButton; break;
            case "addBankAccounts" : myElement = addBankAccounts;break;
            case "currencyEUR" : myElement = currencyEUR;break;
            case "saveButton" : myElement = saveButton;break;
            case "currency" : myElement = currency;break;
            case "deleteButton" : myElement = deleteButton; break;
            case "deleteDialogBtn" : myElement = deleteDialogBtn; break;
            case "editButton" : myElement = editButton; break;
            case "stageInput" : myElement = stageInput; break;
            case "studentReg" : myElement = studentReg; break;
            case "examination" : myElement = examination; break;
            case "employment" : myElement = employment; break;
            case "certificate" : myElement = certificate; break;
            case "contract" : myElement = contract; break;
            case "dismissal" : myElement = dismissal; break;
            case "required" : myElement = required; break;
            case "active" : myElement = active; break;
            case "useCamera" : myElement = useCamera; break;
            case "fieldType" : myElement = fieldType; break;
            case "txtOptn" : myElement = txtOptn; break;
            case "intOptn" : myElement = intOptn; break;
            case "LoVOptn" : myElement = LoVOptn; break;
            case "dateOptn" : myElement = dateOptn; break;
            case "all" : myElement = all; break;
            case "searchStudentReg" : myElement = searchStudentReg; break;
            case "searchExamination" : myElement = searchExamination; break;
            case "searchEmployment" : myElement = searchEmployment; break;
            case "searchCertificate" : myElement = searchCertificate; break;
            case "searchContract" : myElement = searchContract; break;
            case "searchDismissal" : myElement = searchDismissal; break;
            case "searchRequired" : myElement = searchRequired; break;
            case "searchActive" : myElement = searchActive; break;
            case "searchUseCamera" : myElement = searchUseCamera; break;
            case "searchButton": myElement = searchButton; break;


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
