# scrgt-test-selenium

##### Set up base Selenium test project #####
1) Clone project from Github (https://github.com/SalientCRGT/scrgt-test-selenium.git)
2) Open a blank Eclipse workspace
3) Import the cloned project as a Maven project
4) Modify the /src/test/resources/properties/configuration.properties file and change the value for environment from "remote" to "local"
5) Run /src/test/java/com.scrgt.testcases/CucumberRunTest.java file as JUnit Test.

If the Chrome browser opens the SalientCRGT web site and then closes it the project is set up correctly.

##### Adding new test cases #####
1) Modify the /src/test/resources/properties/configuration.properties file and change the value for url to the intended application url.
2) Add more BDD features and scenarios in feature files under the /src/test/resources/ directory. They can be in the same file or in multiple files
3) Add more corresponding Java test methods under the /src/test/java/com.scrgt.testcases/ directory. They can be in the same Java file or in multiple files. The annotations of the Java methods must match the scenarios in the feature file(s).

##### Run tests locally #####
1) Make sure the value for environment is "local" in the /src/test/resources/properties/configuration.properties file 
2) Run /src/test/java/com.scrgt.testcases/CucumberRunTest.java file as JUnit Test


##### Run tests without opening browser window #####
The same steps can be used for CI/CD Jenkins integration.
1) Make sure the value for environment is "remote" in the /src/test/resources/properties/configuration.properties file 
2) Go to the directory with the pom.xml file and open a cmd prompt. Run "mvn test".
