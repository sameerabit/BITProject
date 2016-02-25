<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1><fmt:message key="customer.form.title"/></h1>

<div id="messages">
    <c:if test="${not empty statusMessageKey}">
        <p><fmt:message key="${statusMessageKey}"/></p>
    </c:if>

    <spring:hasBindErrors name="customer">
        <h2>Errors</h2>
        <div class="formerror">
            <ul>
                <c:forEach var="error" items="${errors.allErrors}">
                    <li>${error.defaultMessage}</li>
                </c:forEach>
            </ul>
        </div>
    </spring:hasBindErrors>
</div>

<form:form modelAttribute="customer">
    <form:hidden path="id" />

    <fieldset>
        <div class="form-row">
            <label for="customer"><fmt:message key="customer.form.name"/>:</label>
            <span class="input"><form:input path="customer" /></span>
        </div>
        <div class="form-row">
            <label for="city"><fmt:message key="customer.form.city"/>:</label>
            <span class="input"><form:input path="city" /></span>
        </div>

        <div class="form-buttons">
            <div class="button">
                <input type="submit" id="save" name="_eventId_save" value="<fmt:message key="button.save"/>"/>&#160;
                <input type="submit" name="_eventId_cancel" value="<fmt:message key="button.cancel"/>"/>&#160;
            </div>
        </div>
    </fieldset>
</form:form>