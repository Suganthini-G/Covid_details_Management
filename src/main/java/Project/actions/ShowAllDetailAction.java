package Project.actions;

import Project.model.coviddetails;
import Project.service.CovidService;
import org.apache.struts2.convention.annotation.Action;

import java.util.List;

public class ShowAllDetailAction {
    List<coviddetails> alldetails;

    @Action("details-show")
    public String detailsadd() throws Exception
    {
        CovidService covidService = new CovidService();
        alldetails = covidService.showAllAvailableDetails();
        return "showdetails";
    }

    public List<coviddetails> getAlldetails() {
        return alldetails;
    }

    public void setAlldetails(List<coviddetails> alldetails) {
        this.alldetails = alldetails;
    }
}
