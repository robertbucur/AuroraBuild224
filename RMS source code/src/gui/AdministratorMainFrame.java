package gui;

import controller.AdministratorController;
import controller.LoginController;
import javax.swing.*;
import java.awt.*;
/**
 * User: Alexandru
 * Date: 4/10/13
 * Time: 3:36 PM
 */
public class AdministratorMainFrame extends JFrame {
    private AdministratorController controller;
    private LoginController loginController;
    public JPanel adminPanel;  

    public AdministratorMainFrame(LoginController loginController,AdministratorController aController, String userName){
        setTitle("RMS - Administrator mode");
        this.controller = aController;
        this.loginController = loginController;
        this.adminPanel = new AdministratorPanel(loginController,controller,userName,this);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(850, 550);
        setResizable(false);
        setLocationRelativeTo(null);//setLocation(500, 250);
        setLayout(new BorderLayout());
        add(adminPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }
    public void disposeAdminFrame(){
        this.dispose();
    }
}
