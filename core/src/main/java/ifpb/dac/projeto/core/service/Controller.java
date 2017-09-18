/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.core.service;

import ifpb.dac.projeto.shared.entity.Professor;
import ifpb.dac.projeto.shared.service.ProfService;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jose2
 */
@Named
@RequestScoped
public class Controller {
    @EJB
    private ProfService ps;
    private Professor professor;

    public Controller() {
        professor = new Professor();
    }
    
    public String add(){
        try {
          ps.save(professor);
          professor = new Professor();
        } catch (Exception e) {
            System.err.println("erro "+e.getMessage());
        }
        return null;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}
