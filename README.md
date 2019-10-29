# StringOperations
This is a maven project. The code written in Java as you know
I set the compiler settings for Java 1.8 in pom.xml

There are 2 main ways to import the project from the remote repo.

I am writing the steps for IntelliJ and I am using MacBook so menu order might be slightly different for Windows.

1- You can do git clone from the repo after that you can open it by using IntelliJ or any IDE for Java that you prefer.
   Then you can open the folder by click File>Open. Obviously you need to show the path where you cloned the repo in your local.
2- You can directly click File>New>Project From Version Control>Git
    Then you need to paste https://github.com/zcalis/StringOperations.git into URL input
    and select a folder where the project to be imported then click Clone button.

You need to import the dependencies from pom.xml in this case there is only JUnit as a dependency for running unit tests.
To do right click on pom.xml and select Maven and click Generate Folders and Update Imports. This will import the dependencies.
After that you need to click on src/test/java and you will see two classes which are StringModifier and UnitTest
Right click each of those files and click Run button

Please let me know any questions and concerns.
