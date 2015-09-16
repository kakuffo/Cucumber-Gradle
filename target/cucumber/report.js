$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Add to Cart",
  "description": "This feature will test functionality of adding different products to the User basket from different flow",
  "id": "add-to-cart",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "Search a product and add the first result/product to the User basket",
  "description": "",
  "id": "add-to-cart;search-a-product-and-add-the-first-result/product-to-the-user-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User searched for Lenovo Laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Add the first laptop that appears in the search result to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User basket should display with 1",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});