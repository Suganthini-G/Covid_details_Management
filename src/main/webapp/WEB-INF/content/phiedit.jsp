<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <sb:head includeScripts="false" includeScriptsValidation="false"
             includeStylesResponsive="true" />
    <sj:head jqueryui="true" />

    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />


    <style>
        .error {
            color: #ff0000;
            font-size: 0.9em;
            font-weight: bold;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }

        input[type="text"],input[type="password"] {
            height: 40px;
        }
    </style>

    <title>Edit PHI Details</title>

</head>

<body>

<script src="bootstrap/js/bootstrap.js">

</script>

<header class="blog-header py-3">
    <div class="col-xs-12">
        <div class="col-xs-10 text-center">
            <a class="blog-header-logo text-dark" style="text-decoration: none;font-size: 50px;color: black">Covid Details System</a>
        </div>
        <div class="col-xs-2 text-right">
            <a class="btn btn-sm btn-outline-secondary" href="phi-show" style="color: black;font-size: 20px; background-color: transparent">Back</a>
        </div>
    </div>
</header>


<div class="col-lg-6 col-lg-offset-3">
    <div class="well">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <s:form id="myForm" action="editphi" theme="bootstrap"
                            validate="true" cssClass="bs-example form-horizontal"
                            method="post">
                        <fieldset>
                            <legend align="center">Edit PHI Details</legend>

                            <s:textfield label="Name" name="name"
                                         cssClass="col-lg-11" value="name" />

                            <s:textfield label="NIC" name="nic"
                                         cssClass="col-lg-11" value="nic" />

                            <s:textfield label="PHI Division" name="phidivision"
                                         cssClass="col-lg-11" value="%{phidivision}" />

                            <s:textfield label="Phone Number" name="phoneno"
                                         cssClass="col-lg-11" value="phoneno" />

                            <div class="col-lg-9 col-lg-offset-3">
                                <s:reset cssClass="btn btn-default" value="Reset" />
                                <s:submit cssClass="btn btn-primary" value="Update"/>
                            </div>
                            <s:hidden name="pageName" value="editphi" />
                        </fieldset>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>