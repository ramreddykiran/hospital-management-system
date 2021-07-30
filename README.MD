Spring Boot multi module application

technologies : java 11, Gradle, Spring boot, JPA, H2 inline DB, RESTful services

-- After starting the application, login to H2 DB from browser
	
	http://localhost:8087/hospital-management-system/h2-console
		JDBC URL : jdbc:h2:mem:testdb
		UserName : sa

do not change username and password (no password needed) and connect
	
-- you can find doctor table. data.sql under src/main/resources loads the data in DB
	select * from doctor; 

DoctorService.java @PostConstruct method will insert at server start time

-- http://localhost:8087/hospital-management-system/doctors





	