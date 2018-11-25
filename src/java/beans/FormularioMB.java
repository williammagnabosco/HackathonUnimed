package beans;

import dao.FormularioDAO;
import dao.IFormularioDAO;
import javax.faces.bean.ManagedBean;
import modelo.Formulario;

/**
 *
 * @author luiss
 */

@ManagedBean
public class FormularioMB {
    
    private Formulario formulario;

    public FormularioMB() {
        formulario = new Formulario();
    }
    
    public String salvar(){
        System.out.println("a");
        System.out.println(formulario.getComplicacaoViaAerea());
        System.out.println("b");
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
