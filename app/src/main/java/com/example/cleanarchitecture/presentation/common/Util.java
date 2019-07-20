package com.example.cleanarchitecture.presentation.common;

public class Util {

    public static void simulateNetworkLatency(int millis) {
        // Pause current thread
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
