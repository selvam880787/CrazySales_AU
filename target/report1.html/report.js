$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/user_login.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.userShouldLaunchTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with incorrect crediantials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userEnterTheUsernameAndPassword()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.baseclasses.BaseClassCucumber.fill(BaseClassCucumber.java:182)\r\n\tat org.stepdefinition.UserLogin.userEnterTheUsernameAndPassword(UserLogin.java:30)\r\n\tat ✽.user enter the username and password(file:src/test/resources/featureFiles/user_login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should get the error message",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userShouldGetTheErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.userShouldLaunchTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with empty username and incorrect password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter empty username and password",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userEnterEmptyUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the error message",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userShouldGetTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.userShouldLaunchTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with empty username and empty password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter empty username and empty password",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userEnterEmptyUsernameAndEmptyPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the error message",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userShouldGetTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.userShouldLaunchTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with  username and empty password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter empty username and password",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userEnterEmptyUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the error message",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userShouldGetTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.userShouldLaunchTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with correct crediantials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter empty username and password",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userEnterEmptyUsernameAndPassword()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d102.0.5005.115)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-3DLERL0\u0027, ip: \u0027192.168.43.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\Selva\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57969}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9ad85605e16e6bd7762f6d11dea6d884\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.baseclasses.BaseClassCucumber.fill(BaseClassCucumber.java:182)\r\n\tat org.stepdefinition.UserLogin.userEnterEmptyUsernameAndPassword(UserLogin.java:55)\r\n\tat ✽.user enter empty username and password(file:src/test/resources/featureFiles/user_login.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should navigated to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.userShouldNavigatedToTheHomePage()"
});
formatter.result({
  "status": "skipped"
});
});