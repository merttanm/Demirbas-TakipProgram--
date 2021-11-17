/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbislemleri;

import java.util.ArrayList;
import java.util.List;
import model.Kullanici;
import model.Calisan;
import model.Demirbas;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;

/**
 *
 * @author mert tan
 */
public class DatabaseIslemleri {
        /***
     *tüm database işlemleri kayıt ekle, kayıt sil, güncelle, kayit arama işlemleri buradan yapılır. Databasedeki 
     * tablolar ile etkileşim bu sınıftaki her bir metot ile oluyor..
     * 
     */
    // ilk once for ile donup kullanici varmı diye kontrol etmişşiz. yani db deki kayıtları çekip bakıcaz 
    public List<Kullanici>  butunKayitliKullanicilariGetir(){
        List<Kullanici> kullaniciListesi = new ArrayList<>();
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select k from Kullanici k");
           
           Query<Kullanici> query = session.createQuery(sb.toString());
           kullaniciListesi =  query.getResultList();
 
            tx.commit();
            session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
        
        return kullaniciListesi;
    }
    public void kullaniciKaydet(Kullanici kullanici ){
        Session session = null;
        try{
            session  = HibernateUtil.buildSessionFactory();
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(kullanici);
            tx.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
    
     public List<Calisan>  butunKayitliPersonelleriGetir(){
        List<Calisan> personelListesi = new ArrayList<>();
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select p from Calisan p");
           
           Query<Calisan> query = session.createQuery(sb.toString());
           personelListesi =  query.getResultList();
 
           tx.commit();
           session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
        
        return personelListesi;
    }
     
    public List<Demirbas> butunDemirbaslariGetir(){
        List<Demirbas> demirbasListesi = new ArrayList<>();
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select d from Demirbas d");
           
           Query<Demirbas> query = session.createQuery(sb.toString());
           demirbasListesi =  query.getResultList();
 
           tx.commit();
           session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       } 
        
        return demirbasListesi;
    }
     
   
    public Demirbas demirbasiUrunKodunaGoreGetir(String urunKodu){
        Session session=null;
        List<Demirbas> demirbas = new ArrayList<>();
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select d from Demirbas d where d.urunKodu =:urunKodu");
           
           Query<Demirbas> query = session.createQuery(sb.toString());
           query.setParameter("urunKodu", urunKodu);
           demirbas= query.getResultList();
 
           tx.commit();
           session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       } 
        if(demirbas.isEmpty()) return null ; return demirbas.get(0);
     }
     public Demirbas demirbasiUrunAdinaGoreGetir(String urunAdi){
           Session session=null;
           List<Demirbas> demirbas = new ArrayList<>();
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select d from Demirbas d where d.urunAdi =:urunAdi");
           
           Query<Demirbas> query = session.createQuery(sb.toString());
           query.setParameter("urunAdi", urunAdi);
           demirbas= query.getResultList();
 
          tx.commit();
          session.close();
       } catch (Exception e) {
           
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       } 
        if(demirbas.isEmpty()) return null ; return demirbas.get(0);
     }
    
    public List<Calisan> butunPersonelleriGetir(){
        List<Calisan> calisanListesi = new ArrayList<>();
         Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select c from Calisan c");
           
           Query<Calisan> query = session.createQuery(sb.toString());
           calisanListesi =  query.getResultList();
 
           tx.commit();
           session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       } 
        
        return calisanListesi;
    }
    public Calisan personelGetirMailAdresineGore(String mail){
        List<Calisan> calisan = new ArrayList<>();
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select c from Calisan c where c.personelMail=:mail");
           
           Query<Calisan> query = session.createQuery(sb.toString());
           query.setParameter("mail", mail);
           calisan =  query.getResultList();
 
           tx.commit();
           session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       } 
        if(calisan.isEmpty()) return null ; return calisan.get(0);
    }
 
    
    public Calisan personelBulMaileGore(String mail){
        List<Calisan> calisan = new ArrayList<>();
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           StringBuilder sb = new StringBuilder();
           sb.append("Select c from Calisan c where c.personelMail =:mail");
           
           Query<Calisan> query = session.createQuery(sb.toString());
           query.setParameter("mail",mail);
           
           calisan = query.getResultList();
           
           tx.commit();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
        
      if(calisan.isEmpty()) return null ; return calisan.get(0);
    }
    
    public void personelKaydet(Calisan calisan){
         
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           
           session.save(calisan);
 
           tx.commit();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
        
    }
    public void demirbasGuncelle(Demirbas demirbas){
        Session session = null;
        Transaction tx = null;
        try{
            session = HibernateUtil.buildSessionFactory();
            tx = session.beginTransaction();
            session.update(demirbas.getTeslimAlan());
            session.flush();
            session.clear();
            session.update(demirbas.getTeslimEden());
            session.flush();
            session.clear();
            
           
            session.update(demirbas);
            
            
            tx.commit();
            session.close();
        }catch(Exception e)
        {
            e.printStackTrace();
            tx.rollback();
        }
    }
    
    
   
    
    public void demirbasKaydet(Demirbas demirbas){
         
        Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           session.saveOrUpdate(demirbas.getTeslimAlan());
           session.saveOrUpdate(demirbas.getTeslimEden());
           session.saveOrUpdate(demirbas);
 
           tx.commit();

        } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
        
    }
    public void demirbasSil(Demirbas  demirbas){
         Session session=null;
        try{           
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
           
           session.remove(demirbas);
 
          tx.commit();
          session.close();
       } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
           session.getTransaction().rollback();
       }
    }
      
    public Kullanici kullaniciVarmi(String kullaniciAdi, String parola, String mail){
       Kullanici kullanici = null;
        Session session=null;
        try{
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
            StringBuilder sb = new StringBuilder();
            sb.append("Select k from Kullanici k where k.kullaniciAci = :kullaniciAci and k.parola = :parola and k.mail = :mail");
           
            Query<Kullanici> query = session.createQuery(sb.toString());
            query.setParameter("kullaniciAdi",kullaniciAdi);
            query.setParameter("parola", parola);
            query.setParameter("mail",mail);
           
            kullanici =query.getSingleResult();
 
          tx.commit();
          session.close();
        } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
        }
        
        return kullanici;
  
    }
    
       public Kullanici loginKullaniciVarmi(String kullaniciAdi, String parola){
       Kullanici kullanici = null;
        Session session=null;
        try{
           session  = HibernateUtil.buildSessionFactory();
           Transaction tx = session.beginTransaction();
            StringBuilder sb = new StringBuilder();
            sb.append("Select k from Kullanici k where k.kullaniciAdi = :kullaniciAdi and k.parola = :parola");
           
            Query<Kullanici> query = session.createQuery(sb.toString());
            query.setParameter("kullaniciAdi",kullaniciAdi);
            query.setParameter("parola", parola);
           
            kullanici =query.getSingleResult();
 
          tx.commit();
          session.close();
        } catch (Exception e) {
           e.printStackTrace(); // hata olursa , hata mesajını ekrana yazdırır
        }
        
        return kullanici;
  
    }
}
