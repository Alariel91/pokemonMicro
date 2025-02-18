FROM openjdk:21
COPY "./target/pokemon-0.0.1-SNAPSHOT.jar" "pokemon.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "pokemon.jar"]