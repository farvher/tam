/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.controllers;

import co.com.tam.dao.UsuariosDao;
import co.com.tam.dao.impl.UsuariosDaoImp;
import co.com.tam.domain.Usuarios;
import co.com.tam.dto.UsuariosDto;
import co.com.tam.util.Util;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author geotor
 */
@Controller
public class UsuariosController {
    
    @Autowired
    Util util;
    
    @Autowired
    UsuariosDao repo;

    
    @RequestMapping(value = {"/dashboard","/dashboard/"}, method = RequestMethod.GET)
    public ModelAndView dashboard(ModelAndView mv,@Valid UsuariosDto user , BindingResult binding) {
        mv.setViewName(Util.prop("view.dashboard"));
        

        return mv;
    }
    
    

}
