package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Formulario;
import util.Conexao;

/**
 *
 * @author luiss
 */
public class FormularioDAO implements IFormularioDAO {

    @Override
    public void salvarFormulario(Formulario formulario) {
        try {
            Connection con = new Conexao().conectar();
            String sql = "insert into formulario(confirmou_identidade, sitio_demarcado"
                    + " verificacao_equipamento_anest_med, oximetro_funcionando, alergia_conhecida, "
                    + "complicacao_via_aerea, risco_perda_sanguinea, membros_se_apresentaram, "
                    + "confirmar_nome_procedimento_local, profilaxia_antibiotica, cirurgiao_etapas_criticas, "
                    + "duracao_operacao	, quantidade_perda_sanguinea_prevista, anestesiologista_preocupacao_especifica, "
                    + "esterilizacao_confirmada	, preocupacao_equipamentos, imagens_essenciais_visiveis	, "
                    + "nome_procedimento, conclusao_contagem_instrumentos, identificacao_amostras, "
                    + "ha_problemas_equipamentos, principais_preocupacoes_recup_manejo_paciente	) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, formulario.getConfirmouIdentidade());
            ps.setString(2, formulario.getSitioDemarcado());
            ps.setString(3, formulario.getVerificacaoEquipamentoAnestEMed());
            ps.setString(4, formulario.getOximetroFuncionando());
            ps.setString(5, formulario.getAlergiaConhecida());
            ps.setString(6, formulario.getComplicacaoViaAerea());
            ps.setString(7, formulario.getRiscoPerdaSanguinea());
            ps.setString(8, formulario.getMembrosSeAPresentaram());
            ps.setString(9, formulario.getConfirmouNomeProcedimentoELocal());
            ps.setString(10, formulario.getProfilaxiaAntibiotica());
            ps.setString(11, formulario.getEtapasCriticas());
            ps.setString(12, formulario.getDuracaoOperacao());
            ps.setString(13, formulario.getPerdaSanguineaPrevista());
            ps.setString(14, formulario.getPreocupacaoEspecificaAnestesiologista());
            ps.setString(15, formulario.getEsterilizacaoConfirmada());
            ps.setString(16, formulario.getPreocupacaoEquipamentos());
            ps.setString(17, formulario.getImagensEssenciaisVisiveis());
            ps.setString(18, formulario.getConfirmouNomeProcedimento());
            ps.setString(19, formulario.getConclusaoContagemEquipamentos());
            ps.setString(20, formulario.getIdentificacaoAmostras());
            ps.setString(21, formulario.getHaProblemasEquipamentos());
            ps.setString(22, formulario.getPrincipaisPreocupacoesRecuperacaoEManejoPaciente());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                formulario.setId(id);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Formulario> buscarFormularios() {
        List<Formulario> formularios = new ArrayList<>();
        try {
            Connection con = new Conexao().conectar();
            String sql = "select id, confirmou_identidade, sitio_demarcado"
                    + " verificacao_equipamento_anest_med, oximetro_funcionando, alergia_conhecida, "
                    + "complicacao_via_aerea, risco_perda_sanguinea, membros_se_apresentaram, "
                    + "confirmar_nome_procedimento_local, profilaxia_antibiotica, cirurgiao_etapas_criticas, "
                    + "duracao_operacao	, quantidade_perda_sanguinea_prevista, anestesiologista_preocupacao_especifica, "
                    + "esterilizacao_confirmada	, preocupacao_equipamentos, imagens_essenciais_visiveis	, "
                    + "nome_procedimento, conclusao_contagem_instrumentos, identificacao_amostras, "
                    + "ha_problemas_equipamentos, principais_preocupacoes_recup_manejo_paciente from formulario";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String confirmouIdentidade = rs.getString(2);
                String sitioDemarcado = rs.getString(3);
                String verificacaoEquipamentoAnestMed = rs.getString(4);
                String oximetroFuncionando = rs.getString(5);
                String alergiaConhecida = rs.getString(6);
                String complicacaoViaAerea = rs.getString(7);
                String riscoPerdaSanguinea = rs.getString(8);
                String membrosSeApresentaram = rs.getString(9);
                String confirmarNomeProcedimentoLocal = rs.getString(10);
                String profilaxiaAntibiotica = rs.getString(11);
                String etapasCriticas = rs.getString(12);
                String duracaoOperacao = rs.getString(13);
                String perdaSanguineaPrevista = rs.getString(14);
                String preocupacaoEspecifica = rs.getString(15);
                String esterilizacaoConfirmada = rs.getString(16);
                String preocupacaoEquipamentos = rs.getString(17);
                String imagensEssenciaisVisiveis = rs.getString(18);
                String nomeProcedimento = rs.getString(19);
                String conclusaoContagemInstrumentos = rs.getString(20);
                String identificacaoAmostras = rs.getString(21);
                String haProblemasEquipamentos = rs.getString(22);
                String principaisPreocupacoesManejoPaciente = rs.getString(23);
                
                Formulario formulario = new Formulario(id, confirmouIdentidade, sitioDemarcado, 
                        verificacaoEquipamentoAnestMed, oximetroFuncionando, alergiaConhecida, 
                        complicacaoViaAerea, riscoPerdaSanguinea, membrosSeApresentaram, 
                        confirmarNomeProcedimentoLocal, profilaxiaAntibiotica, etapasCriticas,
                        duracaoOperacao, perdaSanguineaPrevista, preocupacaoEspecifica, 
                        esterilizacaoConfirmada, preocupacaoEquipamentos, imagensEssenciaisVisiveis,
                        nomeProcedimento, conclusaoContagemInstrumentos, identificacaoAmostras,
                        haProblemasEquipamentos, principaisPreocupacoesManejoPaciente);
                
                formularios.add(formulario);
                
                
            }
            rs.close();
            ps.close();
            con.close();
            return formularios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return formularios;

    }

}
