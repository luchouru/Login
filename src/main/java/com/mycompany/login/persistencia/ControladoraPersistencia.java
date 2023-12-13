package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController jpaController = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return jpaController.findUsuarioEntities();
    }
    
}
