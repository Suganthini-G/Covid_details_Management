package Project.actions;

import Project.service.CovidService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@SuppressWarnings("serial")
public class phideleteAction extends ActionSupport {
    private String pageName;
    private int Id;

    @Override
    @Action(value = "delete", results = { @Result(name = "phi-show", location = "phi-show", type = "redirect") })
    public String execute() throws Exception {
        String result1 = "";
        CovidService covidService = new CovidService();

        if (pageName != null && covidService != null)
        {
            if (pageName.equals("delete")) {
                result1 = covidService.phidelete(getId());
                if (result1.equals("DeleteSuccess")) {
                    return "phi-show";
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
