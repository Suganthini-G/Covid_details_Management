<%--suppress ALL --%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>PHI Details</title>
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
            <a class="btn btn-sm btn-outline-secondary" href="admin-dash" style="color: black;font-size: 20px; background-color: transparent">Back</a>
        </div>
    </div>
</header>

<table class="table table-striped">
    <th>
    <td>Name</td>
    <td>NIC</td>
    <td>PHI Division</td>
    <td>Phone Number</td>
    <td>Action</td>
    </th>

    <s:iterator value="allphi">
        <tr>
            <th>
            <td ><s:property value="name"/></td>
            <td ><s:property value="nic"/></td>
            <td ><s:property value="phidivision"/></td>
            <td ><s:property value="phoneno"/></td>
            <td><a type="button" class="btn btn-primary" data-toggle="modal" data-target="#phiModal">
                Delete
            </a></td>
            <div class="modal fade" id="phiModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                            <a class="btn btn-primary" type="button" href="delete2?id=<s:property value="id"/>">Delete</a>
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
