FROM gradle:jdk21 AS gradleimage
COPY . /home/gradle/source
WORKDIR /home/gradle/source
RUN gradle build

FROM amazoncorretto:21-alpine-jdk
VOLUME /tmp
COPY --from=gradleimage /home/gradle/source/build/libs/*SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]