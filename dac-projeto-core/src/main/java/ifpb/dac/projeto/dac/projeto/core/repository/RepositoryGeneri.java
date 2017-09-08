/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.dac.projeto.core.repository;

import ifpb.dac.projeto.dac.projeto.shared.interfaces.ServiceGereric;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;

/**
 *
 * @author jose2
 */
public class RepositoryGeneri<T> implements ServiceGereric<T> {

    @PersistenceContext(unitName = "projeto_dac-projeto-core_PU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em ;

    @Override
    public void create(T entity) {
        System.err.println("repositori "+entity);
        em.persist(entity);
    }

    @Override
    public T upDate(T entity) {
        return em.merge(entity);
    }

    @Override
    public void remove(T entity) {
        remove(entity);
    }

    @Override
    public T find(Class<T> tipo, Object key) {
        return em.find(tipo, key);
    }

    @Override
    public T findByParameter(String parameterName, Object value, Class<T> tipo) {
        StringBuilder jpql = new StringBuilder("SELECT u FROM WHERE u.");
        jpql.append(parameterName);
        jpql.append("= :");
        jpql.append(parameterName);
        TypedQuery<T> query = em.createQuery(jpql.toString(), tipo);
        query.setParameter(parameterName, value);
        return query.getSingleResult();
    }

    @Override
    public List<T> findAll(Class<T> tipo ) {
        StringBuilder jpql = new StringBuilder("SELECT u FROM  u");
        
        TypedQuery<T> query = em.createQuery(jpql.toString(), tipo);
        List<T> result = query.getResultList();
        if (!result.isEmpty()) {
            return result;
        }
        return Collections.EMPTY_LIST;
    }

}
