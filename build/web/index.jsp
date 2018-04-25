<%-- 
    Document   : index
    Created on : Apr 25, 2018, 5:35:17 PM
    Author     : DuongPTHSE62871
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Image Upload</title>
    </head>
    <body>
        <h2>Demo Upload Image</h2>
        <s:actionerror />
        <s:form action="userImage" method="post" enctype="multipart/form-data">
            <s:file name="userImage" label="Image" />
            <s:submit value="Upload" align="center" />
        </s:form>
    </body>
</html>
