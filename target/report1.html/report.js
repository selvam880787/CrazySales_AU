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
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.baseclasses.BaseClassCucumber.fill(BaseClassCucumber.java:182)\r\n\tat org.stepdefinition.UserLogin.userEnterTheUsernameAndPassword(UserLogin.java:29)\r\n\tat ✽.user enter the username and password(file:src/test/resources/featureFiles/user_login.feature:7)\r\n",
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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: unable to discover open pages\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-3DLERL0\u0027, ip: \u0027192.168.43.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x0111D953+2414931]\n\tOrdinal0 [0x010AF5E1+1963489]\n\tOrdinal0 [0x00F9C6B8+837304]\n\tOrdinal0 [0x00FBCAE3+969443]\n\tOrdinal0 [0x00FB86FA+952058]\n\tOrdinal0 [0x00FB5FB1+942001]\n\tOrdinal0 [0x00FE9100+1151232]\n\tOrdinal0 [0x00FE8D5A+1150298]\n\tOrdinal0 [0x00FE42B6+1131190]\n\tOrdinal0 [0x00FBE860+976992]\n\tOrdinal0 [0x00FBF756+980822]\n\tGetHandleVerifier [0x0138CC62+2510274]\n\tGetHandleVerifier [0x0137F760+2455744]\n\tGetHandleVerifier [0x011AEABA+551962]\n\tGetHandleVerifier [0x011AD916+547446]\n\tOrdinal0 [0x010B5F3B+1990459]\n\tOrdinal0 [0x010BA898+2009240]\n\tOrdinal0 [0x010BA985+2009477]\n\tOrdinal0 [0x010C3AD1+2046673]\n\tBaseThreadInitThunk [0x7639FA29+25]\n\tRtlGetAppContainerNamedObjectPath [0x777E7A7E+286]\n\tRtlGetAppContainerNamedObjectPath [0x777E7A4E+238]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat org.baseclasses.BaseClassCucumber.launchChrome(BaseClassCucumber.java:109)\r\n\tat org.stepdefinition.UserLogin.userShouldLaunchTheBrowser(UserLogin.java:15)\r\n\tat ✽.user should launch the browser(file:src/test/resources/featureFiles/user_login.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should load the url",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.userShouldLoadTheUrl()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
});