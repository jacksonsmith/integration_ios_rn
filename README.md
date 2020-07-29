# MODULE_REACT_NATIVE
This project is a React Native module that is ready to be imported in other native Android/iOS projects.


## iOS

### Preparing to export
First, you need to create the `SellingCartApp.podspec` file, which contains the project's information and the git URL where it should be hosted. 

Pay attention to the line `s.resources = 'ios/Pod/Assets/*'`, this is where we are setting the path to the `index.ios.jsbundle` file.

### Publishing
1. Run `yarn run build-ios-bundle` to create the file `index.ios.jsbundle` inside the `'ios/Pod/Assets/'` folder. 
2. Commit and push to the repo, so that the external projects can use it.


## Android

### Preparing to export
First, you need to create a folder `assets` inside `SellingCartLibrary/src/main`

###  Publishing

1. Run `yarn run build-android-bundle` to create the bundle
2. Run `./gradlew :SellingCartLibrary:assembleRelease` to generate the .aar
3. The artifact will be available at `android/SellingCartLibrary/build/outputs/aar/`.