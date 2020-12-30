/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @class			AVFragmentedAsset
 * 
 * @abstract		A subclass of AVURLAsset that represents media resources that can be extended in total duration without modifying previously existing data structures.
 * Such media resources include QuickTime movie files and MPEG-4 files that indicate, via an 'mvex' box in their 'moov' box, that they accommodate additional fragments. Media resources of other types may also be supported. To check whether a given instance of AVFragmentedAsset can be used to monitor the addition of fragments, check the value of the AVURLAsset property canContainFragments.
 * An AVFragmentedAsset is capable of changing the values of certain of its properties and those of its tracks, while an operation that appends fragments to the underlying media resource in in progress, if the AVFragmentedAsset is associated with an instance of AVFragmentedAssetMinder.
 * @discussion		While associated with an AVFragmentedAssetMinder, AVFragmentedAsset posts AVAssetDurationDidChangeNotification whenever new fragments are detected, as appropriate. It may also post AVAssetContainsFragmentsDidChangeNotification and AVAssetWasDefragmentedNotification, as discussed in documentation of those notifications.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVFragmentMinding")
public interface AVFragmentMinding {

    /**
     * @property		associatedWithFragmentMinder
     * @abstract		Indicates whether an AVAsset that supports fragment minding is currently associated with a fragment minder, e.g. an instance of AVFragmentedAssetMinder.
     * @discussion	AVAssets that support fragment minding post change notifications only while associated with a fragment minder.
     */
    @Generated
    @Selector("isAssociatedWithFragmentMinder")
    boolean isAssociatedWithFragmentMinder();
}
