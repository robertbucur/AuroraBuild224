package gui;

import javax.swing.*;
import java.awt.*;

/**
 * User: Alexandru
 * Date: 4/10/13
 * Time: 4:16 PM
 */
public class Utils {
    public static JPanel putInPanel(Component component) {
        JPanel pan=new JPanel();
        pan.add(component);
        return pan;
    }
}
