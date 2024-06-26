package com.mycompany.prueba5;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Clientes {
    
    public static void ingresarClientes() throws SQLException{
        String sql = "Insert into clientes values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
     
        System.out.println("Alias :");
        String alias = Principal.sc.nextLine();
        sentencia.setString(1, alias);
     
        System.out.println("Nombre: ");
        String nombre = Principal.sc.nextLine();
        sentencia.setString(2, nombre);
     
        System.out.println("Apellido: ");
        String apellido = Principal.sc.nextLine();
        sentencia.setString(3, apellido);
     
        System.out.println("e-mail: ");
        String email = Principal.sc.nextLine();
        sentencia.setString(4, email);
     
        System.out.println("Celular: ");
        String celular = Principal.sc.nextLine();
        sentencia.setString(5, celular);
     
        System.out.println("Contraseña: ");
        int contrasena = Principal.sc.nextInt();
        sentencia.setInt(6, contrasena);
     
        System.out.println("F. Nacimiento: ");
        String nacimiento = Principal.sc.nextLine();
        sentencia.setString(7, nacimiento);
     
        int filasIns = sentencia.executeUpdate();    
        if (filasIns > 0){
             System.out.println("*Ejecutado con exito*");
        }    
    }
}
