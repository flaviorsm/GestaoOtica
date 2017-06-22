package com.dws.otica.service;

import com.dws.otica.dao.UsuarioDAOImpl;
import com.dws.otica.model.entity.Usuario;
import com.dws.otica.model.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;

/**
 *
 * @author Flavio
 */
public class UsuarioService {

    @PersistenceContext
    private static UsuarioDAOImpl dao;

    public static void saveOrUpdate(Usuario user) throws Exception {
        try {
            dao = new UsuarioDAOImpl(GetSessionOpen());
            Date date = new Date();
            if (user.getIdUsuario() == null) {                
                user.setCriadoEm(date);
            }            
            if (user.getAtivo() == null) {
                user.setDtAtivacao(null);
                user.setAtivo('N');
            } else {
                user.setDtAtivacao(date);
            }
            dao.saveOrUpdate(user);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void delete(Usuario user) throws Exception {
        dao = new UsuarioDAOImpl(GetSessionOpen());
        dao.deletar(user);
    }

    public static List<Usuario> ObterListaUsuario() throws Exception {
        dao = new UsuarioDAOImpl(GetSessionOpen());
        return dao.ObterLista();
    }

    public static Usuario ObterUsarioPorId(int id) throws Exception {
        dao = new UsuarioDAOImpl(GetSessionOpen());
        return dao.ObterPorId(id);
    }

    private static Session GetSessionOpen() {
        return HibernateUtil.getSessionFactory().openSession();
    }
}
