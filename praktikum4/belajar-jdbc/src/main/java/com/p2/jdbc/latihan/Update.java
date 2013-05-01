package com.p2.jdbc.latihan;

import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update{
	public static void main(String[]args){
	try{
		//parameter yang dikirim adalah host, port, database, user, dan password
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","");
		Statement stm = conn.createStatement();
		
		String query="UPDATE produk SET nama='dipsi', harga='4500' WHERE id=1";
		int hasil =stm.executeUpdate(query);
		
		if(hasil==1){
			JOptionPane.showMessageDialog(null,"berhasil Update");
		}else{
		JOptionPane.showMessageDialog(null,"gagal Update");
		}
}catch (SQLException se){
Logger.getLogger(Update.class.getName()).log(Level.SEVERE,null,se);
}
}
}		
		