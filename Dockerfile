FROM shipilev/openjdk-shenandoah:8
ADD ./target/*.jar /app/app.jar
WORKDIR /app/
RUN mkdir -p /app/config && chmod -R a+rwx /app