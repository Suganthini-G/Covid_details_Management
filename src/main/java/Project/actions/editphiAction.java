package Project.actions;

import Project.service.CovidService;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

@SuppressWarnings("serial")
public class editphiAction extends ActionSupport {

    private String pageName;
    private String name;
    private String nic;
    private String phidivision;
    private String phoneno;
    private String password;

    @Action("edit-phi")
    public String input() throws Exception {
        return "phiedit";
    }

    @Override
    @Action(value = "editphi", results = { @Result(name = "phi-show", location = "phi-show", type = "redirect") })
    public String execute() throws Exception {
        String result1 = "";
        String result2 = "";
        CovidService covidService = new CovidService();

        if (pageName != null && covidService != null)
        {
            if (pageName.equals("editphi")) {
                result1 = covidService.update(name, nic, phoneno, phidivision, password);
                result2 = covidService.update2(nic, password);
                if (result1.equals("SubmitSuccess") && result2.equals("SubmitSuccess")) {
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

    public String getName() {
        return name;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Name is a required field")
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is a required field")
    @StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "6", message = "Password must be of length between 6 and 12")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "NIC is a required field")
    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPhidivision() {
        return phidivision;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Phi division is a required field")
    public void setPhidivision(String phidivision) {
        this.phidivision = phidivision;
    }

    public String getPhoneno() {
        return phoneno;
    }

    @RequiredStringValidator(message = "Phone Number is a required field")
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
