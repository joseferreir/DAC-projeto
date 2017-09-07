/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.dac.projeto.shared.interfaces;

import ifpb.dac.projeto.dac.projeto.shared.entity.User;
import java.util.List;

/**
 *
 * @author jose2
 */
public interface InterfaceUserservice {
    public void create(User user);

    public User upDate(User user);

    public void remove(User user);

    public User find(int key);

    public User findByName(String Name);

    public List<User> findAll();
}
