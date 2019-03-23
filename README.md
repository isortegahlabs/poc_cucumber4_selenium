

Revisión de opciones 

Usage: java cucumber.api.cli.Main

```
mvn test -Dcucumber.options="-h"
```

[Cliente](https://github.com/cucumber/cucumber-jvm/blob/v4.2.6/core/src/main/resources/cucumber/api/cli/USAGE.txt)

## Referencia

### TestNG 

[cucumber-jvm](https://github.com/cucumber/cucumber-jvm/blob/580090bc2f7cdcc29830c2118f2ab2525663f81e/testng/README.md)  
[Using TestNG](https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html)

### Junit 4

JUnit. Unfortunately due to framework limitations
JUnit4 can only execute features in parallel. [*](https://cucumber.ghost.io/blog/announcing-cucumber-jvm-4-0-0/)

[Junit 4](https://docs.cucumber.io/guides/10-minute-tutorial/)  
[Junit 5](https://dzone.com/articles/embrace-junit5)

Assume
Through [Assume](https://junit.org/junit4/javadoc/4.12/org/junit/Assume.html#Assume()) JUnit provides:

a set of methods useful for stating assumptions about the conditions in which a test is meaningful. A failed assumption does not mean the code is broken, but that the test provides no useful information. The default JUnit runner skips tests with failing assumptions. Custom runners may behave differently.

The Cucumber runner supports Assume and will marked skipped scenarios as skipped.

