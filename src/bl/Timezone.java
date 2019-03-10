/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author elisc
 */
public class Timezone extends JPanel implements Runnable{

    private LocalTime time;
    private ArrayList<DigitLabel> labelArr = new ArrayList<>();
    
    public Timezone(LocalTime time){
        this.time = time;
        this.setLayout(new GridLayout(1,8,3,3));
        //this.setBackground(Color.BLACK);
        
        for(int i = 0; i < 8; i++){
            DigitLabel label = new DigitLabel();
            this.add(label);
            labelArr.add(label);
        }
    }

    @Override
    public void run() {
        while(true){
            time = time.plusSeconds(1);
            draw();
            try{
                Thread.sleep(1000);
            }
            catch(Exception ex){
                
            }
        }
    }
    
    public LocalTime getTime(){
        return time;
    }

    private void draw() {
        useDigit(time.getHour()/10, 0);
        useDigit(time.getHour()%10, 1);
        useDigit(10, 2);
        useDigit(time.getMinute()/10, 3);
        useDigit(time.getMinute()%10, 4);
        useDigit(10, 5);
        useDigit(time.getSecond()/10, 6);
        useDigit(time.getSecond()%10, 7);
    }
    
    private void useDigit(int digit, int index){
        switch(digit){
            case 0:
                labelArr.get(index).setDigit(Digit.ZERO);
                break;
            case 1:
                labelArr.get(index).setDigit(Digit.ONE);
                break;
            case 2:
                labelArr.get(index).setDigit(Digit.TWO);
                break;
            case 3:
                labelArr.get(index).setDigit(Digit.THREE);
                break;
            case 4:
                labelArr.get(index).setDigit(Digit.FOUR);
                break;
            case 5:
                labelArr.get(index).setDigit(Digit.FIVE);
                break;
            case 6:
                labelArr.get(index).setDigit(Digit.SIX);
                break;
            case 7:
                labelArr.get(index).setDigit(Digit.SEVEN);
                break;
            case 8:
                labelArr.get(index).setDigit(Digit.EIGHT);
                break;
            case 9:
                labelArr.get(index).setDigit(Digit.NINE);
                break;
            case 10:
                labelArr.get(index).setDigit(Digit.COLON);
                break;
        }
    }

}
