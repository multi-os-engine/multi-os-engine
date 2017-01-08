# How to Update iOS Bindings with NatJGen

### Notes & Warnings

* Make sure you are going to bind the SDK you actually want to!
* Make sure your NatJGen version is bleeding edge!
* Do NOT skip steps in this guide, this guide is made specially so that the git diff can (and must) be minimal!
* Do NOT commit back any changes which are whitespace only into moe-core repository!

### Setup & Generation

* Build NatJGen if necessary

	```sh
	cd <repo>/moe/tools/master
	./gradlew :moe.generator.natjgen:build
	```

* Locate the latest build of the MOE SDK (at the time of writing, this is MOE 1.3). From this directory Clang and NatJ dylibs will be used. Create a local MOE SDK build if necessary.
	
	```sh
	cd ~/.moe/moe-sdk-1.3.0/tools
	```

* Run NatJGen with the configuration in moe-core

	```sh
	java -cp <repo>/moe/tools/moe.generator.natjgen/build/libs/moe.generator.natjgen.jar \
	    org.moe.natjgen.Main \
	    <repo>/moe/moe-core/moe.apple \
	    moe.platform.ios \
	    <repo>/moe/moe-core/moe.apple/moe.platform.ios/platform.natjgen
	```

* After the generator completed successfully, open the project in IDEA
* In the Project navigator, select `moe.apple > moe.platform.ios > src > main > java > apple`
* Right-click and select `Reformat code`
	* Check `Include subdirectories`
	* Check `Optimize imports`
	* Run and repeat 1-2 times (in some versions of IDEA running only once will not do a sufficient job)
* Review your git diff and revert any changes that are whitespace only, meaning indentation changes and line-breaks
	* NatJGen has a known issue where it will generate the same code but with different indentation
	* Do not commit `moe.apple/moe.platform.ios/typeconfig.out.ngtconf` it is only generated so `moe.apple/moe.platform.ios/typeconfig.ngtconf` can be updated
	* **DO NOT SKIP THIS STEP** if you plan to update moe-core
* Run the license_updater.py script from the moe.apple directory to append license headers to new files
* Also check generated native source files

### Custom Modifications List

* `ios.foundation.NSArray` and `ios.foundation.NSMutableArray` have been extended to implement Java's List interface.
* `ios.foundation.NSDictionary` and `ios.foundation.NSMutableDictionary` have been extended to implement Java's Map interface.
* `setValueForKey` method in `ios.foundation.NSMutableDictionary` has been manually edited due to a compiler error
* `ios.uikit.UIControl` was extended to be able to use custom `TargetActionProxy` and `ITargetAction` classes/interfaces, both of which can be found in the ios.uikit package.
* `playerDidRequestMatchWithPlayers` method was added to `ios.gamekit.protocol.GKLocalPlayerListener` to override duplicate default methods in 2 parent interfaces.
* In `apple.callkit.CXCallDirectoryProvider` method was changed:
	* from: `public native void beginRequestWithExtensionContext(CXCallDirectoryExtensionContext context);`
	* to: `public native void beginRequestWithExtensionContext(NSExtensionContext context);`
* In `apple.gameplaykit.GKCompositeBehavior` method was changed:
	* from: `public native GKBehavior objectAtIndexedSubscript(@NUInt long idx);`
	* to: `public native GKGoal objectAtIndexedSubscript(@NUInt long idx);`

### How to Update Custom Modifications List

* If the behavior of a class was extended (no modifications were made to the class' existing behavior), then the list should contain the basic description of the extension.
* If existing/default behavior was changed, then the list must contain every detail of the modification and its side-effects.
