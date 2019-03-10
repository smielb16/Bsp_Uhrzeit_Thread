/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author elisc
 */
public enum Digit {
    
    ZERO("./digits/zero.png"), ONE("./digits/one.png"),
    TWO("./digits/two.png"), THREE("./digits/three.png"),
    FOUR("./digits/four.png"), FIVE("./digits/five.png"), 
    SIX("./digits/six.png"), SEVEN("./digits/seven.png"),
    EIGHT("./digits/eight.png"), NINE("./digits/nine.png"),
    COLON("./digits/colon.png");
    
    private ImageIcon icon;

    private Digit(String path){
        icon = new ImageIcon(path);
    }
    
    public ImageIcon getIcon(){
        return icon;
    }
    
}
