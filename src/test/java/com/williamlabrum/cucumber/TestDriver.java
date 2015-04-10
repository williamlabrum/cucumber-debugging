package com.williamlabrum.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * use the following to run only specific tests from the command line:
 * <ul>
 * <li><strong>Test only desired tags:</strong>
 * <pre>mvn test -Dskip.bdd.tests=false -Dcucumber.options="--tags @tagname1 @tagname2"</pre></li>
 * 
 * <li><strong>Test only desired tags but not undesired tags:</strong>
 * <pre>mvn test -Dskip.bdd.tests=false -Dcucumber.options="--tags @tagname1 --tags ~@tagname2"</pre>
 * 
 * </li><li><strong>Test only desired features:</strong>
 * <pre>mvn test -Dskip.bdd.tests=false -Dcucumber.options="--name featureName"</pre></li></ul>
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }, tags = { "~@in-progress", "~@skip"})
public class TestDriver {
}
