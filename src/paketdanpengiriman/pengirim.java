/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paketdanpengiriman;

/**
 *
 * @author hp
 */
public class pengirim extends person {
    private String nik, email;

    public pengirim(String nik, String email, String nama,String kota,String kodepos,String telp,String alamat){
        super(nama, kota, kodepos, telp, alamat);
        this.nik = nik;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
}
