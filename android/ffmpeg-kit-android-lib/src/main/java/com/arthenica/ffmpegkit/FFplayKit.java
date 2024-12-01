package com.arthenica.ffmpegkit;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class FFplayKit {

    /**
     * The tag used for logging.
     */
    static final String TAG = "ffmpeg-kit";

    public static int playTest(final String arguments) {
        int returnCode = nativeFFplayTest(arguments);
        android.util.Log.w(
                FFplayKit.TAG, String.format("playTest: %s, returnCode: %s",
                        arguments, Integer.toString(returnCode)));
        return 0;
    }

    public static int playCallMain(final String arguments) {
        int returnCode = nativeFFplayMain(arguments);
        android.util.Log.w(
                FFplayKit.TAG, String.format("playCallMain: %s, returnCode: %s",
                        arguments, Integer.toString(returnCode)));
        return 0;
    }

    public static String argumentsToString(final String[] arguments) {
        if (arguments == null) {
            return "null";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arguments.length; i++) {
            if (i > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(arguments[i]);
        }

        return stringBuilder.toString();
    }
    
    public native static int nativeFFplayMain(final String arguments);
    public native static int nativeFFplayTest(final String arguments);
}