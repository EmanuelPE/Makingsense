# MakingSense Automation Challenge

By Emanuel Pereyra

## Requirements
In order to utilise this project you need to have the following installed locally:

Maven 3
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 1.8

## Usage(RUN):

The project is broken into separate modules for API, UI, Performance and Security testing. Each of these modules can be utilised independently of the others using maven profiles.

To run the challenge, navigate to SeleniumJavaFramework directory and run:

```bash
mvn clean install test -DsuiteXmlFile=MakingSenseExam.xml
```

## Comments
This a simple type how I can resolve the examen if you want I can build a method to do the things more easy and scalable because we don't need create a lot of objects for different type of filters for example and with only one method and can select different filters and inputs with some parameters
