$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/marmi/eclipse-workspace/Cucumber/src/main/java/Features/search.feature");
formatter.feature({
  "line": 1,
  "name": "Walmart search of a product",
  "description": "",
  "id": "walmart-search-of-a-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Walmart search result should show number of total products",
  "description": "",
  "id": "walmart-search-of-a-product;walmart-search-result-should-show-number-of-total-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on walmart homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for a product",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.user_on_walmart_homepage()"
});
formatter.result({
  "duration": 12023765901,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.search_product()"
});
formatter.result({
  "duration": 9722670099,
  "status": "passed"
});
});