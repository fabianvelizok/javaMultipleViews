/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaInicio;

/**
 *
 * @author veliz
 */
public class ControladorInicio {
    public static VistaInicio vista = new VistaInicio();
    
    public static void mostrar() {
        vista.setVisible(true);
    }

    public static void ocultar() {
        vista.setVisible(false);
    }
    
    public static void ralizarVenta() {
        ocultar();
        ControladorVenta.mostrar();
    }
    
    public static void verProductos() {
        ocultar();
        ControladorProducto.mostrar();
    }
    
    public static void salir() {
        ocultar();
        ControladorLogin.mostrar();
    }

}
