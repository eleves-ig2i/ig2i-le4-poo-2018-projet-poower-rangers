/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poowerrangers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Rod
 */
public class Commande {
    private Map<Produit,Integer> produitCommande;
    private Map<Produit,Integer> produitRestant;
    private int Integer;
    private int nbColis;

    public Commande() {
        this.produitCommande = new HashMap<>();
        this.produitRestant = new HashMap<>();
    }

    public Commande(Map<Produit, Integer> produitCommande, Map<Produit, Integer> produitRestant, int Integer, int nbColis) {
        this();
        this.produitCommande = produitCommande;
        this.produitRestant = produitRestant;
        this.Integer = Integer;
        this.nbColis = nbColis;
    }

    public Map<Produit, Integer> getProduitCommande() {
        return produitCommande;
    }

    public Map<Produit, Integer> getProduitRestant() {
        return produitRestant;
    }

    public int getInteger() {
        return Integer;
    }

    public int getNbColis() {
        return nbColis;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commande other = (Commande) obj;
        if (this.Integer != other.Integer) {
            return false;
        }
        if (this.nbColis != other.nbColis) {
            return false;
        }
        if (!Objects.equals(this.produitCommande, other.produitCommande)) {
            return false;
        }
        if (!Objects.equals(this.produitRestant, other.produitRestant)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "produitCommande=" + produitCommande + ", produitRestant=" + produitRestant + ", Integer=" + Integer + ", nbColis=" + nbColis + '}';
    }
    
}
