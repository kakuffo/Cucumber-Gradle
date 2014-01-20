<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <title>Whiteley's Zoo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript">
        function removeFavourite(animalId) {
            var proceed = confirm("Do you really want to remove this image from your favourites?");
            if (proceed) {
                window.location = "removeFavourite.html?animalId=" + animalId;
            }
        }
    </script>
</head>
<body>
<div id="headerWrap">
    <tiles:insertAttribute name="header"/>
</div>
<div id="navWrap">
    <tiles:insertAttribute name="nav"/>
</div>
<div id="bodyWrap">
    <tiles:insertAttribute name="body"/>
</div>
</body>
</html>