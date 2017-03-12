/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Bernardo
 */
public class ThreadReprodutor implements Runnable{
   private AudioInputStream som;
   private  Clip audio;
   
    public ThreadReprodutor(Clip cl,AudioInputStream sn) {
        this.audio = cl;
        this.som = sn;
    }

    
    @Override
    public void run() {
       if(audio.isOpen()){
           if(audio.isRunning()){
            audio.setMicrosecondPosition(0);
            }else if(audio.getMicrosecondLength()==audio.getMicrosecondPosition()||audio.getMicrosecondPosition()>audio.getMicrosecondLength()/2){
               audio.setMicrosecondPosition(0);
               
            }
           
           audio.start();  
       }else{
            try{
                this.audio.open(som);
            } catch (LineUnavailableException ex) {
                   ex.printStackTrace();
            } catch (IOException ex) {
                   ex.printStackTrace();
            }
           audio.start();
       }
    
}}
