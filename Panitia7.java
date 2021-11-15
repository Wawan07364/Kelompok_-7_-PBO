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
public class Panitia7 extends BiodataWarga7 {
    private  String password;
    public Panitia7(String password, String nama, String noTlp, String alamat) {
        super(nama, noTlp, alamat);
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public  void setPassword(String password){
        this.password = password;
    }
}