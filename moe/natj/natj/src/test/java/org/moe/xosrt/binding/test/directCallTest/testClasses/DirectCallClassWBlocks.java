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

package org.moe.xosrt.binding.test.directCallTest.testClasses;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.BlockMultipleTwoFloats;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.BlockObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.CharBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlock;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlockRetFloat;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.ObjectBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.ObjectOnlyBlock;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.SimpleBlock;

@ObjCClassName("DirectCallClassWBlocks")
public class DirectCallClassWBlocks extends NativeObject {
	
	static
	{
		NatJ.register();
	}

	protected DirectCallClassWBlocks(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	public static native DirectCallClassWBlocks alloc(); 
	
	@Selector("init")
	public native DirectCallClassWBlocks init();
	
	@Selector("DirectCallWBlock:")
	public native void DirectCallWBlock(@ObjCBlock(name = "BlockCallback") SimpleBlock block);
	
	
	@Selector("DirectCallDerniBlock")
	public native void DirectCallDerniBlock();

	@Selector("DirectCallWBlockFloat:")
	public native void DirectCallWBlockFloat(@ObjCBlock(name = "BlockCallBack") FloatBlock block);
	
	@Selector("DirectCallWBlockObject:withObject:andSObj:andTObj:")
	public native void DirectCallWBlockObject(@ObjCBlock(name = "ObjectMethod") BlockObject block, NativeObject object,
			NativeObject sObject, NativeObject tObject);
	
	@Selector("DirectCallWObjectOnlyBlock:withObject:andSObj:andTObj:")
	public native void DirectCallWObjectOnlyBlock(@ObjCBlock(name = "BlockCallBack") ObjectOnlyBlock block, NativeObject object,
			NativeObject sObject, NativeObject tObject);
	
	@Selector("DirectCallWObjectBlockRetObject:withObject:")
	public native NSObject DirectCallWObjectBlockRetObject(@ObjCBlock(name = "BlockCallBack") ObjectBlockRetObject block, NSObject object);
	
	@Selector("DirectCallFloatBlockRetObject:fFloat:sFloat:withObject:")
	public native NSObject DirectCallFloatBlockRetObject(@ObjCBlock(name = "BlockCallBack") FloatBlockRetObject block, float a, float b, NativeObject object);
	
	@Selector("DirectCallCharBlockRetObject:charArg:byteArg:withObject:")
	public native NSObject DirectCallCharBlockRetObject(@ObjCBlock(name = "BlockCallBack") CharBlockRetObject block, char a, byte b, NSObject object);
		
	@Selector("DirectCallFloatBlockRetFloat:fFloat:byteArg:withObject:sFloat:")
	public native float DirectCallFloatBlockRetFloat(@ObjCBlock(name = "BlockCallBack") FloatBlockRetFloat block, float a, byte b, NativeObject object, float c);
	
	@Selector("setCompletionBlock:")
	public native void setCompletionBlock(@ObjCBlock(name = "BlockCallback") SimpleBlock block);
	
	@Selector("DirectCallWithBlock:FFloat:SFloat:")
	public native float DirectCallWithBlockMultipleTwoFloats(@ObjCBlock(name = "BlockCallBack") BlockMultipleTwoFloats ptr, float a, float b);
	
	
	
}
