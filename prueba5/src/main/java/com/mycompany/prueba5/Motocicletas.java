package com.mycompany.prueba5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicletas {
    public static void ingresarMotocicletas() throws SQLException{
        String sql = "Insert into motocicletas values (?, ?, ?, ?, ?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
     
        System.out.println("ID:");
        int id = Principal.sc.nextInt();
        sentencia.setInt(1, id);
        Principal.sc.nextLine();
     
        System.out.println("Fabricante: ");
        String fabricante = Principal.sc.nextLine();
        sentencia.setString(2, fabricante);
     
        System.out.println("Precio: ");
        int precio = Principal.sc.nextInt();
        sentencia.setInt(3, precio);
        Principal.sc.nextLine();
     
        System.out.println("Autonomia: ");
        int autonomia = Principal.sc.nextInt();
        sentencia.setInt(4, autonomia);
        Principal.sc.nextLine();
     
        System.out.println("ID Provedor: ");
        int idProv = Principal.sc.nextInt();
        sentencia.setInt(5, idProv);
        Principal.sc.nextLine();
     
     
        int filasIns = sentencia.executeUpdate();    
        if (filasIns > 0){
            System.out.println("*Inserción exitosa*");
            System.out.println("-------------------------------");
         
        }       
    }       
}
