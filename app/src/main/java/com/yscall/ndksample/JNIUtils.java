package com.yscall.ndksample;

/**
 * Created by 你的样子 on 2019/2/20.
 * JNI工具类
 *
 * @author gerile
 */

public class JNIUtils {

    static {
        System.loadLibrary("hello-lib");
    }

    public static native String getHelloString();

}
