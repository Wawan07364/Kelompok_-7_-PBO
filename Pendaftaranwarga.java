/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranwarga;
import java.util.Scanner;
/**
 *
 * @author COMPAQ
 */
public class Pendaftaranwarga {
    private  static Scanner input = new Scanner(System.in);
    private static PesertaWarga7[] peserta = new PesertaWarga7[100];
    private static Panitia7[] panitia = new Panitia7[100];
    private static PesertaTerdaftar7[] terdaftar = new PesertaTerdaftar7[100];
    private static  int pilWarga;
    private static int jumWarga = 0;
    private static int cekPanitia;
    
    public static void main(String[] args) {
     dataPanitia();
       int pil;
        do {
            System.out.println("Jumlah Warga : " +jumWarga);
            System.out.println("1. Login Panitia");
            System.out.println("2. Lihat Warga Terdaftar");
            System.out.println("3. Biodata Panitia");
            pil = input.nextInt();
            input.nextLine();
           switch (pil) {
                case 1:
                    loginPanitia();
                    break;
                case 2:
                    viewPeserta();
                    break;
                case 3:
                    viewPanitia();
                    break;
                
            }
        } while (pil != 0);
    }
    
    static int dataPanitia(){
      String namaPanitia[] = {"Afif","Wawan", "Siliwangi"};
        String passPanitia[] = {"01", "02", "03"};
        String noTlpPanitia[] = {"081", "082", "083"};
        String alamatPanitia[] = {"jl.", "jl.", "jl."};
        for (int i = 0; i < namaPanitia.length; i++) {
          panitia[i] = new Panitia7(passPanitia[i], namaPanitia[i], 
                  noTlpPanitia[i], alamatPanitia[i]);  
        }
        return namaPanitia.length;
    }
    
    static void loginPanitia(){
        System.out.println("nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekPanitia = login(nama, password);
        System.out.println(" Selamat Datang " +panitia[cekPanitia].getNama());
        int pil;
        do {
            System.out.println("Jumlah Warga : " +jumWarga);
            System.out.println("1. Daftar Perserta");
            System.out.println("2. Ubah Data Perserta");
            System.out.println("3. Lihat Perserta Terdaftar");
            System.out.println("4. Hapus Perserta");
            System.out.println("0. Log out");
            pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    updatePeserta();
                    break;
                case 3:
                     viewPeserta();
                    break;
                case 4:
                    deletePeserta();
                    break;
            }
        } while (pil != 0);
    }
    
    static int login(String nama, String password){
        int loop = 0;
        for (int i = 0; i <= dataPanitia(); i++) {
            if (panitia[i].getNama().equals(nama) && panitia[i].getPassword().equals(password)) {
                break;
            }else{
                loop++;
            }    
        }
        return loop;    
    }
    
    static  void insertPeserta(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Input umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No.Telp : ");
        String noTlp = input.nextLine();
        peserta[jumWarga] = new PesertaWarga7(umur, nama, noTlp, alamat);
        insertWarga();
    }
    static void insertWarga(){
        System.out.println("Warga : ");
        for (int i = 0; i < Warga7.warga.length; i++) {
            System.out.println(i+ ". " +Warga7.warga[i]);
        }
        System.out.println("Pilih Warga : ");
        pilWarga = input.nextInt();
        System.out.println("Input Kode Perserta : ");
        String kodePeserta = input.next();
        terdaftar[jumWarga] = new PesertaTerdaftar7(peserta[jumWarga],pilWarga,kodePeserta);
        jumWarga = jumWarga + 1;
    }
    
    static void updatePeserta(){
        System.out.println("Masukan kode perserta yang mau di Edit: ");
        String search = input.next();
        int cari = 0;
        do {
            if (cari == jumWarga) {
                System.err.println("tidak ada data");
                break;
            }else if (terdaftar[cari].getKodePerserta().equals(search)){
                int pilEdit;
                do {
                    System.out.println("Pilih data yang ingin diubah ");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat ");
                    System.out.println("4. No.Telp");
                    System.out.println("5. Umur ");
                    System.out.println("6. Warga");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1) {
                        System.out.println("========================================================");
                        System.out.println("Kode Peserta : "+ terdaftar[cari].getKodePerserta());
                        System.out.println("========================================================");
                        System.out.println("nama: "+ peserta[cari].getUmur() + "\nUmur :"
                        + peserta[cari].getUmur()+ "\nAlamat :" + peserta[cari].getAlamat()+
                         "\n No.Telp :" + peserta[cari].getNoTlp()+ "\n Lomba :"
                        +Warga7.warga[terdaftar[cari].getIndexWarga()]);
                        System.out.println("========================================================");
                    }else if (pilEdit == 2) {
                        System.out.println("Ubah Nama : ");
                        String editNama = input.nextLine();
                        peserta[cari].setNama(editNama);
                    }else if (pilEdit == 3) {
                        System.out.println("Ubah Alamat : ");
                        String editAlamat = input.nextLine();
                        peserta[cari].setAlamat(editAlamat);
                    }else if (pilEdit == 4) {
                        System.out.println("Ubah No.Telp : ");
                        String editNotelp = input.nextLine();
                        peserta[cari].setNoTlp(editNotelp);
                    }else if (pilEdit == 5) {
                        System.out.println("Ubah Umur : ");
                        String editUmur = input.nextLine();
                        peserta[cari].setUmur(editUmur);
                    }else if (pilEdit == 6) {
                        System.out.println("Ubah Pilih Lomba : ");
                        for (int i = 0; i < Warga7.warga.length; i++) {
                            System.out.println(i+ " . " +Warga7.warga[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editWarga = input.nextInt();
                        terdaftar[cari].setIndexWarga(editWarga);
                    }
                } while (pilEdit != 0);
                    break;
            }else{
                cari = cari + 1;
            }
        } while (true);
    }
    
    static void viewPeserta(){
        if (jumWarga == 0) {
            System.out.println("belum ada peserta terdaftar");
        }else{
            for (int i = 0; i < jumWarga; i++) {
                 System.out.println("========================================================");
                 System.out.println("Kode Peserta: " +terdaftar[i].getKodePerserta());
                 System.out.println("========================================================");
                 System.out.println("nama: "+ peserta[i].getNama()+ "\nUmur :"
                        + peserta[i].getUmur()+ "\nAlamat :" + peserta[i].getAlamat()+
                         "\n No.Telp :" + peserta[i].getNoTlp()+ "\n Warga :"
                        +Warga7.warga[terdaftar[i].getIndexWarga()]);
                 System.out.println("=========================================================");
            }
        }
    }
    
    static void viewPanitia(){
        for (int i = 0; i < dataPanitia(); i++) {
            System.out.println("=======================================================");
            System.out.println("nama: "+ panitia[i].getNama()+ 
                         "\n No.Telp :" + panitia[i].getNoTlp()+ "\nAlamat :" 
                        + panitia[i].getAlamat());
            System.out.println("======================================================");
        }
    }
    
    static void deletePeserta(){
        System.out.println("Masukan Kode peserta yang akan di hapus :");
        String search = input.next();
        input.nextLine();
        int cari = 0;
        do {
            if (cari == jumWarga) {
                System.err.println("tidak ada data");
                break;
            }else if (terdaftar[cari].getKodePerserta().equals(search)) {
                if (cari == jumWarga-1) {
                    jumWarga = jumWarga - 1;
                }else{
                    for (int i = cari; i < jumWarga; i++) {
                        terdaftar[i] = terdaftar[i + 1];
                        peserta[i] = peserta[i + 1];
                    }
                    jumWarga = jumWarga - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        } while (true);
        
    }
}
