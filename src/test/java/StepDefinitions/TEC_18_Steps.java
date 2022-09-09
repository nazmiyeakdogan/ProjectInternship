package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEC_18_Steps {

    DialogContent dc=new DialogContent();
    @And("Sending the keys in Dilaog1 Content")
    public void SendingthekeysinDilaogContent(DataTable elements) {
            dc.findAndSend("searchName","Hasan Ebrar");
    }
}
