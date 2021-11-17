/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mert tan
 */
@Entity
@Table(name="DEMIRBAS")
public class Demirbas implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "DEMIRBAS_SEQ", sequenceName = "SEQUENCE_DEMIRBAS", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "DEMIRBAS_SEQ")
    @Column(name="ID")
    private long id ;
    
    @Column(name="URUN_KODU")
    private String urunKodu;
    
    @Column(name="URUN_ADI")
    private String urunAdi;
    
    @Column(name="BIRIM_FIYATI")
    private Double birimFiyati;
   
    @Column(name="ADET")
    private Integer adet;
    
    @Column(name="KAYIT_TARIHI")
    private LocalDateTime  kayitTarihi;
    
    @Column(name="URUN_KATEGORISI")
    private String urunKategorisi;
    
        
    @OneToOne(cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JoinColumn(name = "TESLIM_ALAN_ID")
    private Calisan teslimAlan;

    @OneToOne(cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JoinColumn(name = "TESLIM_EDEN_ID")
    private Calisan teslimEden;
   
    @Column(name="TESLIM_TARIHI")
    private LocalDateTime teslimTarihi;

    
    public Demirbas(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(Double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public LocalDateTime getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(LocalDateTime kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public String getUrunKategorisi() {
        return urunKategorisi;
    }

    public void setUrunKategorisi(String urunKategorisi) {
        this.urunKategorisi = urunKategorisi;
    }

    public Calisan getTeslimAlan() {
        return teslimAlan;
    }

    public void setTeslimAlan(Calisan teslimAlan) {
        this.teslimAlan = teslimAlan;
    }

    public Calisan getTeslimEden() {
        return teslimEden;
    }

    public void setTeslimEden(Calisan teslimEden) {
        this.teslimEden = teslimEden;
    }

    public LocalDateTime getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDateTime teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }
    
    @Override
    public String toString() {
        return "Demirbas{" + "id=" + id + ", urunKodu=" + urunKodu + ", urunAdi=" + urunAdi + ", birimFiyati=" + birimFiyati + ", adet=" + adet + ", kayitTarihi=" + kayitTarihi + ", urunKategorisi=" + urunKategorisi + '}';
    }

    
     
}
