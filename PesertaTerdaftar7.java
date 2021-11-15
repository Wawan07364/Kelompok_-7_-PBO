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
public class PesertaTerdaftar7 {
    private PesertaWarga7 peserta;
    private int indexWarga;
    private String kodePerserta;
    
    public PesertaTerdaftar7(PesertaWarga7 peserta, 
            int indexWarga, String kodePerserta){
        this.peserta = peserta;
        this.indexWarga = indexWarga;
        this.kodePerserta = kodePerserta;
    }
    public PesertaWarga7 getPeserta(){
        return peserta;
    }
    public void setPeserta(PesertaWarga7 peserta){
        this.peserta = peserta;
    }
    public int getIndexWarga(){
        return indexWarga;
    }
    public void setIndexWarga(int indexWarga){
        this.indexWarga = indexWarga;
    }
    public String getKodePerserta(){
        return kodePerserta;
    }
    public void setKodePerserta(){
        this.kodePerserta = kodePerserta;
    }
}
