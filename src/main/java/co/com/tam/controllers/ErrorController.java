/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author geotor
 */
@Controller
public class ErrorController extends BaseController {

    
    @RequestMapping(value="/403")
    public ModelAndView error403(ModelAndView mv) {

        mv.setViewName("error/403");
        return mv;
    }
}
