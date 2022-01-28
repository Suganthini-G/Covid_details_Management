package Project.actions;

import Project.service.CovidService;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

import java.sql.Date;


@SuppressWarnings("serial")
public class editdetailsAction extends ActionSupport {

    private String pageName;
    private String totalcases;
    private String totaldeaths;
    private String totalrecovered;
    private Date date;

    @Action("edit-details")
    public String input() throws Exception {
        return "detailsedit";
    }

    @Override
    @Action(value = "editdetails", results = { @Result(name = "details-show", location = "details-show", type = "redirect") })
    public String execute() throws Exception {
        String result = "";
        CovidService covidService = new CovidService();

        if (pageName != null && covidService != null)
        {
            if (pageName.equals("editdetails")) {
                result = covidService.update3(totalcases,totaldeaths,totalrecovered,date);
                if (result.equals("SubmitSuccess")) {
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

    public String getTotalcases() {
        return totalcases;
    }
    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Required field")
    public void setTotalcases(String totalcases) {
        this.totalcases = totalcases;
    }

    public String getTotaldeaths() {
        return totaldeaths;
    }
    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Required field")
    public void setTotaldeaths(String totaldeaths) {
        this.totaldeaths = totaldeaths;
    }

    public String getTotalrecovered() {
        return totalrecovered;
    }
    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Required field")
    public void setTotalrecovered(String totalrecovered) {this.totalrecovered = totalrecovered;}

    public Date getDate() {return date;}
    @RequiredFieldValidator(type = ValidatorType.FIELD, message = "Required field")
    public void setDate(Date date) {
        this.date = date;
    }
}
