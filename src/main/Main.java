package main;

import java.lang.reflect.InvocationTargetException;
import main.controller.PageManager;
import main.controller.PageTransitionHandler;
import main.model.ConnectionFactory;
import main.view.LoginPage;



public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        PageTransitionHandler pageTHandler = new PageManager();
        ConnectionFactory cFactory = pageTHandler.getConnectionFactory();
        cFactory.initializeDatabase();
        cFactory.isDatabaseInitialized();
        
        java.awt.EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                LoginPage loginScreen = new LoginPage(pageTHandler);
                pageTHandler.getConnectionFactory();
                pageTHandler.openPage(loginScreen);
            }
        });
    }
}
