/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author veliz
 */
public class BD {
    public Connection conexion;
    
    public BD() {
        String url = "jdbc:mysql://localhost/ventas";
        String usuario = "root";
        String clave = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("DB: Conectado");
        } catch (Exception e) {
            System.out.println("DB: Error!");
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarProducto(Producto producto) {       
        try {
            PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO producto (nombre, precio) VALUE (?, ?)");
            
            sentencia.setString(1, producto.getNombre());
            sentencia.setDouble(2, producto.getPrecio());

            sentencia.execute();            
        } catch (Exception e) {
            System.out.println("Error al insertar producto!");
            System.out.println(e);
        }
    }
    
    public void modificarProducto(Producto producto) {       
        try {
            PreparedStatement sentencia = conexion.prepareStatement("UPDATE producto SET nombre = ?, precio = ? WHERE codigo = ?");
            
            sentencia.setString(1, producto.getNombre());
            sentencia.setDouble(2, producto.getPrecio());
            sentencia.setInt(3, producto.getCodigo());

            sentencia.execute();            
        } catch (Exception e) {
            System.out.println("Error al modificar producto!");
            System.out.println(e);
        }
    }
    
    public void eliminarProducto(Producto producto) {       
        try {
            PreparedStatement sentencia = conexion.prepareStatement("DELETE from producto WHERE codigo = ?");
        
            sentencia.setInt(1, producto.getCodigo());

            sentencia.execute();            
        } catch (Exception e) {
            System.out.println("Error al eliminar producto!");
            System.out.println(e);
        }
    }
    
    public ArrayList<Producto>obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList<Producto>() ;
        
        try {            
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery("SELECT * FROM producto");
            
            while(resultados.next()) {
                Producto producto = new Producto(
                        resultados.getInt("codigo"),
                        resultados.getString("nombre"),
                        resultados.getDouble("precio")
                );
                
                System.out.println(producto);
                
                productos.add(producto);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener alumnos!");
            System.out.println(e);
        }
        
        return productos;
    }
    
}
