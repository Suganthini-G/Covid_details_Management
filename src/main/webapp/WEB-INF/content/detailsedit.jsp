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

    <title>Details</title>

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
            <a class="btn btn-sm btn-outline-secondary" href="details-show" style="color: black;font-size: 20px; background-color: transparent">Back</a>
        </div>
    </div>
</header>


<div class="col-lg-6 col-lg-offset-3">
    <div class="well">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <s:form action="updatedetail" theme="bootstrap"
                            validate="true" cssClass="bs-example form-horizontal"
                            method="post">
                        <fieldset>
                            <legend align="center">Edit Details</legend>

                            <s:textfield label="Total cases" name= "totalcases" value="%{coviddetailstotalcases}"
                                       cssClass="col-lg-11" />

                            <s:textfield label="Total deaths" name="totaldeaths" value="%{totaldeaths}"
                                       cssClass="col-lg-11" />

                            <s:textfield label="Total recovered" name="totalrecovered" value="%{#session.totalrecovered}"
                                       cssClass="col-lg-11" />

                            <sj:datepicker name="date" value="%{#date}" label="Date" cssClass="col-lg-11"
                                           displayFormat="mm/dd/yy" parentTheme="bootstrap"
                                           changeMonth="true" changeYear="true"
                                        buttonImageOnly="true" yearRange="c-100:c+0" />

                            <div class="col-lg-9 col-lg-offset-3">
                                <s:reset cssClass="btn btn-default" value="Reset"/>
                                <s:submit cssClass="btn btn-primary" value="Update"/>
                            </div>
<%--                            <s:hidden name="pageName" value="editdetails" />--%>
                        </fieldset>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>