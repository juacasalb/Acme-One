<%@ page language="java" %>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:form>
	<acme:input-textbox code="patron.inventor.form.label.company" path="company"/>
	<acme:input-textbox code="patron.inventor.form.label.statement" path="statement"/>
	<acme:input-textbox code="patron.inventor.form.label.info" path="link"/>
</acme:form> 