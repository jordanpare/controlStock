package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = new ConnectionFactory().recuperaConexion();
		
		Statement statement = con.createStatement();
		
		statement.execute("DELETE FROM PRODUCTO WHERE ID = 99");
		
		System.out.println(statement.getUpdateCount());
		//prueba modificar
		//String nombre = null;
		//String descripcion = null;
		//String cantidad = null;
		//String id = null;
		//String sql = "UPDATE PRODUCTO SET "
			//+ " NOMBRE = '" + nombre + "'"
		  //+ ", DESCRIPCION = '" + descripcion + "'"
		//+ ", CANTIDAD = " + cantidad + " WHERE ID = " + id + ";";
		    
		//statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
		
		//System.out.println(sql);
		
	}

}
