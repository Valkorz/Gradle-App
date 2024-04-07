package com.java;

public class NativeInterface {
    static{
        System.loadLibrary("nativelib");
    }

    public native void nativeMethod();
}
