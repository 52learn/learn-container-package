# package docker image
1. Create DockerFile

2. Use jib-maven-plugin package docker image，and publish to docker hub ：
```
mvn clean compile com.google.cloud.tools:jib-maven-plugin:build -Dimage=loveallan/javaweb-docker
```

# run docker contianer
```
docker run -d -p 8080:8080 --name javaweb-docker  loveallan/javaweb-docker
```

# Reference
SpringBoot打包成Docker镜像 :  
https://www.cnblogs.com/niceyoo/p/13796792.html  
