package Project.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;


public class PHI extends ActionSupport
{
    @Action("phi-dash")
    public String phi() throws Exception
    {
        return "phi";
    }
}
