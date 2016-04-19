/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.controllers;

import co.com.tam.dao.impl.UsuariosDaoImp;
import co.com.tam.domain.Usuarios;
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
public class HomeController extends BaseController{
    
    
    @Autowired
    UsuariosDaoImp repo ;
    
    @RequestMapping(value = {"/",""})
    public ModelAndView home(ModelAndView mv ){
        mv.setViewName("home/index");
        List <Usuarios> users = repo.findAll();
        System.out.println("encontrados "+ users.size());
        
        return mv;
    
    }
    
}
