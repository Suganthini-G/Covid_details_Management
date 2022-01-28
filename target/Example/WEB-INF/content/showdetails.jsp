<%--suppress ALL --%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Details</title>
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />

</head>
<body>
<script src="jquery-1.8.3.js">

</script>

<script src="bootstrap/js/bootstrap.js">

</script>

<header class="blog-header py-3">
    <div class="col-xs-12">
        <div class="col-xs-10 text-center">
            <a class="blog-header-logo text-dark" style="text-decoration: none;font-size: 50px;color: black">Covid Details System</a>
        </div>
        <div class="col-xs-2 text-right">
            <a class="btn btn-sm btn-outline-secondary" href="phi-dash" style="color: black;font-size: 20px; background-color: transparent">Back</a>
        </div>
    </div>
</header>

<table class="table table-striped">
    <th>
    <td>Date</td>
    <td>Total Cases</td>
    <td>Total Deaths</td>
    <td>Total Recovered</td>
    <td>Action</td>
    </th>
    <s:iterator value="alldetails">
        <tr>
            <th>
            <td ><s:property value="date"/></td>
            <td ><s:property value="totalcases"/></td>
            <td ><s:property value="totaldeaths"/></td>
            <td ><s:property value="totalrecovered"/></td>
<%--            <td><a type="button" class="btn btn-primary" href="edit?id=<s:property value="id"/>" style="background-color: blue">--%>
<%--                Edit--%>
<%--            </a></td>--%>
            <td><a type="button" class="btn btn-primary" data-toggle="modal" data-target="#detailsModal">
                Delete
            </a></td>
            <div class="modal fade" id="detailsModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>Are you sure.Do you want to Delete?</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="delete?id=<s:property value="id"/>" type="button">Delete</a>
                        </div>
                    </div>
                </div>
            </div>
            </th>
        </tr>
    </s:iterator>
</table>
</body>
</html>
