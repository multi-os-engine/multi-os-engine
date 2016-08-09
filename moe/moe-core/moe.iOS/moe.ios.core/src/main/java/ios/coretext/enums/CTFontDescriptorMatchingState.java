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

package ios.coretext.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CTFontDescriptorMatchingState {
	@Generated
	private CTFontDescriptorMatchingState() {
	}

	@Generated
	public static final int DidBegin = 0x00000000;
	@Generated
	public static final int DidFinish = 0x00000001;
	@Generated
	public static final int WillBeginQuerying = 0x00000002;
	@Generated
	public static final int Stalled = 0x00000003;
	@Generated
	public static final int WillBeginDownloading = 0x00000004;
	@Generated
	public static final int Downloading = 0x00000005;
	@Generated
	public static final int DidFinishDownloading = 0x00000006;
	@Generated
	public static final int DidMatch = 0x00000007;
	@Generated
	public static final int DidFailWithError = 0x00000008;
}
