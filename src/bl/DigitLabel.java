/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author elisc
 */
public class DigitLabel extends JLabel{
    
    public void setDigit(Digit digit){
        this.setIcon(digit.getIcon());
    }

}
