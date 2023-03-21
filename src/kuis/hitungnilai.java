/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Lab Informatika
 */
public class hitungnilai implements MenghitungNilai{
    //String keintb, eyd, str, kreativitas, keindahan;
    double akhir, numkeintb, numeyd, numstr, numkre;
 

    /*public hitungnilai(String keintb, String eyd, String str, String kreativitas) {
        this.keintb = keintb;
        this.eyd = eyd;
        this.str = str;
        this.kreativitas = kreativitas;
        this.keindahan = keindahan;
    }*/

    public hitungnilai(double numkeintb, double numeyd, double numstr, double numkre) {
        this.numkeintb = numkeintb;
        this.numeyd = numeyd;
        this.numstr = numstr;
        this.numkre = numkre;
    }
    
    
    
    @Override
    public void hitungpuisi(){
        
        akhir = (0.3*numkeintb)+(0.2*numeyd)+(0.2*numstr)+(0.3*numkre);
    }
    
    public void hitungkartul(){
        
        akhir = (0.15*numkeintb)+(0.35*numeyd)+(0.25*numstr)+(0.25*numkre);
    }
    
    public double getnilai(){return akhir;}
}


