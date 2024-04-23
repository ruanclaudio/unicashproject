package com.unicash.app;

import com.unicash.app.pages.*;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        java.awt.EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                LoginScreen loginScreen = new LoginScreen();
                loginScreen.setVisible(true);
            }
        });
    }
}
