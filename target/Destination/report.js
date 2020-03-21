$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Resources/CtmEnergyQuote.feature");
formatter.feature({
  "line": 1,
  "name": "To Test different functionality of components within the journey to help user select and switch to better plan",
  "description": "",
  "id": "to-test-different-functionality-of-components-within-the-journey-to-help-user-select-and-switch-to-better-plan",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17867776700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Compare to market energy quote page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 40,
  "name": "User should be guided properly on how to get started",
  "description": "",
  "id": "to-test-different-functionality-of-components-within-the-journey-to-help-user-select-and-switch-to-better-plan;user-should-be-guided-properly-on-how-to-get-started",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user clicks on how to get started option",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User get to sees brief summary to explain further steps",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_clicks_on_how_to_get_started_option()"
});
formatter.result({
  "duration": 297868001,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_get_to_sees_brief_summary_to_explain_further_steps()"
});
formatter.result({
  "duration": 238492400,
  "status": "passed"
});
formatter.after({
  "duration": 91200,
  "status": "passed"
});
});