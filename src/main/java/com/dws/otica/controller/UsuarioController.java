package com.dws.otica.controller;

import com.dws.otica.model.domain.IMasterPage;
import com.dws.otica.model.entity.Usuario;
import com.dws.otica.service.UsuarioService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Flavio
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController implements IMasterPage {
    
    @Override
    public String InicioControl(Model model) throws Exception {
        model.addAttribute("usuario", new Usuario());
        return "redirect:/principal";
    }

    @Override
    public String LogoutControl(HttpServletRequest request) throws Exception {        
        return "redirect:/index";
    }
    
    @Override
    public String GerenciaControl(Model model) throws Exception {
        model.addAttribute("page", "usuario/gerenciar");
        model.addAttribute("title", "Gerenciar Usuários");
        return "master";
    }

    @Override
    public String ConsultaControl(Model model) throws Exception {
        List<Usuario> list = UsuarioService.ObterListaUsuario();
        model.addAttribute("usuarios", list);
        model.addAttribute("page", "usuario/consultar");
        model.addAttribute("title", "Consulta");
        return "master";
    }

    @Override
    public String CadastroNovoControl(Model model) throws Exception {
        model.addAttribute("page", "usuario/cadastrar");
        model.addAttribute("title", "Cadastrar usuário");
        model.addAttribute("hiddenId", "hidden");
        return "master";
    }

    @RequestMapping("/{id}")
    public String EditarControl(Model model, @PathVariable int id) throws Exception {
        Usuario user = UsuarioService.ObterUsarioPorId(id);
        model.addAttribute("page", "usuario/cadastrar");
        model.addAttribute("title", "Editar usuário");
        model.addAttribute("checked", user.getAtivo() == 'S' ? "checked" : "");
        model.addAttribute("user", user);
        return "master";
    }

    @RequestMapping("/save")
    public String CadastrarControl(@ModelAttribute("usuario") Usuario entity) throws Exception {
        if(entity.getIdUsuario() != null){
            Usuario u = UsuarioService.ObterUsarioPorId(entity.getIdUsuario());
            entity.setCriadoEm(u.getCriadoEm());
        }        
        UsuarioService.saveOrUpdate(entity);
        return "redirect:consultar";
    }

    @RequestMapping("/excluir/{id}")
    public String ExcluirControl(@PathVariable int id) throws Exception {
        Usuario user = UsuarioService.ObterUsarioPorId(id);
        UsuarioService.delete(user);
        return "redirect:/usuario/consultar";
    }
}
