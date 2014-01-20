<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>New user</h1>

<form:form action="register.html" commandName="userCommand" method="POST">
    <div id="userForm">
        <table>
            <tbody>
            <tr>
                <th/>
                <td><form:errors path="*" cssClass="redBold"/></td>
            </tr>
            <tr>
                <th><form:label path="username" cssErrorClass="redBold">Username</form:label></th>
                <td><form:input path="username"/></td>
            </tr>
            <tr>
                <th><form:label path="password" cssErrorClass="redBold">Password</form:label></th>
                <td><form:password path="password"/></td>
            </tr>
            <tr>
                <th><form:label path="password2"
                                cssErrorClass="redBold">Retype password</form:label></th>
                <td><form:password path="password2"/></td>
            </tr>
            <tr>
                <th>Sex</th>
                <td>
                    <form:radiobutton path="sex" value="F" label="Female"/>&nbsp;&nbsp;&nbsp;
                    <form:radiobutton path="sex" value="M" label="Male"/>
                </td>
            </tr>
            <tr>
                <th><form:label path="dobDay"
                                cssErrorClass="redBold">Date of birth</form:label></th>
                <td>
                    <form:select path="dobDay" items="${dobDays}"/>
                    <form:select path="dobMonth" items="${dobMonths}"/>
                    <form:select path="dobYear" items="${dobYears}"/>
                </td>
            </tr>
            <tr>
                <th><form:label path="postcode" cssErrorClass="redBold">Postcode</form:label></th>
                <td><form:input path="postcode"/></td>
            </tr>
            <tr>
                <td/>
                <td><input type="submit" value="Register" class="button"/></td>
            </tr>
            <tr>
                <td/>
                <td><a href="login.html">Back to login</a></td>
            </tr>
            </tbody>
        </table>
    </div>
</form:form>
