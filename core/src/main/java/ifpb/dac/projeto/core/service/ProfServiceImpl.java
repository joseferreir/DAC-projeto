/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.core.service;

import ifpb.dac.projeto.core.repsitory.ProfessorRepositorio;
import ifpb.dac.projeto.shared.entity.Professor;
import ifpb.dac.projeto.shared.service.ProfService;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author jose2
 */
@Stateless
@Remote(ProfService.class)
public class ProfServiceImpl implements ProfService{
    @EJB
    private ProfessorRepositorio repositorio;

    @Override
    public void save(Professor professor) {
       repositorio.create(professor);
    }

    @Override
    public Professor search(int key) {
      return repositorio.find(key, Professor.class);
    }
    
}
