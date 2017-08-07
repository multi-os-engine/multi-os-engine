package org.moe;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.Selector;

import java.lang.ref.WeakReference;

import apple.NSObject;
import apple.foundation.NSNotificationCenter;
import apple.uikit.c.UIKit;

/**
 * This is a utility class which helps with common GC related issues.
 */
public class GCUtil extends NSObject {

	/**
	 * Registers the utility to act on willResignActive and didReceiveMemoryWarning notifications.
	 */
	public static void register() {
		if (Holder.INSTANCE == null) {
			throw new RuntimeException("Failed to create GCUtil");
		}
	}

	/**
	 * Private holder class for the shared GCUtil instance.
	 */
	private static class Holder {
		/**
		 * Shared instance.
		 */
		private static final GCUtil INSTANCE = GCUtil.alloc().init();
	}

	protected GCUtil(Pointer peer) {
		super(peer);
	}

	@Owned
	public static native GCUtil alloc();

	@Override
	public GCUtil init() {
		GCUtil self = (GCUtil) super.init();
		if (self != null) {
			// Register notification listeners
			final NSNotificationCenter center = NSNotificationCenter.defaultCenter();
			center.addObserverSelectorNameObject(self, new SEL("willResignActive"), UIKit
					.UIApplicationWillResignActiveNotification(), null);
			center.addObserverSelectorNameObject(self, new SEL("didReceiveMemoryWarning"), UIKit
					.UIApplicationDidReceiveMemoryWarningNotification(), null);
		}
		return self;
	}

	@Selector("willResignActive")
	private void willResignActive() {
		gc();
	}

	@Selector("didReceiveMemoryWarning")
	private void didReceiveMemoryWarning() {
		gc();
	}

	/**
	 * Invoke the garbage collector.
	 */
	public static void gc() {
		Object obj = new Object();
		WeakReference<Object> ref = new WeakReference<Object>(obj);
		obj = null;
		while (ref.get() != null) {
			Runtime.getRuntime().gc();
		}
		Runtime.getRuntime().runFinalization();
	}

	/**
	 * Invokes the garbage collector with a default delay of 1 second.
	 */
	public static void delayedGC() {
		delayedGC(1000);
	}

	/**
	 * Invokes the garbage collector after the specified number of milliseconds.
	 *
	 * @param millis delay
	 */
	public static void delayedGC(final long millis) {
		if (millis < 0) {
			throw new IllegalArgumentException();
		}
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				gc();
			}
		}).start();
	}
}
