/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

import java.time.LocalDateTime;

/**
 *
 * @author mert tan
 */
public class Demirbas {
    private String urunKodu;
    private String urunAdi;
    private double birimFiyati;
    private int adet;
    private LocalDateTime kayitTarihi;
    private String urunKategorisi;
    private Personel teslimAlan;
    private Personel teslimEden;
    private LocalDateTime teslimTarihi;

    public Personel getTeslimAlan() {
        return teslimAlan;
    }

    public void setTeslimAlan(Personel teslimAlan) {
        this.teslimAlan = teslimAlan;
    }

    public Personel getTeslimEden() {
        return teslimEden;
    }

    public void setTeslimEden(Personel teslimEden) {
        this.teslimEden = teslimEden;
    }

    public LocalDateTime getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDateTime teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
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

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
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
    
    
    
    
    
    
}

