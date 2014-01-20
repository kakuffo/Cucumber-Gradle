<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>My Favourites</h1>

<c:if test="${not empty requestScope.favourites}">
    <p>
        <a href="gallery.html">Browse the gallery</a> to find more favourites,
        or click <img src="images/hotStar.png" alt="Remove from favourites"/> below to remove
        a favourite.
    </p>
    <c:forEach items="${requestScope.favourites}" var="animal">
        <p>
            <img src="gallery/${animal.filename}" alt="${animal.name}">
            <a href="javascript:void(0);" onclick="removeFavourite('${animal.id}')">
                <img src="images/hotStar.png" alt="Remove from favourites"/>
            </a>
        </p>
    </c:forEach>
</c:if>

<c:if test="${empty requestScope.favourites}">
    <p>
        You don't have any favourites.
        <a href="gallery.html">Browse the gallery</a> to find some you like.
    </p>
</c:if>
