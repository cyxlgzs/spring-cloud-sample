# spring cloud sample

    this is a project for spring cloud test, and show how a microservice started

## 1. remote configuration repository

    https://github.com/cyxlgzs/cloud-config
    
## 2. cloud config server
    
    cloud-config-server
  
## 3. cloud client

    cloud-client
    
## 4. usage

### 4.1 run config server
    
    java -jar cloud-config-server-1.0-SNAPSHOT.jar

### 4.2 run client
    
    java -jar cloud-client-1.0-SNAPSHOT.jar
    
    if want get test properties run
    
    java -jar cloud-client-1.0-SNAPSHOT.jar --config.profile=test
    
### 4.3 refresh configuration

    do the post request to 
    
    http://localhost:8080/refresh
 