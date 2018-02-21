/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "leg_ricetta_ingrediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LegRicettaIngrediente.findAll", query = "SELECT l FROM LegRicettaIngrediente l")
    , @NamedQuery(name = "LegRicettaIngrediente.findByIdIngrediente", query = "SELECT l FROM LegRicettaIngrediente l WHERE l.legRicettaIngredientePK.idIngrediente = :idIngrediente")
    , @NamedQuery(name = "LegRicettaIngrediente.findByIdRicetta", query = "SELECT l FROM LegRicettaIngrediente l WHERE l.legRicettaIngredientePK.idRicetta = :idRicetta")
    , @NamedQuery(name = "LegRicettaIngrediente.findByQuantita", query = "SELECT l FROM LegRicettaIngrediente l WHERE l.quantita = :quantita")
    , @NamedQuery(name = "LegRicettaIngrediente.findByCodUnitaMisura", query = "SELECT l FROM LegRicettaIngrediente l WHERE l.codUnitaMisura = :codUnitaMisura")})
public class LegRicettaIngrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LegRicettaIngredientePK legRicettaIngredientePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantita")
    private Float quantita;
    @Size(max = 2)
    @Column(name = "cod_unita_misura")
    private String codUnitaMisura;
    @JoinColumn(name = "id_ingrediente", referencedColumnName = "id_ingrediente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ingrediente ingrediente;
    @JoinColumn(name = "id_ricetta", referencedColumnName = "id_ricetta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ricetta ricetta;

    public LegRicettaIngrediente() {
    }

    public LegRicettaIngrediente(LegRicettaIngredientePK legRicettaIngredientePK) {
        this.legRicettaIngredientePK = legRicettaIngredientePK;
    }

    public LegRicettaIngrediente(int idIngrediente, int idRicetta) {
        this.legRicettaIngredientePK = new LegRicettaIngredientePK(idIngrediente, idRicetta);
    }

    public LegRicettaIngredientePK getLegRicettaIngredientePK() {
        return legRicettaIngredientePK;
    }

    public void setLegRicettaIngredientePK(LegRicettaIngredientePK legRicettaIngredientePK) {
        this.legRicettaIngredientePK = legRicettaIngredientePK;
    }

    public Float getQuantita() {
        return quantita;
    }

    public void setQuantita(Float quantita) {
        this.quantita = quantita;
    }

    public String getCodUnitaMisura() {
        return codUnitaMisura;
    }

    public void setCodUnitaMisura(String codUnitaMisura) {
        this.codUnitaMisura = codUnitaMisura;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public void setRicetta(Ricetta ricetta) {
        this.ricetta = ricetta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (legRicettaIngredientePK != null ? legRicettaIngredientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LegRicettaIngrediente)) {
            return false;
        }
        LegRicettaIngrediente other = (LegRicettaIngrediente) object;
        if ((this.legRicettaIngredientePK == null && other.legRicettaIngredientePK != null) || (this.legRicettaIngredientePK != null && !this.legRicettaIngredientePK.equals(other.legRicettaIngredientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.LegRicettaIngrediente[ legRicettaIngredientePK=" + legRicettaIngredientePK + " ]";
    }
    
}
