package main;

import main.view.LoginPage;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import main.model.ConnectionFactory;

public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        ConnectionFactory sqlConector = new ConnectionFactory();
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
