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

package ios.uikit;

import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.ann.Selector;

public class TargetActionProxy<T> {

	ITargetAction<T> targetAction;
	long controlEvents;

	public TargetActionProxy(ITargetAction<T> targetAction, @NUInt long controlEvents) {
		this.targetAction = targetAction;
		this.controlEvents = controlEvents;
	}

	@Selector("proxySelector::")
	public void proxySelector(T source, @NUInt long controlEvents) {
		targetAction.onEvent(source, controlEvents);
	}

}
