/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_venda;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 *
 * @author AnaPaula
 */

@Entity
public class Mercadoria implements Serializable{
    //classe de definição da tabela de mercadorias
    @Id @GeneratedValue
    private Long cod_merc;
    private String tipo_merc;
    private String nome_merc;
    private int qtde;
    private double preco;
    private String tipo_negocio;

    public Long getCod_merc() {
        return cod_merc;
    }

    public void setCod_merc(Long cod_merc) {
        this.cod_merc = cod_merc;
    }

    public String getTipo_merc() {
        return tipo_merc;
    }

    public void setTipo_merc(String tipo_merc) {
        this.tipo_merc = tipo_merc;
    }

    public String getNome_merc() {
        return nome_merc;
    }

    public void setNome_merc(String nome_merc) {
        this.nome_merc = nome_merc;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo_negocio() {
        return tipo_negocio;
    }

    public void setTipo_negocio(String tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }
    
    
}
