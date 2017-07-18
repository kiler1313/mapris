/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.dao;

import com.mapris.modelo.entitie.TgRolUsuarioAfterUpdate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ruben
 */
@Stateless
public class TgRolUsuarioAfterUpdateFacade extends AbstractFacade<TgRolUsuarioAfterUpdate> implements TgRolUsuarioAfterUpdateFacadeLocal {

    @PersistenceContext(unitName = "maprisPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TgRolUsuarioAfterUpdateFacade() {
        super(TgRolUsuarioAfterUpdate.class);
    }
    
}