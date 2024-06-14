package main.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.model.ConnectionFactory;

public class PageManager implements PageTransitionHandler{
    private static JFrame currentPage;
    private static ConnectionFactory connectionFactory;
    
    @Override
    public boolean isPageOpen(JFrame page) {
        return page == currentPage;
    }
    
    @Override
    public void closeCurrentPage() {
        if(currentPage != null) {
            currentPage.dispose();
            currentPage = null;
        }
    }
    
    @Override
    public void openPage(JFrame page) {
        closeCurrentPage();
        currentPage = page;
        currentPage.setVisible(true);
    }
    
    @Override
    public ConnectionFactory getConnectionFactory() {
        if(connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
            try {
                connectionFactory.getConnection();
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
                return null;
            }
        }
        return connectionFactory;
    }
    
}
