# Random Number Example

This project 'random-number-example' contain two projects: 
- random-number-generator
- random-number-reader

As the name implies 'random-number-generator' will generate random numbers when requested and 'random-number-reader' will request and log the result.

After running mvn clean install, you can find the bundle in the **target** folder or respective projects. Make sure to run _‘random-number-generator’_ followed by _‘random-number-reader’_ since project  _‘random-number-generator’_ is a dependency for the project _‘random-number-reader’_.

## Note

- A very important thing to make sure you don't forget to add into the pom.xml file of Maven projects which generate bundles through the Apache bundle plugin is this line: <packaging>bundle</packaging>.
- Also, make sure to add the correct package to export and import in the pom.xml using _Export-Package_ and _Import-Package_ respectively.

# Running bundle inside Karaf
- After **maven install** on respective projects. It will create the OSGI bundle of the projects and add to your local maven repo.
- Our Bundle is now prepared to run inside **Karaf**.
- Start Karaf in Debugging Mode by typing ***./karaf*** debug in your ***KARAF/bin*** Folder.
- Now install bundles you had created in the previous step.
```sh
  karaf@root()> install mvn:com.vishnu/random-number-generator/0.0.1-SNAPSHOT
  Bundle ID: 83
```
```sh
  karaf@root()> install mvn:com.vishnu/random-number-reader/0.0.1-SNAPSHOT
  Bundle ID: 84
 ```
- This will return unique bundle IDs for each of the bundles.
- We can use the start command in the karaf console to start the bundle.
- Start bundle of project _random-number-generator_ followed by _random-number-reader_, the order is important since the later depends on the former.
