<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<t:base>
    <jsp:attribute name="myscript">

    </jsp:attribute>
    <jsp:body>
        <div class="container">
            <form:form class="form-horizontal" method="post" action="/postuser">

                <spring:bind path="name">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <label class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-10">
                            <form:input path="name" type="text" class="form-control " id="name" placeholder="Name" />
                            <form:errors path="name" class="control-label" />
                        </div>
                    </div>
                </spring:bind>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn-lg btn-primary pull-right">Add</button>
                    </div>
                </div>
            </form:form>

        </div>
    </jsp:body>

</t:base>
 