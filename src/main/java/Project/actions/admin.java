package Project.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;

public class admin extends ActionSupport {
    @Action("admin-dash")
    public String admin() throws Exception
    {
        return "admin";
    }
}
