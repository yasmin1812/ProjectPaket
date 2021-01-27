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
abstract class person {
    private String nama, kota, kodepos, telp, alamat;
    
    public person(String nama,String kota,String kodepos,String telp,String alamat){
        this.nama = nama;
        this.kota = kota;
        this.kodepos = kodepos;
        this.telp = telp;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
