package Project.service;


import Project.model.coviddetails;
import Project.model.phidetails;
import Project.repository.CovidRepository;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;


import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;


public class CovidService {

	private CovidRepository covidRepository;

	public CovidService() {
		covidRepository = new CovidRepository();
	}

	public String save(String name, String nic, String phoneno , String phidivision, String password)
	{
		if (covidRepository != null) {
			covidRepository.save(name, nic, phoneno, phidivision, password);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String save2(String nic, String password)
	{
		if (covidRepository != null) {
			covidRepository.save2(nic, password);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String save3(String totalcases, String totaldeaths, String totalrecovered, Date date)
	{
		if (covidRepository != null) {
			covidRepository.save3(totalcases,totaldeaths,totalrecovered,date);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String update(String name, String nic, String phoneno , String phidivision, String password)
	{
		if (covidRepository != null) {
			covidRepository.update(name, nic, phoneno, phidivision, password);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String update2(String nic, String password)
	{
		if (covidRepository != null) {
			covidRepository.update2(nic, password);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String update3(String totalcases, String totaldeaths, String totalrecovered, Date date)
	{
		if (covidRepository != null) {
			covidRepository.update3(totalcases,totaldeaths,totalrecovered,date);
			return "SubmitSuccess";
		} else {
			return "SubmitFailure";
		}
	}

	public String findByLogin(String userName, String password) {
		String result = "LoginFailure";
		if (covidRepository != null) {
			boolean status = covidRepository.findByLogin(userName, password);
			if (status) {
				result = "LoginSuccess";
			}
		}
		return result;
	}

	public String phidelete(int Id) {
		String result = "DeleteFailure";
		if (covidRepository != null) {
			boolean status = covidRepository.phidelete(Id);
			if (status) {
				result = "DeleteSuccess";
			}
		}
		return result;
	}

	public String detailsdelete() {
		String result = "DeleteFailure";
		if (covidRepository != null) {
			boolean status = covidRepository.detailsdelete();
			if (status) {
				result = "DeleteSuccess";
			}
			}
		return result;
	}



	public String findByLogin2(String userName, String password) {
		String result = "LoginFailure";
		if (covidRepository != null) {
			boolean status = covidRepository.findByLogin2(userName, password);
			if (status) {
				result = "LoginSuccess";
			}
		}
		return result;
	}

	public List<phidetails> showAllAvailablePhi( )
	{
		if (covidRepository != null)
		{
			List<phidetails> phi = covidRepository.showAllAvailablePhi();
			if (phi != null)
			{
				return phi;
			}
		}
		return null;
	}

	public List<coviddetails> showAllAvailableDetails( )
	{
		if (covidRepository != null)
		{
			List<coviddetails> details = covidRepository.showAllAvailableDetails();
			if (details != null)
			{
				return details;
			}
		}
		return null;
	}

    public String deletedetail() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		int id = Integer.parseInt(request.getParameter("id"));

        boolean status = covidRepository.deletedetail(id);

        if (status) {
            return SUCCESS;
        } else {
            return "input";
        }
    }

	public String deletephi() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		int id = Integer.parseInt(request.getParameter("id"));

		boolean status = covidRepository.deletephi(id);

		if (status) {
			return SUCCESS;
		} else {
			return "input";
		}
	}

}
