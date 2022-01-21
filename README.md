README

KARATE\_TEST AUTOMATION

The project below was part of a technical Assessment for ABSA

  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

_ **ABSA Technical Assessment** _

1. _Using java karate framework_
2. _Construct/Send the following xml payload to this endpoint _[_https://verifye.co.za/response.php_](https://verifye.co.za/response.php)_ using an xml parser/library_
3. _The endpoint will return the message payload you send it, validate the response that is returned using xpath validation for tags/values._
4. _Display use of parameterization, test data, repeatable and reusable functions._
5. _Check your framework into  __**github**__  and provide me with the repository link_
6. _Ensure there is a read me file with instructions on how to clone, install, execute your project, and view the test results_
7. _Please feel free to include anything over and above what I&#39;ve outlined_

Clone:

Clone the repository with this command:

git clone [https://github.com/Teeran/TeeranAbsaAssignment.git](https://github.com/Teeran/TeeranAbsaAssignment.git)

**Folder Structure** :

![](RackMultipart20220121-4-1wpyu1h_html_9c57ab0eac2b290.png)

**How to Execute** :

1. Feature File: - Go to specific feature and click on the execute button next to the scenario

Note: You can either run at feature level or at Scenario.

![](RackMultipart20220121-4-1wpyu1h_html_4a900c496e7defe9.png)

1. Test Runner: - Edit runner file with correct @tag and execute runner file

![](RackMultipart20220121-4-1wpyu1h_html_5f2a198138659789.png)

1. MAVEN: - mvn clean test -D tags=&quot;@RunwithTagCheck&quot;

![](RackMultipart20220121-4-1wpyu1h_html_75e62c0980d04b98.png)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

**Parameterisation:**

#(Placeholder) was implemented to parameterise the whole payload which is mapped in an XML file that was created under &quot;payloadValidation&quot; folder. Using the payload provided.

![](RackMultipart20220121-4-1wpyu1h_html_2c90ab20aa7368e6.png)

For every execution, the data set from the Examples were used to populate the payload which would in turn be used to hit the endpoint. [Feature file]

**Validation** :

Validation was done on all the fields for the response received. All the fields were validated against the data set from the Example [Feature file]

Please note all the Validation steps are separated in a different feature file;

![](RackMultipart20220121-4-1wpyu1h_html_f4b709da609735d7.png)

![](RackMultipart20220121-4-1wpyu1h_html_ea2b5e4b77f79cf0.png)

The above feature is then called in the main feature file (MyFirstTest.feature) for it to be executed all the way at the end just after the response has been received.

**RE-USE** :

![](RackMultipart20220121-4-1wpyu1h_html_b3eac27a61d9f54a.png)

1. Re-use of Method from JAVA class
2. Re-use of functions from one Feature to another.

Made use of random Number ( **JAVA Method** ) and Current Date (reusable **Feature function** ) to concatenate with an already present value for MSGID starting value such as &quot;021/DDINP/Puleng/&quot;

**REPORT** :

After execution, a report is generated to:

_Src/Target/report_

![](RackMultipart20220121-4-1wpyu1h_html_93c2714cde79e74a.png)

And the full path will be printed in the console, paste into browser to view:

_/target/cucumber-html-reports/overview-features.html_

Note: Reuse a snippet of code from internet to convert cucumber json report to a more presentable HTMl report, rather than the normal karate HTML report.

MORE:

@tag, Scenario Outline, Examples were used