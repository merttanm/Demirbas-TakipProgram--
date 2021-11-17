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
public class DemirbasPersonel {
    
    private Demirbas demirbas;
    private Personel teslimAlanPersonel;
    private Personel teslimEdenPersonel;
    private LocalDateTime teslimTarihi;

    public Demirbas getDemirbas() {
        return demirbas;
    }

    public void setDemirbas(Demirbas demirbas) {
        this.demirbas = demirbas;
    }

    public Personel getTeslimAlanPersonel() {
        return teslimAlanPersonel;
    }

    public void setTeslimAlanPersonel(Personel teslimAlanPersonel) {
        this.teslimAlanPersonel = teslimAlanPersonel;
    }

    public Personel getTeslimEdenPersonel() {
        return teslimEdenPersonel;
    }

    public void setTeslimEdenPersonel(Personel teslimEdenPersonel) {
        this.teslimEdenPersonel = teslimEdenPersonel;
    }

    public LocalDateTime getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDateTime  teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }
    
    
}
