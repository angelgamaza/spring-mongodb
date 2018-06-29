# Spring JPA Example

Spring REST API with MongoDB database connection.

This project does not have the complete correct structure because I will upload the mapping to DTO in the future.

Complete the properties file with your database credentials:

```
spring.data.mongodb.database = mongodb_database
spring.data.mongodb.authentication-database = mongodb_database
spring.data.mongodb.username = mongodb_username
spring.data.mongodb.password = mongodb_password
spring.data.mongodb.host = mongodb_host
spring.data.mongodb.port = mongodb_port
```

Initial MongoDB config:

Enter mongodb prompt typing ```mongo```.

Create new database ```use database_name;```

Create user for remote connections ```db.createUser({user:"user", pwd:"password", roles:["readWrite"]});```

Connect to prompt with the new user ```mongo -u user -p password --authenticationDatabase database_name --port mongo_port```

If you have to change mongodb port, edit ```/etc/mongod.conf``` replacing with the desired port.

