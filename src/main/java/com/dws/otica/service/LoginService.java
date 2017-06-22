package com.dws.otica.service;

import com.dws.otica.dao.UsuarioDAOImpl;
import com.dws.otica.model.entity.Usuario;
import com.dws.otica.model.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class LoginService {
    
    public static Boolean isValueLogin(Usuario entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UsuarioDAOImpl dao = new UsuarioDAOImpl(session);
        Usuario usuario = dao.ObterPorEmailSenha(entity.getEmail(), entity.getSenha());
        return usuario != null;
    }
}
