package ifpb.dac.projeto.dac.projeto.web.controller;




import ifpb.dac.projeto.dac.projeto.shared.entity.User;
import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose2
 */
@RequestScoped
@Named
public class Controller {
    @Inject
    InterfaceUserservice service;
    private User user = new User();
   
    public String salvar(){
        System.err.println("controlle "+user);
        
        service.create(user);
        return null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
