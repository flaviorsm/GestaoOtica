package com.dws.otica.dao;

import com.dws.otica.model.domain.IUsuarioDAO;
import com.dws.otica.model.entity.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UsuarioDAOImpl implements IUsuarioDAO {

    private final Session session;
    private Transaction tx;

    public UsuarioDAOImpl(Session session) {
        this.session = session;
    }

    @Override
    public void saveOrUpdate(Usuario entity){
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }

    @Override
    public void deletar(Usuario entity) {
        try {
            tx = session.beginTransaction();
            session.delete(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }

    @Override
    public Usuario ObterPorId(int id) throws Exception {
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("idUsuario", id));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public List<Usuario> ObterLista() throws Exception {
        Criteria criteria = session.createCriteria(Usuario.class);
        return criteria.list();
    }

    @Override
    public Usuario ObterPorEmailSenha(String email, String senha) throws Exception {
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("email", email));
        criteria.add(Restrictions.eq("senha", senha));
        return (Usuario) criteria.uniqueResult();
    }

}
