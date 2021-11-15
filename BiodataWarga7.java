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
public class BiodataWarga7 {
    protected String nama,noTlp,alamat;
    public  BiodataWarga7(String nama, String noTlp, String alamat){
        this.nama = nama;
        this.noTlp = noTlp;
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNoTlp(){
        return noTlp;
    }
    public void setNoTlp(String noTlp){
        this.noTlp = noTlp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat =alamat;
    }
}
