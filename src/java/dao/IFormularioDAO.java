/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Formulario;

/**
 *
 * @author luiss
 */
public interface IFormularioDAO {
    
    public void salvarFormulario(Formulario formulario);
    
    public List<Formulario> buscarFormularios();
    
}
