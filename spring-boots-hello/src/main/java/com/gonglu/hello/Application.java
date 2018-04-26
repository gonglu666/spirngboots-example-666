package com.gonglu.hello;

/**
 * Created by Administrator on 2018/4/26.
 */
public class Application {
    private static Application ourInstance = new Application();

    public static Application getInstance() {
        return ourInstance;
    }

    private Application() {
    }
}
