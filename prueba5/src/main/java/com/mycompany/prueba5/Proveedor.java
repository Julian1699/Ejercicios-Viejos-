package com.mycompany.prueba5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Proveedor {
     public static void ingresarProveedor() throws SQLException{
       String sqlProv = "insert into proveedor values (?, ?, ?, ?)";
       PreparedStatement senProv = Principal.conectar().prepareStatement(sqlProv);
     
        System.out.println("ID:");
        int id = Principal.sc.nextInt();
        senProv.setInt(1, id);
        Principal.sc.nextLine();
     
        System.out.println("Nombre: ");
        String nombre = Principal.sc.nextLine();
        senProv.setString(2, nombre);
     
        System.out.println("Dirección: ");
        String direccion = Principal.sc.nextLine();
        senProv.setString(3, direccion);
     
        System.out.println("Telefono: ");
        String telefono = Principal.sc.nextLine();
        senProv.setString(4, telefono);
     
     
         int filasIns = senProv.executeUpdate();    
         if (filasIns > 0){
            System.out.println("*Ejecutado con Exito*");
            System.out.println("-------------------------------");
         
        }       
    }
}
