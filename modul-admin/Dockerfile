
FROM openjdk:17-jdk-slim

COPY modul-admin/build/libs/modul-admin-0.0.1-SNAPSHOT.jar ./app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./app.jar"]
