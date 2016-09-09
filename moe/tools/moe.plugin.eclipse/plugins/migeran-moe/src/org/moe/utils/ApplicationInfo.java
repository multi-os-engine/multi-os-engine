package org.moe.utils;

import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ApplicationInfo {
	
	private static ApplicationInfo instance;
	private static Build build;
	
	public class Build {
		
		private Build() {
		}
		
		public String asString() {
			return FrameworkUtil.getBundle(getClass()).getVersion().toString();
		}
		
	}
	
	private ApplicationInfo() {
		build = new Build();
	}
	
	public static ApplicationInfo getInstance() {
		if (instance == null) {
			instance = new ApplicationInfo();
		}
		return instance;
	}
	
	public Build getBuild() {
		return build;
	}
	
	public String getVersionName() {
		return "Eclipse";
	}
	
	public String getFullVersion() {
		String product = System.getProperty("eclipse.product");
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.core.runtime.products");
		if (point != null) {
			IExtension[] extensions = point.getExtensions();
			for (IExtension ext : extensions) {
				if (product.equals(ext.getUniqueIdentifier())) {
					IContributor contributor = ext.getContributor();
					if (contributor != null) {
						Bundle bundle = Platform.getBundle(contributor.getName());
						if (bundle != null) {
							return bundle.getVersion().toString();
						}
					}
				}
			}
		}
		return null;
	}
	
}
