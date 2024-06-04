package main;

import main.view.LoginPage;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import main.model.SQLConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SQLConnection sqlConector = new SQLConnection();
        sqlConector.getConnection();
        sqlConector.initializeDatabase();
        
        java.awt.EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                LoginPage loginScreen = new LoginPage();
                loginScreen.setVisible(true);
            }
        });
    }
}
