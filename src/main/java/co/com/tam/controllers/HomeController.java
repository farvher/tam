/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.controllers;

import co.com.tam.dao.UsuariosDao;
import co.com.tam.domain.Usuarios;
import co.com.tam.util.Util;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author geotor
 */
@Controller
public class HomeController extends BaseController {

    @Autowired
    UsuariosDao repo;

    @RequestMapping(value = {"/", ""})
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName(Util.prop("view.home"));
        List<Usuarios> users = repo.getUsuarios();
        System.out.println("encontrados " + users.size());

        return mv;

    }
   @RequestMapping(value = {"/login", "/login/"})
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName(Util.prop("view.login"));
        return mv;
    }

}
