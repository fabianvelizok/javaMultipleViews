/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaLogin;

/**
 *
 * @author veliz
 */
public class ControladorLogin {
    public static VistaLogin vista = new VistaLogin();
    
    public static void mostrar() {
        vista.setVisible(true);
    }

    public static void ocultar() {
        vista.setVisible(false);
    }
    
    public static void login() {
        String usuario = vista.getjTextFieldUsuario().getText();
        String clave = new String(vista.getjPasswordFieldContrasenia().getPassword());
        
        System.out.println(usuario);
        System.out.println(clave);
        
        // Usar clase del modelo para validar estos datos
        if (usuario.equals("admin") && clave.equals("1234")) {
            ocultar();
            ControladorInicio.mostrar();
            
            vista.getjTextFieldUsuario().setText("");
            vista.getjPasswordFieldContrasenia().setText("");
        } else {
            System.out.println("Usuario o clave incorrecto!");
        }
        
    }
}
