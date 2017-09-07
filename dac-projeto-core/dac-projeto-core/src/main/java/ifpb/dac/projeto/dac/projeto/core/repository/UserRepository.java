/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.dac.projeto.core.repository;

import ifpb.dac.projeto.dac.projeto.shared.entity.User;
import ifpb.dac.projeto.dac.projeto.shared.interfaces.ServiceGereric;
import java.util.List;
import javax.annotation.PostConstruct;
import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserRepository;

/**
 *
 * @author jose2
 */
public class UserRepository implements InterfaceUserRepository {

    private ServiceGereric<User> repository;

    @PostConstruct
    public void init() {
        ServiceGereric<User> repository = new RepositoryGeneri<>();
    }

    @Override
    public void create(User entity) {
        repository.create(entity);
    }

    @Override
    public User upDate(User entity) {
        return repository.upDate(entity);
    }

    @Override
    public void remove(User entity) {
        repository.remove(entity);
    }

    @Override
    public User findByParameter(String parameterName, Object value, Class<User> tipo) {
        return repository.findByParameter(parameterName, value, tipo);
    }

    @Override
    public List<User> findAll(Class<User> tipo) {
        return repository.findAll(tipo);
    }

    @Override
    public User find(Class<User> tipo, Object key) {
        return repository.find(tipo, key);
    }

}
