#!/bin/bash

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

moe_repo_root=$PWD/../../..

if [ -z $MOE_HOME ]; then
	echo MOE_HOME is not defined - will be set to $target_repo/moe_home
	MOE_HOME=$target_repo/moe_home
fi	

if [ -d $MOE_HOME ]; then 
    rm -rf $MOE_HOME
fi

MOE_TMP=${TMPDIR}/moe_tmp
rm -rf $MOE_TMP

mkdir -p $MOE_TMP/moe-tools
mkdir -p $MOE_TMP/jars-repack/moe-ios
mkdir -p $MOE_TMP/jars-repack/moe-core
mkdir -p $MOE_TMP/jars-repack/moe-ios-retro
mkdir -p $MOE_TMP/jars-repack/moe-ios-junit
mkdir -p $MOE_TMP/jars-repack/ios-javadoc
mkdir -p $MOE_HOME/sdk
mkdir -p $MOE_HOME/tools

unzip $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-runtime.zip -d $MOE_HOME/sdk

unzip $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-tools.zip -d $MOE_TMP/moe-tools
cd $MOE_TMP/jars-repack/moe-ios
jar -xvf $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-ios.jar

cd $MOE_TMP/jars-repack/moe-core
java -Dretrolambda.inputDir=$MOE_TMP/jars-repack/moe-ios/ -Dretrolambda.classpath=$MOE_TMP/jars-repack/moe-core/ -Dretrolambda.defaultMethods=true -Dretrolambda.outputDir=$MOE_TMP/jars-repack/moe-ios-retro/ -jar $MOE_TMP/moe-tools/script/retrolambda-2.0.2.jar
cd $MOE_TMP/jars-repack/moe-ios-retro
jar -cvf moe-ios-retro.jar *

$MOE_TMP/moe-tools/platform-tools/dx --dex --output $MOE_HOME/sdk/moe-ios-retro.jar --core-library --multi-dex $MOE_TMP/jars-repack/moe-ios-retro/moe-ios-retro.jar
$MOE_TMP/moe-tools/platform-tools/dx --dex --output $MOE_HOME/sdk/moe-core.dex --core-library $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-core.jar

rm -rf $MOE_TMP/jars-repack/moe-ios/*
rm -rf $MOE_TMP/jars-repack/moe-core/*
cd $MOE_TMP/jars-repack/moe-ios
jar -xvf $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-ios.jar
rm -f NOTICE
rm -f META-INF/LICENSE.TXT
jar -cvf $MOE_HOME/sdk/moe-ios.jar *
cd $MOE_TMP/jars-repack/moe-core
jar -xvf $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-core.jar
rm -f NOTICE
rm -f META-INF/LICENSE.TXT
jar -cvf $MOE_HOME/sdk/moe-core.jar *

#junit for ios
mkdir -p $MOE_TMP/jars-repack/moe-ios-junit-out/
cd $MOE_TMP/jars-repack/moe-ios-junit
jar -xvf $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-junit.jar
java -Dretrolambda.inputDir=$MOE_TMP/jars-repack/moe-ios-junit -Dretrolambda.classpath=$MOE_TMP/jars-repack/moe-ios/ -Dretrolambda.defaultMethods=true -Dretrolambda.outputDir=$MOE_TMP/jars-repack/moe-ios-junit-out/ -jar $MOE_TMP/moe-tools/script/retrolambda-2.0.2.jar
cd $MOE_TMP/jars-repack/moe-ios-junit-out/
jar -cvf $MOE_HOME/sdk/moe-ios-junit.jar *
$MOE_TMP/moe-tools/platform-tools/dx --dex --output $MOE_HOME/sdk/moe-ios-junit.dex --core-library $MOE_HOME/sdk/moe-ios-junit.jar

mkdir -p $MOE_HOME/tools/macosx/x86_64
mkdir -p $MOE_HOME/tools/windows/x86_64
cp $target_repo/org/moe/moeIosDeviceLauncher/1.1.0.${qualifier}-${build_number}/moeIosDeviceLauncher-1.1.0.${qualifier}-${build_number}.jar $MOE_HOME/tools/ios-device.jar
#cp $target_repo/org/moe/moeIosSimulatorLauncher/1.3.0.${qualifier}-${build_number}/moeIosSimulatorLauncher-1.3.0.${qualifier}-${build_number}.jar $MOE_HOME/tools/ios-simulator.jar
cp $target_repo/org/moe/moeBindingLibimobiledevice/1.1.0.${qualifier}-${build_number}/moeBindingLibimobiledevice-1.1.0.${qualifier}-${build_number}-libimobiledevice_macosx_x86_64.dylib $MOE_HOME/tools/macosx/x86_64/libimobiledevice.dylib
cp $target_repo/org/moe/natj-mac/1.0.0.${qualifier}-${build_number}/natj-mac-1.0.0.${qualifier}-${build_number}-Release.dylib $MOE_HOME/tools/macosx/x86_64/libnatj.dylib
cp $target_repo/org/moe/moeBindingClang/3.8.0.${qualifier}-${build_number}/moeBindingClang-3.8.0.${qualifier}-${build_number}-libclang_moe_macosx_x86_64.dylib $MOE_HOME/tools/macosx/x86_64/libclang.dylib
cp $target_repo/org/moe/moeExecutableBuilder/1.0.0.${qualifier}-${build_number}/moeExecutableBuilder-1.0.0.${qualifier}-${build_number}.jar $MOE_HOME/tools/moeExecutableBuilder.jar
cp $target_repo/org/moe/moeBindingLibimobiledevice/1.1.0.${qualifier}-${build_number}/moeBindingLibimobiledevice-1.1.0.${qualifier}-${build_number}-libeay32_windows_x86_64.dll $MOE_HOME/tools/windows/x86_64/libeay32.dll
cp $target_repo/org/moe/moeBindingLibimobiledevice/1.1.0.${qualifier}-${build_number}/moeBindingLibimobiledevice-1.1.0.${qualifier}-${build_number}-ssleay32_windows_x86_64.dll $MOE_HOME/tools/windows/x86_64/ssleay32.dll
cp $target_repo/org/moe/moeBindingLibimobiledevice/1.1.0.${qualifier}-${build_number}/moeBindingLibimobiledevice-1.1.0.${qualifier}-${build_number}-libimobiledevice_windows_x86_64.dll $MOE_HOME/tools/windows/x86_64/libimobiledevice.dll
cp $target_repo/org/moe/natj-win/1.0.0.${qualifier}-${build_number}/natj-win-1.0.0.${qualifier}-${build_number}-Release-Win64.dll $MOE_HOME/tools/windows/x86_64/natj.dll

rm -rf $MOE_HOME/sdk/LICENSE.TXT
cp $MOE_TMP/moe-tools/platform-tools/dex2oat $MOE_HOME/tools
cp $MOE_TMP/moe-tools/platform-tools/dx $MOE_HOME/tools
cp $MOE_TMP/moe-tools/platform-tools/lib/dx.jar $MOE_HOME/tools
cp $MOE_TMP/moe-tools/script/retrolambda-2.0.2.jar $MOE_HOME/tools/retrolambda.jar
cp $MOE_TMP/moe-tools/script/java8support.jar $MOE_HOME/tools/java8support.jar
cp $MOE_TMP/moe-tools/script/proguard* $MOE_HOME/tools
cp $MOE_TMP/moe-tools/preloaded-classes $MOE_HOME/tools

#adding java-docs
cd $MOE_TMP/jars-repack/ios-javadoc
jar -xvf $target_repo/org/moe/moe-ios/1.0.0.${qualifier}-${build_number}/moe-ios-1.0.0.${qualifier}-${build_number}-ios-javadoc.jar
rm -f NOTICE
rm -f META-INF/LICENSE.TXT
jar -cvf $MOE_HOME/sdk/moe-ios-javadoc.jar *

# adding gradle plug-in	
mkdir -p $MOE_HOME/gradle/org/moe
cp -av $target_repo/org/moe/gradle $MOE_HOME/gradle/org/moe
cp -av $target_repo/org/moe/moeProjectGenerator $MOE_HOME/gradle/org/moe
cp -av $target_repo/org/moe/moeCommonUtils $MOE_HOME/gradle/org/moe/moeCommonUtils
cp -av $target_repo/org/moe/moeDocumentPbxproj $MOE_HOME/gradle/org/moe

# adding samples
mkdir -p $MOE_HOME/samples
cp -R $moe_repo_root/moe/samples-java/ $MOE_HOME/samples
rm -rf $MOE_HOME/samples/.git
rm -rf $MOE_HOME/samples/.gitattributes
rm -rf $MOE_HOME/samples/.gitignore
rm -rf $MOE_HOME/samples/README.md
rm -rf $MOE_HOME/samples/NOTICE.txt

cp -R $moe_repo_root/moe/samples-kotlin/ $MOE_HOME/samples
rm -rf $MOE_HOME/samples/.git
rm -rf $MOE_HOME/samples/README.md
rm -rf $MOE_HOME/samples/NOTICE.txt

# adding licenses
cp -av $moe_repo_root/moe/moe-core/moe.iOS/licenses $MOE_HOME/licenses
cp $moe_repo_root/moe/moe-core/moe.iOS/NOTICE $MOE_HOME
cp $moe_repo_root/moe/moe-core/moe.iOS/LICENSE $MOE_HOME

# install script
cp $moe_repo_root/moe/moe-core/Builder/moe_install.sh $MOE_HOME
chmod +x $MOE_HOME/moe_install.sh

# adding IntelliJ IDEA plugin
mkdir -p $MOE_HOME/intellij_plugins
mkdir -p $MOE_TMP/moe_intellij_plugin
cp $target_repo/org/moe/moe_intellij_plugin/1.1.0.${qualifier}-${build_number}/moe_intellij_plugin-1.1.0.${qualifier}-${build_number}.zip $MOE_HOME/intellij_plugins/moe_intellij_plugin.zip
unzip $MOE_HOME/intellij_plugins/moe_intellij_plugin.zip -d $MOE_TMP/moe_intellij_plugin
cp -av $MOE_TMP/moe_intellij_plugin/ $MOE_HOME/intellij_plugins

# adding IntelliJ IDEA UI designer plugin
mkdir -p $MOE_TMP/moe_uiprototyper_plugin
cp $target_repo/org/moe/UIPrototyper/moe_uiprototyper_plugin.zip $MOE_TMP/moe_uiprototyper_plugin.zip
unzip $MOE_TMP/moe_uiprototyper_plugin.zip -d $MOE_TMP/moe_uiprototyper_plugin
mkdir -p $MOE_HOME/intellij_plugins/moe_uiprototyper_plugin
cp -av $MOE_TMP/moe_uiprototyper_plugin/xrt_UIPrototyper/ $MOE_HOME/intellij_plugins/moe_uiprototyper_plugin
cd $MOE_HOME/intellij_plugins
zip -r moe_uiprototyper_plugin.zip moe_uiprototyper_plugin

# copy wrapnatjgen.jar
cp $target_repo/org/moe/moeNatjgenCliTool/1.1.0.${qualifier}-${build_number}/moeNatjgenCliTool-1.1.0.${qualifier}-${build_number}.jar $MOE_HOME/tools/wrapnatjgen.jar

# copy UI Transformer
cp $target_repo/org/moe/moeUITransformer/1.1.0.${qualifier}-${build_number}/moeUITransformer-1.1.0.${qualifier}-${build_number}.jar $MOE_HOME/tools/uiTransformer.jar
mkdir -p $MOE_TMP/moeUITransformer
cp $MOE_HOME/tools/uiTransformer.jar $MOE_TMP/moeUITransformer
cd $MOE_TMP/moeUITransformer
jar -xvf $MOE_TMP/moeUITransformer/uiTransformer.jar
cp -av UITransformer-res $MOE_HOME/tools

echo MOE_HOME for Android Studio Releases prepared here: $MOE_HOME
