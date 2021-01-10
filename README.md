# springboot-profile-MySQLvsRDS

profile "local" is using local MYSQL Database and profile "dev" is using AWS RDS MySQL

to switch environtment:
    by using mvn command:
    
           mvn spring-boot:run -Dspring-boot.run.profiles={profile.name}
    
    or specified on application.properties file:
    
          spring.profiles.active={profile.name}

    
