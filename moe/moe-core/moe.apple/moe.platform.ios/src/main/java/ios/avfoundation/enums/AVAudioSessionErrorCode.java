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

package ios.avfoundation.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVAudioSessionErrorCode {
	@Generated
	private AVAudioSessionErrorCode() {
	}

	@Generated
	@NInt
	public static final long CodeNone = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long CodeMediaServicesFailed = 0x000000006D737276L;
	@Generated
	@NInt
	public static final long CodeIsBusy = 0x0000000021616374L;
	@Generated
	@NInt
	public static final long CodeIncompatibleCategory = 0x0000000021636174L;
	@Generated
	@NInt
	public static final long CodeCannotInterruptOthers = 0x0000000021696E74L;
	@Generated
	@NInt
	public static final long CodeMissingEntitlement = 0x00000000656E743FL;
	@Generated
	@NInt
	public static final long CodeSiriIsRecording = 0x0000000073697269L;
	@Generated
	@NInt
	public static final long CodeCannotStartPlaying = 0x0000000021706C61L;
	@Generated
	@NInt
	public static final long CodeCannotStartRecording = 0x0000000021726563L;
	@Generated
	@NInt
	public static final long CodeBadParam = 0xFFFFFFFFFFFFFFCEL;
	@Generated
	@NInt
	public static final long InsufficientPriority = 0x0000000021707269L;
	@Generated
	@NInt
	public static final long CodeUnspecified = 0x0000000077686174L;
	@Generated
	@NInt
	public static final long CodeResourceNotAvailable = 0x0000000021726573L;
}
