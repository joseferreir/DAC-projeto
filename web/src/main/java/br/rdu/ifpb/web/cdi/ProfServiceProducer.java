/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rdu.ifpb.web.cdi;


import ifpb.dac.projeto.shared.service.ProfService;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author jose2
 */

@ApplicationScoped
public class ProfServiceProducer {
    
    
//    java:global/rhecruta-core/UserServiceImpl!br.edu.ifpb.dac.rhecruta.shared.interfaces.UserService, java:global/rhecruta-core/UserServiceImpl
    private static final String RESOURCE = "java:global/core/ProfServiceImpl!ifpb.dac.projeto.shared.service.ProfService";
     
    
    @Dependent
    @Produces
    @Default
    private ProfService getProfService() {
        return new ServiceLocator().lookup(RESOURCE, ProfService.class);
    }
}
