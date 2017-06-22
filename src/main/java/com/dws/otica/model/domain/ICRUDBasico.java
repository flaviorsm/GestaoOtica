package com.dws.otica.model.domain;

import java.util.List;

/**
 *
 * @author Flavio
 * @param <T>
 */
public interface ICRUDBasico<T> {

    void saveOrUpdate(T entity) throws Exception;

    void deletar(T entity) throws Exception;    

    T ObterPorId(int id) throws Exception;

    List<T> ObterLista() throws Exception;
}
