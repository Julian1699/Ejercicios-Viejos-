package com.mycompany.prueba5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Compras {
    public static void ingresarCompras() throws SQLException{
        String sqlComp = "Insert into bicicletas values (?, ?, ?, ?)";
        PreparedStatement senComp = Principal.conectar().prepareStatement(sqlComp);
     
        System.out.println("ID:");
        int id = Principal.sc.nextInt();
        senComp.setInt(1, id);
        Principal.sc.nextLine();
     
        System.out.println("Alias Comprador: ");
        String alias = Principal.sc.nextLine();
        senComp.setString(2, alias);
     
        System.out.println("Fabricante: ");
        String nombre = Principal.sc.nextLine();
        senComp.setString(3, nombre);
     
        System.out.println("Fecha y Hora: ");
        String fechaHora = Principal.sc.nextLine();
        senComp.setString(4, fechaHora);
     
     
        int filasIns = senComp.executeUpdate();    
        if (filasIns > 0){
           System.out.println("*Inserción exitosa*");
           System.out.println("-------------------------------");        
        }       
    }
}
