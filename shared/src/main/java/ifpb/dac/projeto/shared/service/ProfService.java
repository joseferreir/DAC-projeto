/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.shared.service;

import ifpb.dac.projeto.shared.entity.Professor;
import java.io.Serializable;

/**
 *
 * @author jose2
 */
public interface ProfService extends Serializable {

    public void save(Professor professor);

    public Professor search(int key);

}
