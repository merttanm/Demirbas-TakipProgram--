/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.time.LocalDateTime;

/**
 *
 * @author mert tan
 */
public class KayitOlanKullaniciBilgileri {
   
    private String kullaniciAdi;
    private String parola;
    private LocalDateTime sistemeKayitTarihi;
    private String adi;
    private String soyadi;
    private String mail;
    private String telefonNumarasi;
     
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

    public LocalDateTime getSistemeKayitTarihi() {
        return sistemeKayitTarihi;
    }

    public void setSistemeKayitTarihi(LocalDateTime sistemeKayitTarihi) {
        this.sistemeKayitTarihi = sistemeKayitTarihi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
