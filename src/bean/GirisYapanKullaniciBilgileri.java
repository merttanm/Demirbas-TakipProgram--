/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
/**
 *
 * @author mert tan
 */
public class GirisYapanKullaniciBilgileri {
     private String kullaniciAdi;
     private String parola;
     private Date sistemeGirisTarihi;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Date getSistemeGirisTarihi() {
        return sistemeGirisTarihi;
    }

    public void setSistemeGirisTarihi(Date sistemeGirisTarihi) {
        this.sistemeGirisTarihi = sistemeGirisTarihi;
    }
     
     
            
}
