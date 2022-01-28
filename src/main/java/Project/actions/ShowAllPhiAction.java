package Project.actions;

import Project.model.phidetails;
import Project.service.CovidService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;

import java.util.List;

public class ShowAllPhiAction extends ActionSupport
{
    List<phidetails> allphi;

    @Action("phi-show")
   public String addphi() throws Exception
    {
        CovidService covidService = new CovidService();
        allphi = covidService.showAllAvailablePhi();
        return "showphi";
    }

    public List<phidetails> getAllphi() {
        return allphi;
    }

    public void setAllphi(List<phidetails> allphi) {
        this.allphi = allphi;
    }
}
