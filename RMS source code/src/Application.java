import controller.AdministratorController;
import controller.Controller;
import controller.LoginController;
import gui.AdminMainFrame;

import javax.swing.*;

/**
 * Entry point
 *
 * @author Mihu Dumitru-Cosmin
 * @version 1.0, Mar 22, 2013
 */
public class Application {

	/**
	 * Main Method 1.0
	 * @param args
     *
	 * @since version 1.0
	 */
	public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                LoginController loginController = new LoginController();
            
            }
        });

    }
	
}
