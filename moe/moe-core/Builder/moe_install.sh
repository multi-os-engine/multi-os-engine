#!/bin/bash
#
# Copyright 2014-2016 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

MOE_INSTALL_DIR=$( cd $(dirname $0) ; pwd -P )

as_plugins=("moe_intellij_plugin" "moe_uiprototyper_plugin")

generate_environment_plist() {
    local filename=$1
    echo "Generated plist for LaunchAgents to set MOE variables for GUI apps: '$filename'"
(
cat <<HEREDOC
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
<key>Label</key>
<string>$2</string>
<key>ProgramArguments</key>
<array>
<string>sh</string>
<string>-c</string>
<string>
launchctl setenv MOE_HOME ${MOE_HOME}
launchctl setenv JAVA_HOME ${JDK_PATH}
</string>
</array>
<key>RunAtLoad</key>
<true/>
</dict>
</plist>
HEREDOC
) > "$filename"
}

find_android_studio_settings_folder () {
    local as_path=$1

    if [[ ! -e "$as_path" ]]; then
        return
    fi

    local info_plist="$as_path/Contents/Info.plist"
    if [ ! -e "$info_plist" ]; then
        echo "Info.plist '$info_plist' doesn't exist"
        return
    fi
    local bundleid=$(/usr/libexec/PlistBuddy -c "Print :CFBundleIdentifier"  "$info_plist" 2>/dev/null)
    if [ "x${bundleid}" != 'xcom.google.android.studio' ]; then
        echo "$1/Contents/Info.plist is not Android Studio"
        return
    fi    
    local settings=$(/usr/libexec/PlistBuddy -c "Print :JVMOptions:Properties:idea.paths.selector" "$info_plist")
    if [ "x$settings" != "x" ]; then
        android_studio_settings=$settings
    fi
}

find_idea_settings_folder () {
    local idea_path=$1
    if [[ ! -e "$idea_path" ]]; then
        return
    fi

    local info_plist="$idea_path/Contents/Info.plist"
    if [ ! -e "$info_plist" ]; then
        echo "Info.plist '$info_plist' doesn't exist"
        return
    fi
    idea_settings_folder=$(/usr/libexec/PlistBuddy -c "Print :JVMOptions:Properties:idea.paths.selector" "$info_plist")
}

find_android_studio_app () {
    if [ -e "/Applications/Android Studio.app" ]; then
        find_android_studio_settings_folder "/Applications/Android Studio.app"
    else
        local android_studios=$(mdfind "kMDItemCFBundleIdentifier == 'com.google.android.studio'")
        OLD_IFS=$IFS
        IFS=$'\n'
        for android_studio_path in $android_studios; do
            find_android_studio_settings_folder "$android_studio_path"
        done
        IFS=$OLD_IFS
    fi
}

find_intellij_idea_app () {
    if [[ -e "/Applications/IntelliJ IDEA CE.app" ]]; then
        find_idea_settings_folder "/Applications/IntelliJ IDEA CE.app"
    else
        local ideas=$(mdfind "kMDItemCFBundleIdentifier == 'com.jetbrains.intellij.ce'")
        OLD_IFS=$IFS
        IFS=$'\n'
        for idea_path in $ideas; do
            find_idea_settings_folder "$idea_path"
        done
        IFS=$OLD_IFS
    fi
}

find_jdk () {
    JDK_PATH=""
    /usr/libexec/java_home 2>/dev/null 1>&2
    if [ $? -eq 0 ]; then
        local jdk18_path=$(/usr/libexec/java_home -v 1.8 2>&1 | head -n 1)
        if [ "x${jdk18_path}" != "x" ]; then
            echo "$jdk18_path" | grep "Unable to find" 2>/dev/null 1>&2
            if [ $? -ne 0 ] && [ -e "$jdk18_path" ]; then
                echo "Found JDK 1.8 at '${jdk18_path}'"
                JDK_PATH=$jdk18_path
            fi
        fi
    fi
}

install_moe_idea_plugins() {
    for item in ${as_plugins[*]}
    do
        if [ ! -d "${MOE_INSTALL_DIR}/intellij_plugins/${item}" ]; then
            echo "Cannot find android studio plugin $item in installer package. Please check installer package."
        fi
    done

    echo "IntelliJ IDEA settings folder = ${idea_settings_folder}"
    echo "Android Studio settings folder = ${android_studio_settings}"
    for item in ${as_plugins[*]}
    do
        local plugins_install_dir_as="$HOME/Library/Application Support/${android_studio_settings}"
        local plugins_install_dir_idea="$HOME/Library/Application Support/${idea_settings_folder}"
        
        if [ -e "$MOE_INSTALL_DIR/intellij_plugins/${item}" ]; then

            if [ "x${android_studio_settings}" != "x" ]; then
                mkdir -p "$plugins_install_dir_as"
                echo cp -R "$MOE_INSTALL_DIR/intellij_plugins/${item}" "$plugins_install_dir_as"
                cp -R "$MOE_INSTALL_DIR/intellij_plugins/${item}" "$plugins_install_dir_as" > /dev/null
            fi

            if [ "x${idea_settings_folder}" != "x" ]; then
                mkdir -p "$plugins_install_dir_idea"
                echo cp -R "$MOE_INSTALL_DIR/intellij_plugins/${item}" "$plugins_install_dir_idea"
                cp -R "$MOE_INSTALL_DIR/intellij_plugins/${item}" "$plugins_install_dir_idea" > /dev/null
            fi
        fi
    done
    return 0   
}

install_moe() {
    echo "MOE installation folder: ${MOE_INSTALL_DIR}"
    install_moe_idea_plugins
    export MOE_HOME="$MOE_INSTALL_DIR"
    launchctl setenv MOE_HOME $MOE_HOME
    launchctl setenv JAVA_HOME ${JDK_PATH}

    echo "run 'defaults write com.apple.dt.Xcode IDEApplicationwideBuildSettings -dict-add MOE_HOME $MOE_HOME'"
    defaults write com.apple.dt.Xcode IDEApplicationwideBuildSettings -dict-add MOE_HOME $MOE_HOME
    if [ "$?" != "0" ]; then
        echo "run 'defaults write com.apple.dt.Xcode IDEApplicationwideBuildSettings -dict MOE_HOME $MOE_HOME'"
        defaults write com.apple.dt.Xcode IDEApplicationwideBuildSettings -dict MOE_HOME $MOE_HOME
    fi

    if [[ ! -f $HOME/.bash_profile ]]; then
        touch $HOME/.bash_profile
    fi

    if [[ ! `cat $HOME/.bash_profile | grep "export JAVA_HOME="` ]]; then
        echo "Adding path to JDK to $HOME/.bash_profile: ${JDK_PATH}"
        echo export JAVA_HOME="${JDK_PATH}" >> $HOME/.bash_profile
    else
        echo "Replacing 'export JAVA_HOME=${JDK_PATH}' in $HOME/.bash_profile"
        sed -i.bak "s|export JAVA_HOME=.*|export JAVA_HOME=$JDK_PATH|" $HOME/.bash_profile
    fi

    if [[ ! `cat $HOME/.bash_profile | grep "launchctl setenv JAVA_HOME"` ]]; then
        echo "Adding 'launchctl setenv JAVA_HOME ${JDK_PATH}' to $HOME/.bash_profile"
        echo launchctl setenv JAVA_HOME ${JDK_PATH} >> $HOME/.bash_profile
    else
        echo "Replacing 'launchctl setenv JAVA_HOME ${JDK_PATH}' in $HOME/.bash_profile"
        sed -i.bak "s|launchctl setenv JAVA_HOME.*|launchctl setenv JAVA_HOME $JDK_PATH|" $HOME/.bash_profile
    fi

    if [[ ! `cat $HOME/.bash_profile | grep "launchctl setenv MOE_HOME"` ]]; then
        echo "Adding 'launchctl setenv MOE_HOME $MOE_HOME' to $HOME/.bash_profile"
        echo launchctl setenv MOE_HOME $MOE_HOME >> $HOME/.bash_profile
    else
        echo "Replacing 'launchctl setenv MOE_HOME $MOE_HOME' in $HOME/.bash_profile"
        sed -i.bak "s|launchctl setenv MOE_HOME.*|launchctl setenv MOE_HOME $MOE_HOME|" $HOME/.bash_profile
    fi

    if [[ ! `cat $HOME/.bash_profile | grep "export MOE_HOME="` ]]; then
        echo "Adding 'export MOE_HOME=$MOE_INSTALL_DIR' to $HOME/.bash_profile"
        echo export MOE_HOME="$MOE_INSTALL_DIR" >> $HOME/.bash_profile
    else
        echo "Replacing 'export MOE_HOME=$MOE_INSTALL_DIR' in $HOME/.bash_profile"
        sed -i.bak "s|export MOE_HOME=.*|export MOE_HOME=$MOE_INSTALL_DIR|" $HOME/.bash_profile
    fi

    if [[ ! `cat $HOME/.bash_profile | grep "export ANDROID_HOME="` ]]; then
        echo "Adding 'export ANDROID_HOME=$ANDROID_HOME' to $HOME/.bash_profile"
        echo export ANDROID_HOME="$ANDROID_HOME" >> $HOME/.bash_profile
    fi    
        

    if [ ! -d "$HOME/Library/LaunchAgents/" ]; then
        mkdir -p "$HOME/Library/LaunchAgents/"
    fi
    rm -f $HOME/Library/LaunchAgents/com.intel.multiosengine.environment.plist
    generate_environment_plist "$HOME/Library/LaunchAgents/org.moe.environment.plist" "multiosengine.startup"
}

check_prerequisites() {
    if [ `uname` != 'Darwin' ]; then
        platform='linux'
        echo "Error: Linux hosts are not supported. Mac OS system is needed to build an app for iOS".
        exit
    fi
    if [ ! -e "/usr/bin/gcc" ] || [ ! -f "/usr/bin/clang" ] || ! [ `which xcodebuild` ] ; then
        echo "Error: Xcode command line tools are missed"
        exit
    fi

    if [[ ! $ANDROID_HOME ]] || [[ -e $ANDROID_HOME ]]; then
        if [ -e "${HOME}/Library/Android/sdk" ]; then
            export ANDROID_HOME="${HOME}/Library/Android/sdk"
            echo "Found Android SDK at '${ANDROID_HOME}'"
        else
            echo "Error: Please set ANDROID_HOME environment variable pointing to a folder with Android SDK"
            exit
        fi
    fi
}

check_prerequisites
find_jdk
find_android_studio_app
find_intellij_idea_app

if [ "x$idea_settings_folder" == "x" ] && [ "x$android_studio_settings" == "x" ]; then
    echo "Error: Android Studio or IntelliJ IDEA are not found"
    exit
fi

install_moe
source $HOME/.bash_profile

echo "Multi-OS Engine installation finished. System reboot may require if you installed MOE to new place."