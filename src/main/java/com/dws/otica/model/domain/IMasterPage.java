/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.otica.model.domain;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Flavio
 */
public interface IMasterPage {
    
    @RequestMapping("/inicio")
    String InicioControl(Model model) throws Exception;
    
    @RequestMapping("/logout")
    String LogoutControl(HttpServletRequest request) throws Exception;
    
    @RequestMapping("/gerenciar")
    String GerenciaControl(Model model) throws Exception;
    
    @RequestMapping("/consultar")
    String ConsultaControl(Model model) throws Exception;
    
    @RequestMapping("/cadastrar")
    String CadastroNovoControl(Model model) throws Exception;
}
