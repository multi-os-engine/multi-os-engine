package apple.webkit.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKURLSchemeTask")
public interface WKURLSchemeTask {
    /**
     * Mark the task as failed.
     * <p>
     * An exception will be thrown if you try to mark a task failed after it has already been marked completed or failed.
     * An exception will be thrown if your app has been told to stop loading this task via the registered WKURLSchemeHandler object.
     *
     * @param error A description of the error that caused the task to fail.
     */
    @Generated
    @Selector("didFailWithError:")
    void didFailWithError(NSError error);

    /**
     * Mark the task as successfully completed.
     * <p>
     * An exception will be thrown if you try to finish the task before sending it a response.
     * An exception will be thrown if you try to mark a task completed after it has already been marked completed or failed.
     * An exception will be thrown if your app has been told to stop loading this task via the registered WKURLSchemeHandler object.
     */
    @Generated
    @Selector("didFinish")
    void didFinish();

    /**
     * Add received data to the task.
     * <p>
     * After a URL scheme handler task's final response object is received you should
     * start sending it data.
     * Each time this method is called the data you send will be appended to all previous data.
     * An exception will be thrown if you try to send the task any data before sending it a response.
     * An exception will be thrown if you try to send the task any data after the task has already been completed.
     * An exception will be thrown if your app has been told to stop loading this task via the registered WKURLSchemeHandler object.
     *
     * @param data The data to add.
     */
    @Generated
    @Selector("didReceiveData:")
    void didReceiveData(NSData data);

    /**
     * Set the current response object for the task.
     * <p>
     * This method must be called at least once for each URL scheme handler task.
     * Cross-origin requests require CORS header fields.
     * An exception will be thrown if you try to send a new response object after the task has already been completed.
     * An exception will be thrown if your app has been told to stop loading this task via the registered WKURLSchemeHandler object.
     *
     * @param response The response to use.
     */
    @Generated
    @Selector("didReceiveResponse:")
    void didReceiveResponse(NSURLResponse response);

    /**
     * The request to load for this task.
     */
    @Generated
    @Selector("request")
    NSURLRequest request();
}
