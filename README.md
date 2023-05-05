# README(SETUP)

### dependence (relationship)

* devbox
  * ref: https://github.com/jetpack-io/devbox

### init

```:terminal
$ devbox shell
```

### How to run the application

```:terminal
$ ./mvnw spring-boot:run \
    -Dspring.jmx.enabled=true \
    -Dspring-boot.run.jvmArguments="-Dcom.sun.management.jmxremote \
    -Dcom.sun.management.jmxremote.port=8086 \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dcom.sun.management.jmxremote.ssl=false"
```
