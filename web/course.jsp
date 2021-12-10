<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>   
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>course Page</title>
        <sj:head jqueryui="true"/>
    </head>
    <body>
        <s:url id="hello" action="abc"></s:url>
        <sjg:grid id="gridtable"
          caption="Courses"
          dataType="json"
          href="%{hello}"
          pager="true"
          gridModel="courseList"
          rowList="10,15,20"
          rowNum="15"
          rownumbers="true">

            <sjg:gridColumn name="id" title="id" sortable="false"  />
            <sjg:gridColumn name="ccourse" title="course" sortable="false" />
            
           
        </sjg:grid>
    </body>
</html>
