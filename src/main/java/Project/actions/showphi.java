package Project.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;


public class showphi extends ActionSupport
{
    @Action("phi-show")
    public String showphi() throws Exception
    {
        return "showphi";
    }
}
