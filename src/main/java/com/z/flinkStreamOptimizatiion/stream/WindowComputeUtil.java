package com.z.flinkStreamOptimizatiion.stream;

public class WindowComputeUtil {
    public static long myGetWindowStartWithOffset(long timestamp, long offset, long windowSize) {
        return timestamp - (timestamp - offset + windowSize) % windowSize;
    }
}
