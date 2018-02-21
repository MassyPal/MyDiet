/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ricetta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ricetta.findAll", query = "SELECT r FROM Ricetta r")
    , @NamedQuery(name = "Ricetta.findByIdRicetta", query = "SELECT r FROM Ricetta r WHERE r.idRicetta = :idRicetta")
    , @NamedQuery(name = "Ricetta.findByNome", query = "SELECT r FROM Ricetta r WHERE r.nome = :nome")
    , @NamedQuery(name = "Ricetta.findByNPersone", query = "SELECT r FROM Ricetta r WHERE r.nPersone = :nPersone")
    , @NamedQuery(name = "Ricetta.findByMinPreparazione", query = "SELECT r FROM Ricetta r WHERE r.minPreparazione = :minPreparazione")})
public class Ricetta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ricetta")
    private Integer idRicetta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @Column(name = "n_persone")
    private Integer nPersone;
    @Column(name = "min_preparazione")
    private Integer minPreparazione;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ricetta")
    private Collection<LegRicettaIngrediente> legRicettaIngredienteCollection;

    public Ricetta() {
    }

    public Ricetta(Integer idRicetta) {
        this.idRicetta = idRicetta;
    }

    public Ricetta(Integer idRicetta, String nome) {
        this.idRicetta = idRicetta;
        this.nome = nome;
    }

    public Integer getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(Integer idRicetta) {
        this.idRicetta = idRicetta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNPersone() {
        return nPersone;
    }

    public void setNPersone(Integer nPersone) {
        this.nPersone = nPersone;
    }

    public Integer getMinPreparazione() {
        return minPreparazione;
    }

    public void setMinPreparazione(Integer minPreparazione) {
        this.minPreparazione = minPreparazione;
    }

    @XmlTransient
    public Collection<LegRicettaIngrediente> getLegRicettaIngredienteCollection() {
        return legRicettaIngredienteCollection;
    }

    public void setLegRicettaIngredienteCollection(Collection<LegRicettaIngrediente> legRicettaIngredienteCollection) {
        this.legRicettaIngredienteCollection = legRicettaIngredienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRicetta != null ? idRicetta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ricetta)) {
            return false;
        }
        Ricetta other = (Ricetta) object;
        if ((this.idRicetta == null && other.idRicetta != null) || (this.idRicetta != null && !this.idRicetta.equals(other.idRicetta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ricetta[ idRicetta=" + idRicetta + " ]";
    }
    
}
