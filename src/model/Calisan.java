/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mert tan
 */

@Entity
@Table(name="CALISAN")
public class Calisan implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "CALISAN_SEQ", sequenceName = "CALISAN_KULLANICI", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CALISAN_SEQ")
    @Column(name="ID")
    private Long id;
    
    @Column(name="CALISAN_DEPARTMANI")
    private String personelDepartmani;
    @Column(name="CALISAN_KODU")
    private String personelKodu;
    @Column(name="CALISAN_ADI")
    private String personelAdi;
    @Column(name="CALISAN_SOYADI")
    private String personelSoyadi;
    @Column(name="CALISAN_GOREVI")
    private String personelGorevi;
    @Column(name="CALISAN_MAIL")
    private String personelMail;
    @Column(name="KAYIT_TARIHI")
    private LocalDateTime kayitTarihi;   
   
    public Calisan(){
        
    }

    @Override
    public String toString() {
        return  personelAdi + " "+ personelSoyadi  ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

}
