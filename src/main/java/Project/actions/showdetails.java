package Project.actions;

import org.apache.struts2.convention.annotation.Action;

public class showdetails {
    @Action("details-show")
    public String showdetails() throws Exception
    {
        return "showdetails";
    }
}
