package com.p2.tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class MainFile {
    public static void main(String[] args) throws ParseException, SQLException{
        FilmDao fd = new FilmDao();
        Integer pilih=0;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do{
            try{
                System.out.println("\n\t==MENU==");
                System.out.println("1. Tampil");
                System.out.println("2. Input");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan anda :");
                pilih = Integer.parseInt(in.readLine());
                switch(pilih){
                    case 1 : 
                        System.out.println("--daftar film--\n");
                        List<Film> lf = fd.tampilFilm();
                        if(lf.isEmpty()){
                            System.out.println("kosong");
                            break;
                        }

                        for (Film f : lf) {
                            System.out.println("judul : "+f.getJudul());
                            System.out.println("tgl release : "+new SimpleDateFormat("EEE, dd-MM-yyyy").format(f.getTglRelease()));
                            System.out.println("rating : "+f.getRating());
                            System.out.println("harga : "+f.getHargaFilm());
                            System.out.println("-----------------------------------\n");
                        }
                        break;
                    case 2 : 
                        Film f = new Film();
                        System.out.println("--input film--");
                        System.out.print("judul :"); 
                        f.setJudul(in.readLine());

                        System.out.print("tgl release (dd-MM-yyyy) :"); 
                        f.setTglRelease(new SimpleDateFormat("dd-MM-yyyy").parse(in.readLine()));

                        System.out.print("rating (1-10) :"); 
                        f.setRating(Integer.parseInt(in.readLine()));

                        System.out.print("harga film :");    
                        f.setHargaFilm(new BigDecimal(in.readLine()));

                        fd.simpanFilm(f);
                        break;
                    case 3 : 
                        System.out.println("Terima Kasih");
                        break;
                    default:
                        System.out.println("Pilihan anda Salah");
                }
            }catch(ParseException pe){
                System.out.println("penulisan tanggal salah");
            }catch(NumberFormatException nfe){
                System.out.println("terjadi kesalahan pada inputan! ");
                pilih=1;
            }catch(IOException ioe){
                
            }
        }while(pilih!=3);
    }
}
