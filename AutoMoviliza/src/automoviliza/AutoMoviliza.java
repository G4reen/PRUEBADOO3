/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automoviliza;

import bd.Conexion;
import models.Cliente;
import view.GUI;
import view.Menu;

/**
 *
 * @author Cetecom
 */
public class AutoMoviliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Conexion cx = new Conexion();
        cx.conectar();
        
        
        Menu s = new Menu();
        
        s.setVisible(true);
        
    }
    
}
