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

package apple.messages.protocol;

import apple.messages.MSSticker;
import apple.messages.MSStickerBrowserView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The MSStickerBrowserViewDataSource protocol declares the methods that the Sticker Browser View uses to access the
 * contents of its data source object.
 */
@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MSStickerBrowserViewDataSource")
public interface MSStickerBrowserViewDataSource {
    /**
     * Returns the number of Stickers that the sticker browser should show.
     *
     * @param stickerBrowserView The sticker browser view .
     * @return The number of stickers.
     */
    @Generated
    @Selector("numberOfStickersInStickerBrowserView:")
    @NInt
    long numberOfStickersInStickerBrowserView(MSStickerBrowserView stickerBrowserView);

    /**
     * Returns the sticker that the sticker browser should show in the browser.
     *
     * @param stickerBrowserView The sticker browser view.
     * @param index              The index of the sticker to show.
     * @return A MSSticker object.
     */
    @Generated
    @Selector("stickerBrowserView:stickerAtIndex:")
    MSSticker stickerBrowserViewStickerAtIndex(MSStickerBrowserView stickerBrowserView, @NInt long index);
}
