/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import java.io.*;
import java.util.*;

/**
 *
 * @author am_ri
 */
@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private int qtd_participantes;
    private Date data_evento;
    private String status_evento;
    // tipo de evento, local como pk e organizador(partindo de usuario)
    
    public Evento (int id, String nome,int qtd_participantes, Date data_evento, String status_evento ){
       this.id = id;
       this.nome = nome;
       this.qtd_participantes = qtd_participantes;
       this.data_evento = data_evento;
       this.status_evento = status_evento;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQtd_participante() {
        return qtd_participante;
    }

    public void setQtd_participante(int qtd_participante) {
        this.qtd_participante = qtd_participante;
    }
    
    public Date getData_evento() {
        return data_evento;
    }

    public void setData_evento(Date data_evento) {
        this.data_evento = data_evento;
    }
     
    public String getStatus_evento() {
        return status_evento;
    }

    public void setStatus_evento(String status_evento) {
        this.status_evento = status_evento;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.Evento[ id=" + id + " ]";
    }
    
}
