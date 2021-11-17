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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mert tan
 */
@Entity
@Table(name="LOGIN")
public class Login implements Serializable{
    private final static long serialVersionUID=1L;
    @Id
    @Column(name="ID")
    @SequenceGenerator(name = "LOGIN_SEQ", sequenceName = "SEQUENCE_LOGIN", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "LOGIN_SEQ")
    private Long id ;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="KULLANICI_ID")
    private Kullanici  kullanici;
    
    @Column(name="SON_GIRIS_TARIHI")
    private LocalDateTime sonGirisTarihi;
    
    public Login(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public LocalDateTime getSonGirisTarihi() {
        return sonGirisTarihi;
    }

    public void setSonGirisTarihi(LocalDateTime sonGirisTarihi) {
        this.sonGirisTarihi = sonGirisTarihi;
    }
    
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
