Requirements
In order to utilise this project you need to have the following installed locally:

Maven 3
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 1.8

Usage(RUN)
The project is broken into separate modules for API, UI, Performance and Security testing. Each of these modules can be utilised independently of the others using maven profiles.

To run the challenge, navigate to SeleniumJavaFramework directory and run:

mvn clean install test -DsuiteXmlFile=MakingSenseExam.xml