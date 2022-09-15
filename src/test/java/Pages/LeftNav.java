package Pages;

import Utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[4]")
    private WebElement humanResourcesSetup;

    @FindBy(xpath = "//span[contains(text(),'Position Categories')]")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[contains(text(),'Attestations')]")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='School Setup']/..")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']/..")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']/..")
    private WebElement departments;

    @FindBy(xpath= "(//span[text()='Discounts']/..)[1]")
    private WebElement discounts;

    @FindBy(xpath = "//span[contains(text(),'Nationalities')][1]")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[5]")
    private WebElement educationSetup;

    @FindBy(xpath = "//span[contains(text(),'Subject Categories')]")
    private WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Grade Levels'])[1]")
    private WebElement getGradeLevels;



    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "bankAccounts" : myElement =bankAccounts; break;
            case "gradeLevels" : myElement =gradeLevels; break;
            case "humanResources" : myElement =humanResources; break;
            case "humanResourcesSetup" : myElement =humanResourcesSetup; break;
            case "positionCategories" : myElement =positionCategories; break;
            case "attestations" : myElement =attestations; break;
            case "documentTypes" : myElement =documentTypes; break;
            case "schoolSetup" : myElement =schoolSetup; break;
            case "locations" : myElement =locations; break;
            case "departments" : myElement =departments; break;
            case "discounts" : myElement =discounts; break;
            case "nationalities" : myElement =nationalities; break;
            case "positions" : myElement =positions; break;
            case "education" : myElement =education; break;
            case "educationSetup" : myElement =educationSetup; break;
            case "subjectCategories" : myElement =subjectCategories; break;
            case "fields" : myElement =fields; break;
            case "getGradeLevels" : myElement = getGradeLevels; break;

        }

        clickFunction(myElement);
    }

}
