/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.projeto.dac.projeto.shared.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jose2
 * @param <T>
 */
public interface ServiceGereric<T> extends Serializable {

    public void create(T entity);

    public T upDate(T entity);

    public void remove(T entity);

    public T find(Class<T> tipo,Object key);

    public T findByParameter(String parameterName, Object value, Class<T> tipo);

    public List<T> findAll(Class<T> tipo );
}
