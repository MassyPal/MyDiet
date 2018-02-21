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
@Table(name = "ingrediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingrediente.findAll", query = "SELECT i FROM Ingrediente i")
    , @NamedQuery(name = "Ingrediente.findByIdIngrediente", query = "SELECT i FROM Ingrediente i WHERE i.idIngrediente = :idIngrediente")
    , @NamedQuery(name = "Ingrediente.findByNome", query = "SELECT i FROM Ingrediente i WHERE i.nome = :nome")
    , @NamedQuery(name = "Ingrediente.findByCodUnitaMisura", query = "SELECT i FROM Ingrediente i WHERE i.codUnitaMisura = :codUnitaMisura")})
public class Ingrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ingrediente")
    private Integer idIngrediente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @Size(max = 2)
    @Column(name = "cod_unita_misura")
    private String codUnitaMisura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingrediente")
    private Collection<LegRicettaIngrediente> legRicettaIngredienteCollection;

    public Ingrediente() {
    }

    public Ingrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public Ingrediente(Integer idIngrediente, String nome) {
        this.idIngrediente = idIngrediente;
        this.nome = nome;
    }

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodUnitaMisura() {
        return codUnitaMisura;
    }

    public void setCodUnitaMisura(String codUnitaMisura) {
        this.codUnitaMisura = codUnitaMisura;
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
        hash += (idIngrediente != null ? idIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingrediente)) {
            return false;
        }
        Ingrediente other = (Ingrediente) object;
        if ((this.idIngrediente == null && other.idIngrediente != null) || (this.idIngrediente != null && !this.idIngrediente.equals(other.idIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ingrediente[ idIngrediente=" + idIngrediente + " ]";
    }
    
}
