package beans;

import dao.FormularioDAO;
import dao.IFormularioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Formulario;

/**
 *
 * @author luiss
 */

@ManagedBean
@SessionScoped
public class FormularioMB {
    
    private Formulario formulario;

    public FormularioMB() {
        formulario = new Formulario();
    }
    
    public String salvar(){
        
        IFormularioDAO formularioDAO = new FormularioDAO();
        formularioDAO.salvarFormulario(formulario);
        return "index";
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
    
    

}
