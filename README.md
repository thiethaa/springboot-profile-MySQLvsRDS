# springboot-profile-MySQLvsRDS

profile "local" is using local MYSQL Database and profile "dev" is using AWS RDS MySQL

local profile run on port : http://localhost:7000/userlist

dev profile run on port : http://localhost:5000/userlist

to switch environtment:
    by using mvn command:
    
           mvn spring-boot:run -Dspring-boot.run.profiles={profile.name}
    
   or specified on application.properties file:
    
          spring.profiles.active={profile.name}

    
