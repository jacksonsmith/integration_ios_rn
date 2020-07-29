# React Native Android setup

### Exporting the artifact

Generate the bundle
```
yarn run build-android-bundle
```

And create the .aar file with
```
./gradlew :SellingCartLibrary:assembleRelease
```

The artifact will be available at `android/SellingCartLibrary/build/outputs/aar/`.
