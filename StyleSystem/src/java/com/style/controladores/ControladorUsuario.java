/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.style.controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
@Named(value = "controladorUsuario")
@SessionScoped
public class ControladorUsuario implements Serializable {

    /**
     * Creates a new instance of ControladorUsuario
     */
    public ControladorUsuario() {
    }
    
}
