# Build Instructions

### Deploy to Bintray

```sh
$ mvn clean install -DBUILD_NUMBER=1
$ ./pushToBintray.sh YOUR_BINTRAY_USER_NAME SECRET_API_KEY_FOR_YOUR_BINTRAY_USER_NAME multi-os-engine eclipse-dev moe-eclipse 1.0.0 ./sites/MOEUpdateSite/target/repository
```

### Eclipse install from the Bintray

http://dl.bintray.com/multi-os-engine/eclipse-dev/

### Deploy to local maven repository

```sh
$ mvn clean install -DBUILD_NUMBER=1
```
