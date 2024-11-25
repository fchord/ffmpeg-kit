package com.arthenica.ffmpegkit;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class FFplayKit {

    /**
     * The tag used for logging.
     */
    static final String TAG = "ffmpeg-kit";

    public static int playWithArguments(final String arguments) {
        int returnCode = nativeFFplayExecute(arguments);
        android.util.Log.w(
                FFplayKit.TAG, String.format("playWithArguments: %s, returnCode: %s",
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
    public native static int nativeFFplayExecute(final String arguments);
}