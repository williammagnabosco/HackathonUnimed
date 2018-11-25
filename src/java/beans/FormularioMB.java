package beans;

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
    
    

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
    
    

}
