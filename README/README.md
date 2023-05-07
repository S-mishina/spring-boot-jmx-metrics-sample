# README

## setup

### dependence (relationship)

* devbox
  * ref: https://github.com/jetpack-io/devbox

### init

```:terminal
$ devbox shell
```

## execution method

### How to run the application

```:terminal
$ ./mvnw spring-boot:run \
    -Dspring.jmx.enabled=true \
    -Dspring-boot.run.jvmArguments="-Dcom.sun.management.jmxremote \
    -Dcom.sun.management.jmxremote.port=8086 \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dcom.sun.management.jmxremote.ssl=false"
```

## Examples of Operation

Launch the program to access the application.
curl will also work.

```:ex
curl http://localhost
```

Check with jmx and you will see a RANDOM number.

![jconsole](/README/img/jconsole.png)

A detailed view of the metrics is described in tab.