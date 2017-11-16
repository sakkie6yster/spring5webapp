To run the application (mvn springboot:
------------------------------------------
go to folder: cd /Users/ivanniekerk/DevEnv/Projects/spring5webapp/
from root folder: mvn spring-boot:run



To access the h2 in-memory database:
----------------------------------------
http://localhost:8080/h2-console


Ensure JDBC URL is:
-------------------------------------
Driver class:  org.h2.Driver
JDBC URL:      jdbc:h2:mem:testdb