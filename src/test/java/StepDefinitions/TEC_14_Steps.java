package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEC_14_Steps {

    DialogContent dc=new DialogContent();
    @And("User delete item from dialog")
    public void userDeleteItemFromDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
        {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}
