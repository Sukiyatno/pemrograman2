package com.p2.hashset;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Produk{
	private Integer id;
	private String nama;
	private BigDecimal harga;
	
	public void setId(Integer x){
		this.id=x;
	}
	public void setNama(String x){
		this.nama=x;
	}
	public void setHarga(BigDecimal x){
		this.harga=x;
	}
	
	public Integer getId(){
		return this.id;
	}
	public String getNama(){
		return this.nama;
	}
	public BigDecimal getHarga(){
		return this.harga;
	}
}
