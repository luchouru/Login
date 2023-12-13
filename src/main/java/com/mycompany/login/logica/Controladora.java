package com.mycompany.login.logica;
import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = null;
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }
    
    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        
        List <Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario actual : listaUsuarios){
            if(actual.getNombreUsuario().equals(usuario)){
                if(actual.getContraseña().equals(contrasenia))
                    mensaje = "Usuario y contrasenia correcto. Bienvenido/a";
                else
                    mensaje = "Contrasenia incorrecta";
            }
            else
                mensaje = "Usuario no encontrado";
        }
        
        return mensaje;
        
    }
    
}
