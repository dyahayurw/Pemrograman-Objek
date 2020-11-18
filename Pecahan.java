package com.yoman;

public class Pecahan {
    public int pembilang, penyebut;
    public int getpembilang() {return pembilang;}
    public int getpenyebut() {return penyebut;}

    Pecahan(int pembilang, int penyebut) {
    	this.penyebut = penyebut; 
    	this.pembilang = pembilang; 
    }

    public static void main(String [] args){
        Pecahan p;
        int i, j;
        Pecahan d1 = new Pecahan(3,2);
        System.out.print("Objek 1 : ");
        System.out.print(+d1.getpembilang());
        System.out.print("/");
        System.out.print(+d1.getpenyebut());
        System.out.println();
        
        p = d1.tambah(d1);
        i = p.pembilang;
        j = p.penyebut;
        System.out.print( "hasil : " +i);
        System.out.print("/");
        System.out.print(+j);
        System.out.println();
       }

    public Pecahan tambah(Pecahan p){
    	int data1, data2;   
      	int data3; 
      	Pecahan d1;
      	d1 = p; 
      	data1 = p.penyebut;
      	data2 = p.pembilang;

	    Pecahan d2 = new Pecahan(5,6);
		System.out.print("Objek 2 : ");     
		System.out.print(+d2.getpembilang());
		System.out.print("/"); 
		System.out.print(+d2.getpenyebut());
		System.out.println();

		p.penyebut = data1 * d2.penyebut;
    	p.pembilang = d2.penyebut*data2 + data1*d2.pembilang;
      	return p;    
    }
}