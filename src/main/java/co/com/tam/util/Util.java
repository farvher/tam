/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.util;

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

}
