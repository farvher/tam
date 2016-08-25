/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 *
 * @author geotor
 */
@Component
public class Util {

    public void DtoToDomain(Object src, Object target) {
        BeanUtils.copyProperties(src, target);
    }

    public static String prop(String llave, Object... params) {
        String propiedad = null;
        ResourceBundle r = ResourceBundle.getBundle("bundle");
        propiedad = r.getString(llave);
        propiedad = MessageFormat.format(propiedad, params);
        return propiedad;
    }

    public static String prop(String llave) {
        String propiedad = null;
        ResourceBundle r = ResourceBundle.getBundle("bundle");
        propiedad = r.getString(llave);
        return propiedad;
    }

}
