
# Microservice creation using modular KumuluzEE and JIB

[KumuluzEE](https://ee.kumuluz.com/) is a modern JavaEE application server with a modular structure.

[JIB](https://github.com/GoogleContainerTools/jib) is a [Maven](https://maven.apache.org/) plugin for building docker images.

The project aims to deliver a pragmatic approach to build ready-to-deploy microservice containers directly with Maven.

Since only Maven is needed, the requirements for the CI:CD pipeline are reduced.


##### Build the service and test it

```shell
mvn clean install
```

Please use JDK 8 to start the server:

```shell
java -jar target/kumuluz-microservice-1.0.0-SNAPSHOT.jar
```
[http://localhost:8080/helloworld](http://localhost:8080/helloworld)

##### Build to local docker daemon (docker daemon permissions required)

```shell
mvn clean install jib:dockerBuild
```

##### Build TAR ball with container (docker daemon permissions required for second command)

```shell
mvn clean install jib:buildTar
sudo docker load --input target/jib-image.tar
sudo dock run -p 8080:8080 kumuluz-microservice
```

[Download](target)
