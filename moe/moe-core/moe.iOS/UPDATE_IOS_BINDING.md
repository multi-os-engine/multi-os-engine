# How to Update iOS Bindings with NatJGen

### Notes & Warnings

* Make sure you are going to bind the SDK you actually want to!
* Make sure your NatJGen version is bleeding edge!
* Do NOT skip steps in this guide, this guide is made specially so that the git diff can (and must) be minimal!
* Do NOT commit back any changes which are whitespace only into moe-core repository!

### Setup & Generation

* Create a workspace and initialize git
  ```sh
  mkdir iOSSDKBinding
  cd iOSSDKBinding
  git init
  ```

* Create lib directory
  ```sh
  mkdir lib
  ```

* Copy the newest NatJ API jar under lib

* Copy all current source files from your MOE repository
  ```sh
  cp -R /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/DefineHelpers ./
  cp -R /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/src ./
  cp /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/ios.natjgen ./
  cp /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/license_updater.py ./
  cp /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/typeconfig.ngtconf ./
  cp /path/to/moe-repo/moe/moe-core/moe.iOS/moe.ios.core/updater.gitignore .gitignore
  ```

* Create a build.gradle file
  ```sh
  echo "apply plugin: 'java'" > build.gradle
  echo "apply plugin: 'idea'" >> build.gradle
  echo "repositories { mavenLocal(); mavenCentral() }" >> build.gradle
  echo "dependencies { compile fileTree(dir: 'lib', include: '*.jar') }" >> build.gradle
  ```

* Open Android Studio
  * Import project (Eclipse ADT, Gradle, etc.)
  * Select the `iOSSDKBinding` for import
  * Click 'OK' for use Gradle wrapper

* Do initial git commit
  ```sh
  git add --all
  git commit -m "initial"
  ```

* In Android Studio
  * Make sure everything is set up as needed in the natjgen and ngtconf files
  * Right-click on the ios.natjgen and generate bindings

* Review your git diff and revert any changes that are whitespace only, meaning indentation changes and line-breaks
  * NatJGen has a known issue where it will generate the same code but with different indentation
  * **DO NOT SKIP THIS STEP** if you plan to update moe-core

* Run the license_updater.py script from the lib directory to append license headers to new files

* Check generated native source files also

* Copy back all new files under moe-core

### Custom Modifications List

* `ios.foundation.NSArray` and `ios.foundation.NSMutableArray` have been extended to implement Java's List interface.
* `ios.foundation.NSDictionary` and `ios.foundation.NSMutableDictionary` have been extended to implement Java's Map interface.
* `setValueForKey` method in `ios.foundation.NSMutableDictionary` has been manually edited due to a compiler error
* `ios.uikit.UIControl` was extended to be able to use custom `TargetActionProxy` and `ITargetAction` classes/interfaces, both of which can be found in the ios.uikit package.
* `playerDidRequestMatchWithPlayers` method was added to `ios.gamekit.protocol.GKLocalPlayerListener` to override duplicate default methods in 2 parent interfaces.

### How to Update Custom Modifications List

* If the behavior of a class was extended (no modifications were made to the class' existing behavior), then the list should contain the basic description of the extension.
* If existing/default behavior was changed, then the list must contain every detail of the modification and its side-effects.
