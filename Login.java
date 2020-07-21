
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRISTINA CALLE Anota{ciones sirven para comunicar con el xhtml
 */
@ManagedBean(name="login")
@RequestScoped
 //sirve para comunicarme mientras el navegador esta abierto 
public class Login implements Serializable{
    private String usuario;
    private String contraseña;

    public String getUsuario() {
        System.out.println("usuario");
        return usuario;
        
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void ingresar(){
        FacesMessage message;
        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
           
          FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "Datos ingresados correctamente") );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
        }
        else{
            FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Invalied",  "Your message: " + "Datos ingresados erroneos") );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));    
        }
    }
    
}
