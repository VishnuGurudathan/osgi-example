# Random Number Example
----
This project 'random-number-example' contain two projects: 
- random-number-generator
- random-number-reader

As the name implies 'random-number-generator' will generate random numbers when requested and 'random-number-reader' will request and log the result.

After running mvn clean install, you can find the bundle in the **target** folder or respective projects. Make sure to run _‘random-number-generator’_ followed by _‘random-number-reader’_ since project  _‘random-number-generator’_ is a dependency for the project _‘random-number-reader’_.

## Note
----
- A very important thing to make sure you don't forget to add into the pom.xml file of Maven projects which generate bundles through the Apache bundle plugin is this line: <packaging>bundle</packaging>.
- Also, make sure to add the correct package to export and import in the pom.xml using _Export-Package_ and _Import-Package_ respectively.
