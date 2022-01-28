package Project.actions;

import Project.service.CovidService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;


import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import org.apache.struts2.convention.annotation.Result;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private String pageName;
	private String userName;
	private String password;

	@Action("login-input")
	public String input() throws Exception {
		return "login";
	}

	@Action(value = "login", results = { @Result(name = "admin-dash", location = "admin-dash", type = "redirect"), @Result(name = "phi-dash", location = "phi-dash", type = "redirect") })
	public String execute() throws Exception {
		String result = "";
		String result2 = "";
		CovidService covidService = new CovidService();

		if (pageName != null && covidService != null) {
			if (pageName.equals("login")) {
				result = covidService.findByLogin(userName, password);
				result2 = covidService.findByLogin2(userName, password);
				if (result2.equals("LoginSuccess")) {
					return "phi-dash";
				} else if (result.equals("LoginSuccess")){
					return "admin-dash";
				}
				else {
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

	public String getUserName() {
		return userName;
	}

	@RequiredStringValidator(type = ValidatorType.FIELD, message = "UserName is a required field")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	@RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is a required field")
	@StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "6", message = "Password must be of length between 6 and 12")
	public void setPassword(String password) {
		this.password = password;
	}

}
