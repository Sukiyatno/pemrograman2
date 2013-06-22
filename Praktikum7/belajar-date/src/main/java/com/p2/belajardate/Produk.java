package com.p2.belajardate;

import java.math.BigDecimal;
import java.util.Date;

public class Produk{
	private Integer id;
	private String kodeProduk;
	private JenisProduk jp;
	private String nama;
	private BigDecimal harga;
	private Date waktuinput;
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getKodeProduk(){
		return this.kodeProduk;
	}
	public void setKodeProduk(String kodeProduk){
		this.kodeProduk = kodeProduk;
	}
	public JenisProduk getJp(){
		return this.jp;
	}
	public void setJp(JenisProduk jp){
		this.jp = jp;
	}
	public String getNama(){
		return this.nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public BigDecimal getHarga(){
		return this.harga;
	}
	public void setHarga(BigDecimal harga){
		this.harga = harga;
	}
	public Date getWaktuInput(){
		return this.waktuinput;
	}
	public void setWaktuInput(Date waktuinput){
		this.waktuinput = waktuinput;
	}
	
}
