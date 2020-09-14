# OSGi Examples
This is just a simple OSGi example code, covering OSGi core concepts for learning purposes.

OSGi bundle is generated with the help of [Apache bundle plugin for Maven](https://felix.apache.org/documentation/subprojects/apache-felix-maven-bundle-plugin-bnd.html "Apache bundle plugin for Maven") on the projects.

For further details, check their README files in their respective folders.

In order to try out the example, you should run mvn clean install for Maven projects and install the generated bundles onto an OSGi container like [Apache Karaf](https://karaf.apache.org/ "https://karaf.apache.org/"), [Eclipse equinox](https://www.eclipse.org/equinox/ "https://www.eclipse.org/equinox/") or  [Knopflerfis](https://www.knopflerfish.org/ "hhttps://www.knopflerfish.org/").

The order in which the bundles will be generated matters! This is because the bundles are consumed by others as a dependency, Maven will store the bundle into the local repository after the Maven install command, the consumer bundle will resolve it.
The generated bundles can be found in the target folder in each project.

# Installation instructions
Reference guide to [Apache Karaf](https://karaf.apache.org/)
- Download the OSGi container.
- Run the ***karaf*** executable in the ***bin*** folder.
- Install the Service Component Runtime with the `feature:install scr` command.
- Install this bundle onto the container using `install file://{PATH_TO_YOUR_BUNDLE}`.
- Check the Bundle IDs and run `start {BUNDLE_ID}` for the installed bundle. In case you can't find them, you can always check all of the installed bundles with the list command and get the IDs from there.

The order in which you install the provider and consumer bundle doesn't matter, what matters is the order in which it starts.
