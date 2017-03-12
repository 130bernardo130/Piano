/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.sound.sampled.Clip;

/**
 *
 * @author Bernardo
 */
public class Teclas {
    
    private static ArrayList<Tecla> tecla = null;
    
    
    public static Tecla getTecla(int tecla){
        if(Teclas.tecla== null){
            Teclas.tecla = new ArrayList<Tecla>();
            iniciarTeclas();
        }
       // System.out.println(Teclas.tecla.size()+" "+tecla);
        return Teclas.tecla.get(tecla);
    }
    private static void iniciarTeclas() {
        int ate7=1;

            for(ate7=1;ate7<8;ate7++){
              //  System.out.println("loud "+ate7);
                //System.out.println("c");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-c"+ate7+".wav"));
               // System.out.println("db");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-db"+ate7+".wav"));
               // System.out.println("d");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-d"+ate7+".wav"));
               // System.out.println("eb");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-eb"+ate7+".wav"));
               // System.out.println("e");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-e"+ate7+".wav"));
               // System.out.println("f");                
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-f"+ate7+".wav"));
               // System.out.println("gb");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-gb"+ate7+".wav"));
               // System.out.println("g");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-g"+ate7+".wav"));
               // System.out.println("ab");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-ab"+ate7+".wav"));
               // System.out.println("a");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-a"+ate7+".wav"));
               // System.out.println("bb");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-bb"+ate7+".wav"));
               // System.out.println("b");
                Teclas.tecla.add(new Tecla("Sons/loud/esc"+ate7+"/loud-b"+ate7+".wav"));    
               // System.out.println("termino");
            }
                    for(ate7=1;ate7<8;ate7++){
                       // System.out.println("med "+ate7);
                       // System.out.println("c");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-c"+ate7+".wav"));
                       // System.out.println("db");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-db"+ate7+".wav"));
                       // System.out.println("d");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-d"+ate7+".wav"));
                       // System.out.println("eb");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-eb"+ate7+".wav"));
                       // System.out.println("e");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-e"+ate7+".wav"));
                       // System.out.println("f");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-f"+ate7+".wav"));
                       // System.out.println("gb");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-gb"+ate7+".wav"));
                       // System.out.println("g");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-g"+ate7+".wav"));
                       // System.out.println("ab");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-ab"+ate7+".wav"));
                       // System.out.println("a");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-a"+ate7+".wav"));
                       // System.out.println("bb");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-bb"+ate7+".wav"));
                       // System.out.println("b");
                        Teclas.tecla.add(new Tecla("Sons/med/esc"+ate7+"/med-b"+ate7+".wav"));   
                        //System.out.println("termino");
                    }
            
          

            
    }
        
}
    
    
    

