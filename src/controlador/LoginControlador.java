/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JFrame;

/**
 *
 * @author veliz
 */
public class LoginControlador extends BaseControlador {
    public LoginControlador() {
        super("VistaLogin");
    }
    
    public void login() {
        JFrame v = getVistaInstancia();
        System.out.println(v);
    }
}
