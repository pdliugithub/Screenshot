package com.example.pd_liu.screenshot.util;

import android.content.Context;
import android.media.projection.MediaProjectionManager;

/**
 * Created by pd_liu on 2017/7/10.
 * ScreenManagerUtil
 */

public final class ScreenManagerUtil {

    private ScreenManagerUtil() {
        throw new IllegalStateException("Illegal State Exception....");
    }

    public static MediaProjectionManager getMediaProjectionManager(Context context) {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) context.getSystemService(Context.MEDIA_PROJECTION_SERVICE);
        return mediaProjectionManager;
    }
}
