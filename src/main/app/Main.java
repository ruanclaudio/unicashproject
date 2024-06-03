package main.app;

import main.app.pages.LoginPage;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        java.awt.EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                LoginPage loginScreen = new LoginPage();
                loginScreen.setVisible(true);
            }
        });
    }
}
