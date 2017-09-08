/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.dac.projeto.core.service;

import ifpb.dac.projeto.dac.projeto.core.repository.UserRepository;
import ifpb.dac.projeto.dac.projeto.shared.entity.User;
import java.util.List;
import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserRepository;
import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author jose2
 */
@Stateless
@Remote(InterfaceUserservice.class)
public class UserSevice implements InterfaceUserservice {

    InterfaceUserRepository repository;

    public UserSevice() {
        this.repository = new UserRepository();
    }

   

    @Override
    public void create(User user) {
        repository.create(user);
    }

    @Override
    public User upDate(User user) {
        return repository.upDate(user);
    }

    @Override
    public void remove(User user) {
        repository.remove(user);
    }

    @Override
    public User find(int key) {
        return repository.find(User.class, key);
    }

    @Override
    public User findByName(String Name) {
      return repository.findByParameter("nome", Name, User.class);
    }

    @Override
    public List<User> findAll() {
       return repository.findAll(User.class);
    }

}
