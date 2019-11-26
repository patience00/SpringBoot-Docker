# SpringBoot-Docker
使用Docker部署SpringBoot

这里使用的Daocloud部署的:https://dashboard.daocloud.io

可以免费使用,但并行构建任务只有一个.

Dockerfile:

#指定SpringBoot需要的基础镜像
 FROM maven:3.3.3
 #复制pom文件到maven
 ADD pom.xml /tmp/build/
 #运行指定命令
 RUN cd /tmp/build && mvn -q dependency:resolve
 #复制项目文件
 ADD src /tmp/build/src
         #构建应用
 RUN cd /tmp/build && mvn -q -DskipTests=true package \
         #拷贝编译结果到指定目录
         && mv target/*.jar /app.jar \
         #清理编译痕迹
         && cd / && rm -rf /tmp/build

 VOLUME /tmp
 EXPOSE 9100
 ENTRYPOINT ["java","-Xmx150m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
