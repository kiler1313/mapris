/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facade;

import com.mapris.modelo.entities.Sesion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SMEGS
 */
@Stateless
public class SesionFacade extends AbstractFacade<Sesion> {

    @PersistenceContext(unitName = "maprisPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SesionFacade() {
        super(Sesion.class);
    }
    
}