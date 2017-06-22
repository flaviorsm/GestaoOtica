package com.dws.otica.controller;

import com.dws.otica.model.entity.Usuario;
import com.dws.otica.service.LoginService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Flavio
 */
@Controller
@RequestMapping("/")
public class OticaController {

    @RequestMapping("/index")
    public String Login(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }

    @RequestMapping("/logar")
    public String efetuarLogin(HttpSession session, Model model, @ModelAttribute("usuario") Usuario userLogin) throws Exception {
        if (LoginService.isValueLogin(userLogin)) {  
            session.setAttribute("usuarioLogado", userLogin);
            return "redirect:principal";
        } else {
            model.addAttribute("error", "Email ou senha inválidos!");
            return "login";
        }
    }
    
    @RequestMapping("/inicio")
    public String Inicio(Model model){                
        return "redirect:principal";
    }
    
    @RequestMapping("/principal")
    public String Principal(Model model) throws Exception{         
        model.addAttribute("title", "Gestão de Negócio");
        model.addAttribute("page", "principal");
        return "master";
    }
    
    //Gerenciar usuário
    @RequestMapping("/gerenciar")
    public String Gerenciar(Model model) throws Exception{
        return "redirect:usuario/gerenciar";
    }   
    
    @RequestMapping("/logout")
    public String Logout(){
        return "redirect:/index";
    }   
}
