cd $PSScriptRoot

if (-Not (Test-Path Env:\JAVA32_HOME)) {
	Write "Environment variable JAVA32_HOME is not set"
	Exit 1
}

if (Test-Path Env:\JAVA_HOME) {
	Remove-Item Env:\JAVA_HOME
}

if (Test-Path build) {
	Remove-Item build -recurse
}

Write "Running tests on 64-bit"
$out = .\gradlew test
$TEST_RETURN_CODE=$LASTEXITCODE
if ($TEST_RETURN_CODE -ne 0) {
	Write $out
	Exit $TEST_RETURN_CODE
}

Write "Running tests on 32-bit"
$env:JAVA_HOME = $Env:JAVA32_HOME
$out32 = .\gradlew test "-Ptest.win32env=true"
$TEST_RETURN_CODE32=$LASTEXITCODE
if ($TEST_RETURN_CODE32 -ne 0) {
	Write $out32
	Exit $TEST_RETURN_CODE32
}
