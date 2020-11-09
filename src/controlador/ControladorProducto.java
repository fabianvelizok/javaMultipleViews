/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaProducto;

/**
 *
 * @author veliz
 */
public class ControladorProducto {
    public static VistaProducto vista = new VistaProducto();
    
    public static void mostrar() {
        vista.setVisible(true);
    }

    public static void ocultar() {
        vista.setVisible(false);
    }
    
    public static void agregarProducto() {
        
    }
    
    public static void modificarProducto() {
        
    }
    
    public static void eliminarProducto() {
        
    }
}
