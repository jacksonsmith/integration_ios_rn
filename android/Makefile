### CODE CHECK ###

lint: # run lint check on code, report in <module>/build/reports/lint-results-naturaDebug.html
	./gradlew lint

run-unit-tests:
	./gradlew testDebug

disable-animations:
	adb shell settings put global window_animation_scale 0
	adb shell settings put global transition_animation_scale 0
	adb shell settings put global animator_duration_scale 0

enable-animations:
	adb shell settings put global window_animation_scale 1
	adb shell settings put global transition_animation_scale 1
	adb shell settings put global animator_duration_scale 1

run-instrumented-tests: disable-animations
	./gradlew connectedDebugAndroidTest

run-jacoco-coverage-verification:
	./gradlew jacocoTestCoverageVerification

### BUILD AND INSTALL SAMPLE ###

clear-project: # clean project and build cache
	./gradlew clean cleanBuildCache
