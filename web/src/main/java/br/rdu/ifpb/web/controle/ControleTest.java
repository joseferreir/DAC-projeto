/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rdu.ifpb.web.controle;




import ifpb.dac.projeto.shared.entity.Professor;
import ifpb.dac.projeto.shared.service.ProfService;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import util.Mensagem;



/**
 *
 * @author jose2
 */
@Named
@SessionScoped
public class ControleTest implements Serializable{
    @Inject
    private ProfService usuarioService;
    @Inject
    private Mensagem mensagem;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String add(){
       
        try {
            Professor p = new Professor(nome);
            
       usuarioService.save(p);
            
       mensagem.addMessage(null, "certo");
        } catch (Exception e) {
            mensagem.addMessage(null, "erro"+e.getMessage());
        }
       
       return null;
    
    
}
}
