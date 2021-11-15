/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranwarga;

/**
 *
 * @author COMPAQ
 */
public class PesertaWarga7 extends BiodataWarga7{
    private  String umur;
    public PesertaWarga7(String umur, String nama, String noTlp, String alamat) {
        super(nama, noTlp, alamat);
        this.umur = umur;
    }
    public String getUmur(){
        return umur;
    }
    public  void setUmur(String umur){
        this.umur = umur;
    }
    
}