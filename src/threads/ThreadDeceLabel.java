/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Bernardo
 */
public class ThreadDeceLabel implements Runnable{
    JLabel lb;
    int posy;
    public ThreadDeceLabel(JLabel lab) {
    this.lb = lab;
    
    }
    
    
    @Override
    public void run() {
        lb.setLocation(this.lb.getX(), 0);
        lb.setVisible(true);
        long tempo;
                
        while(lb.isShowing()){
            tempo= System.currentTimeMillis();
            lb.setLocation(this.lb.getX(), this.lb.getY()+1);
            while(System.currentTimeMillis()-tempo < 10){
                int i=0;
                i++;
            }
                
            if(this.lb.getY()==361){
                lb.setVisible(false);
            }
        }
        
    }
    
    
}
