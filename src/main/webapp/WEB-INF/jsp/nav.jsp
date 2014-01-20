<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty sessionScope.user}">
    <ul>
        <li><a href="home.html">My favourites</a></li>
        <li><a href="gallery.html">Gallery</a></li>
    </ul>
</c:if>
