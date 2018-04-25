<%-- 
    Document   : SuccessUserImage
    Created on : Apr 25, 2018, 5:36:58 PM
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
        User Image:	<s:property value="userImage" /><br/>
        Content Type:<s:property value="userImageContentType" /><br/>
        File Name:	<s:property value="userImageFileName" /><br/>
        Uploaded Image:	<img src="userimages/<s:property value="userImageFileName"/>" 
                             width="100" height="100" />
    </body>
</html>