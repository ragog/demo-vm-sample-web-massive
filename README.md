### Environment Setup

1. Global Dependencies
    * [Install Maven](https://maven.apache.org/install.html)
    * Or Install Maven with [Homebrew](http://brew.sh/)
    ```
    $ brew install maven
    ```
2. Sauce Credentials
    * In the terminal export your Sauce Labs Credentials as environmental variables:
    ```
    $ export SAUCE_USERNAME=<your Sauce Labs username>
	$ export SAUCE_ACCESS_KEY=<your Sauce Labs access key>
	$ export DEVICE_COVERAGE=<your coverage matrix as defined in TestTarget class> (e.g.: light-regression)
	$ export SAUCE_ENDPOINT=<the endpoint matching the Sauce Labs DC you want to target> (e.g.: @ondemand.eu-central-1.saucelabs.com)
	$ export SAUCE_REST_ENDPOINT=<the REST endpoint matching the Sauce Labs DC you want to target> (e.g.: https://eu-central-1.saucelabs.com/rest/v1)
    ```
3. Project Dependencies
	* Check that Packages are available
	```
	$ mvn test-compile

	```
### Running Tests

Tests in Parallel:
	```
	$ mvn test
	```

[Sauce Labs Dashboard](https://saucelabs.com/beta/dashboard)

### Advice/Troubleshooting
1. It may be useful to use a Java IDE such as IntelliJ or Eclipse to help troubleshoot potential issues. 
2. There may be additional latency when using a remote webdriver to run tests on Sauce Labs. Timeouts or Waits may need to be increased.
    * [Selenium tips regarding explicit waits](https://wiki.saucelabs.com/display/DOCS/Best+Practice%3A+Use+Explicit+Waits)

### Resources
##### [Sauce Labs Documentation](https://wiki.saucelabs.com/)

##### [SeleniumHQ Documentation](http://www.seleniumhq.org/docs/)

##### [TestNg Documentation](http://testng.org/javadocs/index.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### Stack Overflow:
* [Related Stack Overflow Threads](http://stackoverflow.com/questions/27355003/advise-on-hierarchy-for-element-locators-in-selenium-webdriver)