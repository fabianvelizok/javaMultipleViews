/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
import modelo.BD;
import modelo.Producto;

/**
 *
 * @author veliz
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BD bd = new BD();
        
        Producto p = new Producto(7, "HOLAAA", 200);
        bd.modificarProducto(p);
        
        Producto p2 = new Producto(6, "HOLAAA", 200);
        bd.eliminarProducto(p2);
        
        System.out.println(bd.obtenerProductos());
        
        ControladorLogin.mostrar();
    }
    
}
