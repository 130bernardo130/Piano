/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import threads.ThreadReprodutor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Bernardo
 */
public class Tecla {
    
    
   private String local;
   private  Clip audio;
   private AudioInputStream som;

    public Tecla(String loc) {
         this.local = loc;
                    try{
                        //System.out.println(loc);
                        this.som = AudioSystem.getAudioInputStream(getClass().getResource(local));
                         try {
                        this.audio= AudioSystem.getClip();
                        this.audio.open(som);
                    } catch (LineUnavailableException ex) {
                       ex.printStackTrace();
                    } catch (IOException ex) {
                       ex.printStackTrace();
                    }
                    }catch(Exception ex){
                       ex.printStackTrace();
                    }
    }
   
   
 

   public void reproduzir(){
     new Thread(new ThreadReprodutor(audio, som)).start();
       /*if(audio.isOpen()){
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
        */
       
      
   }
 /*  public void parar(){
       this.audio.close();
                try{
                    this.audio.open(som);
                } catch (LineUnavailableException ex) {
                       ex.printStackTrace();
                } catch (IOException ex) {
                       ex.printStackTrace();
                }
                  
   }*/

}
