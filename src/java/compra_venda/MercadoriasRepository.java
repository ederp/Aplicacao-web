/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_venda;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author AnaPaula
 */
public class MercadoriasRepository {
    private EntityManager manager;

    public MercadoriasRepository(EntityManager manager) {
        this.manager = manager;
    }

    public void adiciona(Mercadoria mercadoria){
        this.manager.persist(mercadoria);
    }
    
    public Mercadoria busca(Long id){
        return this.manager.find(Mercadoria.class, id);
    }
    
    public List<Mercadoria> buscaTodas(){
        Query query = this.manager.createQuery("SELECT e FROM Mercadoria e");
        return query.getResultList();
    }
}
