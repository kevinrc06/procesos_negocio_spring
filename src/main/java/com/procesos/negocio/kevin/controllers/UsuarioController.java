package com.procesos.negocio.kevin.controllers;

import com.procesos.negocio.kevin.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UsuarioController {


    @GetMapping(value = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("kevin");
        usuario.setApellidos("rivera");
        usuario.setDocumento("1003259417");
        usuario.setDireccion("mmmm");
        usuario.setFechaNacimiento(new Date(2003,06,25));
        usuario.setTelefono("3016818071");
        return usuario;


    }
}
