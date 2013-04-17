/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gui.AdminMainFrame;
import gui.LoginFrame;
import java.util.Arrays;
import javax.swing.WindowConstants;
import model.ResursaUmana;

/**
 *
 * @author Alexandru
 */
public class LoginController {
    private LoginFrame loginFrame;
    
    public LoginController(){
        this.loginFrame = new LoginFrame(this);
        
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);    
    }
    
    /*Rog pe cei de la BL sa implementeze cum trebuie aceste metode macheta 
      *care le trec eu aici, insa pe cat se poate sa nu schimbe semnatura metodei
      */        
    
    //MACHETA
    public void login(String username,char[] password) throws Exception{
        /*
         * metoda trebuie sa verifice daca userul si parola sunt corecte si sa 
         * creeze fereastra corespunzatoare celui care s-a loghat sau sa arunce o 
         * exceptie in cazul in care autentificarea nu s-a realizat si care fereastra de loghin 
         * o sa o prinda si o sa o afiseze. mesajul trebuie sa fie corespunzator
         */
        char[] pass ={'a','d','m','i','n'};//parola hardcodata pt teste
        if(username.equals("admin") && Arrays.equals(pass,password)){
            loginFrame.setVisible(false);
            AdministratorController administratorController = new AdministratorController();
            AdminMainFrame adminMainFrame = new AdminMainFrame(this,administratorController, "mury");
        }else throw new Exception("ceva");
        
        
    }
    //ce ii de aici in jos va rog sa lasati exact asa cum este
        public void makeVisibleLoginFrame(){
            loginFrame.setVisible(true);
        }
    
}
