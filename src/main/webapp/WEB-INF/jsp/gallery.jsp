<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<h1>Gallery</h1>

<p>
    Click <img src="images/coldStar.png" alt="Add to favourites"/> to add a favourite and
    <img src="images/hotStar.png" alt="Remove from favourites"/> to remove a favourite, or
    <a href="home.html">view just your favourites</a>.
</p>
<c:forEach items="${requestScope.allAnimals}" var="animal">
    <p>
        <span><img src="gallery/${animal.filename}" alt="${animal.filename}"></span>
        <c:choose>
            <c:when test="${requestScope.favourites[animal.id]}">
                <a href="removeFavourite.html?animalId=${animal.id}&gallery=true">
                    <img src="images/hotStar.png" alt="Remove from favourites"/>
                </a>
            </c:when>
            <c:otherwise>
                <a href="addFavourite.html?animalId=${animal.id}">
                    <img src="images/coldStar.png" alt="Add to favourites"/>
                </a>
            </c:otherwise>
        </c:choose>
    </p>
</c:forEach>
