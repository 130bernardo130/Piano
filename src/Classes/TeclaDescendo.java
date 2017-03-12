/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.Position;

/**
 *
 * @author Bernardo
 */
public class TeclaDescendo {
    JLabel label;
    Icon icone;
    boolean visibiliade;
    Position pos;
    int tipo;
    public void setIcone(String local){
      icone= new ImageIcon(local);
      label.setIcon(icone);
    }
    
}
