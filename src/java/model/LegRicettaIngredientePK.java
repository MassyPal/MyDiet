/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author User
 */
@Embeddable
public class LegRicettaIngredientePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ingrediente")
    private int idIngrediente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ricetta")
    private int idRicetta;

    public LegRicettaIngredientePK() {
    }

    public LegRicettaIngredientePK(int idIngrediente, int idRicetta) {
        this.idIngrediente = idIngrediente;
        this.idRicetta = idRicetta;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(int idRicetta) {
        this.idRicetta = idRicetta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idIngrediente;
        hash += (int) idRicetta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LegRicettaIngredientePK)) {
            return false;
        }
        LegRicettaIngredientePK other = (LegRicettaIngredientePK) object;
        if (this.idIngrediente != other.idIngrediente) {
            return false;
        }
        if (this.idRicetta != other.idRicetta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.LegRicettaIngredientePK[ idIngrediente=" + idIngrediente + ", idRicetta=" + idRicetta + " ]";
    }
    
}
