# MOE SDK Publisher

This project creates a publishable SDK.

## Publishing Custom Builds

```sh
export MOE_HOME_PATH=/path/to/build/directory/moe_home
./gradlew publishToMavenLocal
```

## Notes

Custom SDKs require customized [Multi-OS Engine Gradle plugins](https://github.com/multi-os-engine/moe-plugin-gradle).
