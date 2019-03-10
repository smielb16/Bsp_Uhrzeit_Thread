/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.GridLayout;
import java.time.LocalTime;
import javax.swing.JPanel;

/**
 *
 * @author elisc
 */
public class Timezone extends JPanel implements Runnable{

    private LocalTime time;
    
    public Timezone(LocalTime time){
        this.time = time;
        this.setLayout(new GridLayout(1,8,3,3));
    }

    @Override
    public void run() {
        while(true){
            time.plusSeconds(1);
            draw();
            try{
                Thread.sleep(1000);
            }
            catch(Exception ex){
                
            }
        }
    }

    private void draw() {
        
    }

}
