/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 *
 * @author mert tan
 */
@Entity
@Table(name="KULLANICI")
public class Kullanici implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "KULLANICI_SEQ", sequenceName = "SEQUENCE_KULLANICI", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "KULLANICI_SEQ")
    private Long id;
    
    @Column(name="KULLANICI_ADI")
    private String kullaniciAdi;
    @Column(name="PAROLA")
    private String parola;
    @Column(name="KAYIT_TARIHI")
    private LocalDateTime sistemeKayitTarihi;
    @Column(name="ADI")
    private String adi;
    @Column(name="SOYADI")
    private String soyadi;
    @Column(name="MAIL")
    private String mail;
    @Column(name="TELEFON_NUMARASI")
    private String telefonNumarasi;
    
    
    public Kullanici(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "KayitliKullanicilar{" + "id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", parola=" + parola + ", sistemeKayitTarihi=" + sistemeKayitTarihi + ", adi=" + adi + ", soyadi=" + soyadi + ", mail=" + mail + ", telefonNumarasi=" + telefonNumarasi + '}';
    }
      
}
