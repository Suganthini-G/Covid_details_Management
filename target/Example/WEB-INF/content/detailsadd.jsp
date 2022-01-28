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

    <title>Add Details</title>

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
            <a class="btn btn-sm btn-outline-secondary" href="phi-dash" style="color: black;font-size: 20px; background-color: transparent">Back</a>
        </div>
    </div>
</header>


<div class="col-lg-6 col-lg-offset-3">
    <div class="well">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <s:form id="myForm" action="detailsadd" theme="bootstrap"
                            validate="true" cssClass="bs-example form-horizontal"
                            method="post">
                        <fieldset>
                            <legend align="center">Add Details</legend>

                            <s:textfield label="Total cases" name="totalcases"
                                         cssClass="col-lg-11" placeholder="Total cases" />

                            <s:textfield label="Total deaths" name="totaldeaths"
                                         cssClass="col-lg-11" placeholder="Total deaths" />

                            <s:textfield label="Total recovered" name="totalrecovered"
                                         cssClass="col-lg-11" placeholder="Total recovered" />

                            <sj:datepicker name="date" label="Date" cssClass="col-lg-11"
                                           displayFormat="mm/dd/yy" parentTheme="bootstrap"
                                           placeholder="Date" changeMonth="true" changeYear="true"
                                           buttonImageOnly="true" yearRange="c-100:c+0" />

                            <div class="col-lg-9 col-lg-offset-3">
                                <s:reset cssClass="btn btn-default" value="Reset" />
                                <s:submit cssClass="btn btn-primary" value="Submit"
                                          data-toggle="modal" data-target="#themodal" />
                                <div id="themodal" class="modal fade col-lg-9 col-lg-offset-3" data-backdrop="static">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
                                                <h3>Form Submission</h3>
                                            </div>
                                            <div class="modal-body">
                                                <p>Are you sure you want to submit the details?</p>
                                                <div class="progress progress-striped active">
                                                    <div id="doitprogress" class="progress-bar"></div>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <sj:submit cssClass="btn btn-primary" value="Yes"
                                                           id="yesbutton" formId="myForm"
                                                           data-loading-text="Saving.."
                                                           data-complete-text="Submit Complete!" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <s:hidden name="pageName" value="detailsadd" />
                        </fieldset>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</div>




<script type="text/javascript">
    $(function() {
        var yesButton = $("#yesbutton");
        var progress = $("#doitprogress");

        yesButton.click(function() {
            yesButton.button("loading");

            var counter = 0;
            var countDown = function() {
                counter++;
                if (counter == 11) {
                    yesButton.button("complete");
                } else {
                    progress.width(counter * 10 + "%");
                    setTimeout(countDown, 100);
                }
            };

            setTimeout(countDown, 100);
        });

    });
</script>
</body>
</html>