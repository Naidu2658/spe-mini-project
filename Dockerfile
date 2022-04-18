FROM openjdk:8
COPY ./target/speminiproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "speminiproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]