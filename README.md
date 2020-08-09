# EndClothingAutomation

##Test Automation Design Architecture##

-The plan was to desing automation scripts based on given scenarios for END web based application. We have used selenium with java Bindings to autoamte the scenarios.

Cucumber:- As the given scenarios were in Gerkins Language(Given When Then), we have used Cucumber tool which supports BDD formate for automating the given scenarios and Junit
            as unit testing framework
            
            
Maven:- We have used Maven as build tool, so that all the dependencies can be maintained in POM.xml


Page Object Model:- We have implemented Page Object Model design pattren while designing scripts for the scenarios, so that all the properties of each page can be maintained in a
             seperate class. By this maintaince of the scripts will be easy
             
Extended Reports:- We have implemented extended reports for these scenarios, after the execution a HTML report will be generated in Reports folder



##Steps to Execute the designed scenarios##
1. Clone the project into local machine. We have used eclipse IDE for designing, you can use any IDE which supports Java with maven.
2. Change the ChromeDriver path. 
      Before we start please change the path of chrome driver. You cna change in the below path of the project
      Path:-
3. Build the project, so that all the required will be dwnloaded based on POM.xml
4. Go to Runner.Java class in       , right click on the code and run with Junit.
5. Execution will triggered with this and wait till execution complete
6. Once execution was completed, go to Reports folder and open HTML report. 
7. Complete results of the execution with steps will get recorded.


