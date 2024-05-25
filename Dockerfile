FROM openjdk:17
VOLUME /tmp
COPY target/rest-ovas-0.0.1-SNAPSHOT.jar java-app.jar
EXPOSE 8080
COPY libovaIO.so /lib64
COPY lib_Sjf.so /lib64
COPY liblibreria_Taylor.so /lib64
ENV LD_LIBRARY_PATH=/usr/local/lib/jni:/lib64:$LD_LIBRARY_PATH
ENTRYPOINT ["java", "-jar", "java-app.jar"]