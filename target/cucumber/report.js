$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Falabella.feature");
formatter.feature({
  "name": "Search a product on falabella",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user searches the product",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "\u003cproduct\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "selects the product",
  "keyword": "And "
});
formatter.step({
  "name": "add the product to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "name": "The user verifies that the product of the shopping cart is the same one that was selected",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "\u003cproduct\u003e",
        "\u003cquantity\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "quantity"
      ]
    },
    {
      "cells": [
        "Huawei P30",
        "1"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in the falabellas site",
  "keyword": "Given "
});
formatter.match({
  "location": "FalabellaStepDefinitions.userIsInTheFalabellasSite()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user searches the product",
  "rows": [
    {
      "cells": [
        "Huawei P30"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FalabellaStepDefinitions.theUserSearchesTheProduct(Product\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.117)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-9MBNOCMO\u0027, ip: \u0027192.168.127.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\MARIAN~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 79.0.3945.117, webStorageEnabled: true}\nSession ID: 720435b9b3613b42fc8e7129cc5697a1\n*** Element info: {Using\u003dname, value\u003dNtt}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:222)\r\n\tat co.com.falabella.stepsdefinitions.FalabellaStepDefinitions.theUserSearchesTheProduct(FalabellaStepDefinitions.java:59)\r\n\tat ✽.The user searches the product(src/test/resources/features/Falabella.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "selects the product",
  "keyword": "And "
});
formatter.match({
  "location": "FalabellaStepDefinitions.selectsTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "add the product to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "FalabellaStepDefinitions.addTheProductToTheShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user verifies that the product of the shopping cart is the same one that was selected",
  "rows": [
    {
      "cells": [
        "Huawei P30",
        "1"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FalabellaStepDefinitions.theUserVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
});