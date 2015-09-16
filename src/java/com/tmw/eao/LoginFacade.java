/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmw.eao;

import com.tmw.login.entity.Login;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Μάχη
 */
@Stateless
public class LoginFacade extends AbstractFacade<Login> implements LoginFacadeLocal {
    @PersistenceContext(unitName = "TMWProjectPU")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    public LoginFacade() {
        super(Login.class);
    }

    
    
    
    
}
