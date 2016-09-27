package org.moe.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {
	
	public static final String GRADLE_RUN_MODE_KEY = "moe.gradle.runmode";
	
	public static final String INFO = "--info";
	
	public static final String STACKTRACE = "--stacktrace";
	
	public static final String DEBUG = "--debug";

	public static final String GRADLE_DEFAULT_KEY = "Default";

    public static final String GRADLE_DEFAULT_VALUE = "";

    public static final String GRADLE_INFO_KEY = "Info";

    public static final String GRADLE_INFO_VALUE = INFO;

    public static final String GRADLE_STACKTRACE_KEY = "Stacktrace";

    public static final String GRADLE_STACKTRACE_VALUE = INFO + "," + STACKTRACE;

    public static final String GRADLE_DEBUG_KEY = "Debug";

    public static final String GRADLE_DEBUG_VALUE = INFO + "," + STACKTRACE + "," + DEBUG;
	
}
