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

public class delivery {
    private String kategori, berat, pembayaran, total;
    
    
    
    public delivery(String berat, String kategori, String pembayaran, String total){
        this.berat = berat;
        this.kategori = kategori;
        this.pembayaran = pembayaran;
        this.total = total;
    }
    
    public int hitung(int berat, String kategori, int total){
        if(kategori.equals("Same Day")){
            total = 8000;
        } else if(kategori.equals("Reguler")){
            total = 3000;
        } else if(kategori.equals("Express")){
            total = 4000;
        } else if(kategori.equals("Barang Pecah Belah")){
            total = 5000;
        } else if(kategori.equals("Makanan")){
            total = 2500;
        } else {
            throw new IllegalArgumentException();
        }
        total = berat*total;
        this.total = String.valueOf(total);
        return total;
        
    }
    
    public void hitung(double berat, String kategori, int total){
        if(kategori.equals("Same Day")){
            total = 8000;
        } else if(kategori.equals("Reguler")){
            total = 3000;
        } else if(kategori.equals("Express")){
            total = 4000;
        } else if(kategori.equals("Barang Pecah Belah")){
            total = 5000;
        } else if(kategori.equals("Makanan")){
            total = 2500;
        } else {
            throw new IllegalArgumentException();
        }
        total = (int) (berat*total);
        this.total = String.valueOf(total);
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
    
    
}
