/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author mert tan
 */
public class Personel {
    private String personelDepartmani;
    private String personelKodu;
    private String personelAdi;
    private String personelSoyadi;
    private String personelGorevi;
    private String personelMail;
    private LocalDateTime kayitTarihi;

 
    public String getPersonelDepartmani() {
        return personelDepartmani;
    }

    public void setPersonelDepartmani(String personelDepartmani) {
        this.personelDepartmani = personelDepartmani;
    }

    public String getPersonelKodu() {
        return personelKodu;
    }

    public void setPersonelKodu(String personelKodu) {
        this.personelKodu = personelKodu;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public String getPersonelSoyadi() {
        return personelSoyadi;
    }

    public void setPersonelSoyadi(String personelSoyadi) {
        this.personelSoyadi = personelSoyadi;
    }

    public String getPersonelGorevi() {
        return personelGorevi;
    }

    public void setPersonelGorevi(String personelGorevi) {
        this.personelGorevi = personelGorevi;
    }

    public String getPersonelMail() {
        return personelMail;
    }

    public void setPersonelMail(String personelMail) {
        this.personelMail = personelMail;
    }

    public LocalDateTime getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(LocalDateTime kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    @Override
    public String toString() {
        return  personelAdi + " " + personelSoyadi ;
    }
   
   
    
}
