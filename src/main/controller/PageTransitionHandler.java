package main.controller;

import javax.swing.JFrame;
import main.model.ConnectionFactory;

public interface PageTransitionHandler {
    boolean isPageOpen(JFrame page);
    void closeCurrentPage();
    void openPage(JFrame page);
    ConnectionFactory getConnectionFactory();
}
