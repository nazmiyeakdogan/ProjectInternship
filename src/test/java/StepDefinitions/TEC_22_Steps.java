package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEC_22_Steps {

    DialogContent dc = new DialogContent();

    @And("Click on confirm delete button")
    public void clickOnConfirmDeleteButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }
    }

}
