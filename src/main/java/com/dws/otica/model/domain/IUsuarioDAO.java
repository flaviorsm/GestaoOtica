package com.dws.otica.model.domain;

import com.dws.otica.model.entity.Usuario;

/**
 *
 * @author Flavio
 */
public interface IUsuarioDAO extends ICRUDBasico<Usuario>{
    
    Usuario ObterPorEmailSenha(String email, String senha) throws Exception;
}
