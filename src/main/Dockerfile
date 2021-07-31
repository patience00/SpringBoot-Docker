FROM frolvlad/alpine-oraclejre8:slim

COPY demo-0.0.1.jar app.jar

# Write TimeZone
RUN echo "Asia/Shanghai" > /etc/timezone
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

EXPOSE 8090
CMD java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
