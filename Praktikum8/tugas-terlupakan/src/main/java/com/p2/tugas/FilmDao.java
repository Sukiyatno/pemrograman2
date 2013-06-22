package com.p2.tugas;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDao {
    
    public void simpanFilm(Film f) throws SQLException{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas_terlupakan","root","");
        String sqlSimpan="INSERT INTO `film`(`judul`, `tglRelease`, `rating`, `hargaFilm`) VALUES "
                + "(?,?,?,?)";
        PreparedStatement psSimpan = c.prepareStatement(sqlSimpan);
        psSimpan.setString(1, f.getJudul());
        psSimpan.setDate(2,new java.sql.Date(f.getTglRelease().getTime()));
        psSimpan.setInt(3, f.getRating());
        psSimpan.setBigDecimal(4, f.getHargaFilm());
        
        psSimpan.executeUpdate();
        c.close();
    }
    
    public List<Film> tampilFilm() throws SQLException{
        List<Film> lf = new ArrayList<Film>();
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas_terlupakan","root","");
        String sqlTampil = "SELECT * FROM film";
        PreparedStatement psTampil = c.prepareStatement(sqlTampil);
        ResultSet rs = psTampil.executeQuery();
        while(rs.next()){
            Film f = new Film();
            f.setId(rs.getInt("id"));
            f.setJudul(rs.getString("judul"));
            f.setTglRelease(rs.getDate("tglRelease"));
            f.setRating(rs.getInt("rating"));
            f.setHargaFilm(rs.getBigDecimal("hargaFilm"));
            
            lf.add(f);
        }
        c.close();
        return lf;
    }
}