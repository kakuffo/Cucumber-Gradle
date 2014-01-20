<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <c:if test="${not empty sessionScope.user}">
    You are logged in as ${sessionScope.user.username} (Sex: ${sessionScope.user.sex})
    (<a href="logout.html">Logout</a>)
</c:if>
</div>
