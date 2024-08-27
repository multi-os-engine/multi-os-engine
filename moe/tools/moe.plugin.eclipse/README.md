# MOE Eclipse Plugin

This plugin adds Multi-OS Engine Support to Eclipse IDE.

## Building

### Create a Local Build

```bash
mvn clean package -DBUILD_NUMBER=1
```

### Deploy to Local Maven Repository

```bash
mvn clean install -DBUILD_NUMBER=1
```

### Deploy to Bintray (Pre-Release)

```bash
mvn clean package -DBUILD_NUMBER="$PLUGIN_BUILD_NUMBER"
./pushToBintray.sh \
    "$BINTRAY_USER" \
    "$BINTRAY_API_KEY" \
    multi-os-engine \
    eclipse-dev \
    moe-eclipse \
    "$PLUGIN_VERSION" \
    ./sites/MOEUpdateSite/target/repository
```

```text
PLUGIN_VERSION format: Major.Minor.Patch.vYYYYMMDDHHmm-N
    YYYY - Year
    MM - Month
    DD - Day
    HH - Hour
    mm - Minute
    N - PLUGIN_BUILD_NUMBER
```

Downloadable from [here](http://dl.bintray.com/multi-os-engine/eclipse-dev/).

### Deploy to Bintray (Release)

```bash
mvn clean package -DBUILD_NUMBER="$PLUGIN_BUILD_NUMBER"
./pushToBintray.sh \
    "$BINTRAY_USER" \
    "$BINTRAY_API_KEY" \
    multi-os-engine \
    eclipse \
    moe-eclipse \
    "$PLUGIN_VERSION" \
    ./sites/MOEUpdateSite/target/repository
```

Downloadable from [here](http://dl.bintray.com/multi-os-engine/eclipse/).

## Developing in Eclipse

Before importing the project into Eclipse or when external Multi-OS Engine
dependencies change, please run:

```bash
mvn verify -DBUILD_NUMBER=1
```
