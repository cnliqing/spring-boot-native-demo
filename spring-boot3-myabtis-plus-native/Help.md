# Requirements

Requirements of this demo application are follows:

* Docker
* GraalVM 22.3+
* JDK 17+
* Spring Boot 3
* MyBatis Spring Boot 3.0.1+

Build a native image.

```
./mvnw -Pnative clean native:compile
```

# Hot to run

Run the native image.

```
./target/spring-boot3-myabtis-plus-native -Djavax.xml.accessExternalDTD=all
```