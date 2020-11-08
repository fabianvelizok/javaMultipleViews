/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JFrame;
import vistas.*;

/**
 *
 * @author veliz
 */
public class BaseControlador {
    public String vista;
    public JFrame vistaInstancia;

    public BaseControlador(String vista) {
        setVista(vista);
        
        switch (vista) {
            case "VistaLogin":
                setVistaInstancia(new VistaLogin());
                break;
            case "VistaPrincipal":
                setVistaInstancia(new VistaPrincipal());
                break;
            case "VistaProducto":
                setVistaInstancia(new VistaProducto());
                break;
            case "VistaVenta":
                setVistaInstancia(new VistaVenta());
                break;
            default:
                System.out.println("Vista inválida!");
        }
    }

    public void mostrar() {
        System.out.println("Mostrar");
        System.out.println(this.getVista());
        vistaInstancia.setVisible(true);
    }

    public void ocultar() {
        vistaInstancia.setVisible(false);
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }
    
    public void setVistaInstancia(JFrame vistaInstancia) {
        this.vistaInstancia = vistaInstancia;
    }

    public JFrame getVistaInstancia() {
        return vistaInstancia;
    }
}
