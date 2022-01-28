package Project.actions;

import Project.model.coviddetails;
import Project.service.CovidService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@SuppressWarnings("serial")
public class detailsdeleteAction extends ActionSupport {
    private String pageName;
    private int Id;

    @Override
    @Action(value = "detaildelete")
//            , results = { @Result(name = "details-show", location = "details-show", type = "redirect") })
    public String execute() throws Exception {
        String result1 = "";
        CovidService covidService = new CovidService();

        if (pageName != null && covidService != null)
        {
            if (pageName.equals("detaildelete")) {
                result1 = covidService.detailsdelete();
                if (result1.equals("DeleteSuccess")) {
                    return "details-show";
                } else {
                    return "failure";
                }
            }
        }
        return SUCCESS;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public int getId() {return Id;}

    public void setId(int id) {Id = id;}
}




