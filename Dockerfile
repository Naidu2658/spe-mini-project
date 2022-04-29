FROM openjdk:11
COPY ./target/speminiproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "speminiproject-1.0-SNAPSHOT-jar-with-dependencies.jar" ,"calculator.class"]
CMD ["echo", "helloworld"]
