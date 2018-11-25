package modelo;

/**
 *
 * @author luiss
 */
public class Formulario {
    
    private int id;
    private String confirmouIdentidade;
    private String sitioDemarcado;
    private String verificacaoEquipamentoAnestEMed;
    private String oximetroFuncionando;
    private String alergiaConhecida;
    private String complicacaoViaAerea;
    private String riscoPerdaSanguinea;
    private String membrosSeAPresentaram;
    private String confirmouNomeProcedimentoELocal;
    private String profilaxiaAntibiotica;
    private String etapasCriticas;
    private String duracaoOperacao;
    private String perdaSanguineaPrevista;
    private String preocupacaoEspecificaAnestesiologista;
    private String esterilizacaoConfirmada;
    private String preocupacaoEquipamentos;
    private String imagensEssenciaisVisiveis;
    private String confirmouNomeProcedimento;
    private String conclusaoContagemEquipamentos;
    private String identificacaoAmostras;
    private String haProblemasEquipamentos;
    private String principaisPreocupacoesRecuperacaoEManejoPaciente;

    public Formulario() {
        this.id = 0;
        this.confirmouIdentidade = "";
        this.sitioDemarcado = "";
        this.verificacaoEquipamentoAnestEMed = "";
        this.oximetroFuncionando = "";
        this.alergiaConhecida = "";
        this.complicacaoViaAerea = "";
        this.riscoPerdaSanguinea = "";
        this.membrosSeAPresentaram = "";
        this.confirmouNomeProcedimentoELocal = "";
        this.profilaxiaAntibiotica = "";
        this.etapasCriticas = "";
        this.duracaoOperacao = "";
        this.perdaSanguineaPrevista = "";
        this.preocupacaoEspecificaAnestesiologista = "";
        this.esterilizacaoConfirmada = "";
        this.preocupacaoEquipamentos = "";
        this.imagensEssenciaisVisiveis = "";
        this.confirmouNomeProcedimento = "";
        this.conclusaoContagemEquipamentos = "";
        this.identificacaoAmostras = "";
        this.haProblemasEquipamentos = "";
        this.principaisPreocupacoesRecuperacaoEManejoPaciente = "";
    }

    public Formulario(int id, String confirmouIdentidade, String sitioDemarcado, String verificacaoEquipamentoAnestEMed, String oximetroFuncionando, String alergiaConhecida, String complicacaoViaAerea, String riscoPerdaSanguinea, String membrosSeAPresentaram, String confirmouNomeProcedimentoELocal, String profilaxiaAntibiotica, String etapasCriticas, String duracaoOperacao, String perdaSanguineaPrevista, String preocupacaoEspecificaAnestesiologista, String esterilizacaoConfirmada, String preocupacaoEquipamentos, String imagensEssenciaisVisiveis, String confirmouNomeProcedimento, String conclusaoContagemEquipamentos, String identificacaoAmostras, String haProblemasEquipamentos, String principaisPreocupacoesRecuperacaoEManejoPaciente) {
        this.id = id;
        this.confirmouIdentidade = confirmouIdentidade;
        this.sitioDemarcado = sitioDemarcado;
        this.verificacaoEquipamentoAnestEMed = verificacaoEquipamentoAnestEMed;
        this.oximetroFuncionando = oximetroFuncionando;
        this.alergiaConhecida = alergiaConhecida;
        this.complicacaoViaAerea = complicacaoViaAerea;
        this.riscoPerdaSanguinea = riscoPerdaSanguinea;
        this.membrosSeAPresentaram = membrosSeAPresentaram;
        this.confirmouNomeProcedimentoELocal = confirmouNomeProcedimentoELocal;
        this.profilaxiaAntibiotica = profilaxiaAntibiotica;
        this.etapasCriticas = etapasCriticas;
        this.duracaoOperacao = duracaoOperacao;
        this.perdaSanguineaPrevista = perdaSanguineaPrevista;
        this.preocupacaoEspecificaAnestesiologista = preocupacaoEspecificaAnestesiologista;
        this.esterilizacaoConfirmada = esterilizacaoConfirmada;
        this.preocupacaoEquipamentos = preocupacaoEquipamentos;
        this.imagensEssenciaisVisiveis = imagensEssenciaisVisiveis;
        this.confirmouNomeProcedimento = confirmouNomeProcedimento;
        this.conclusaoContagemEquipamentos = conclusaoContagemEquipamentos;
        this.identificacaoAmostras = identificacaoAmostras;
        this.haProblemasEquipamentos = haProblemasEquipamentos;
        this.principaisPreocupacoesRecuperacaoEManejoPaciente = principaisPreocupacoesRecuperacaoEManejoPaciente;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConfirmouIdentidade() {
        return confirmouIdentidade;
    }

    public void setConfirmouIdentidade(String confirmouIdentidade) {
        this.confirmouIdentidade = confirmouIdentidade;
    }

    public String getSitioDemarcado() {
        return sitioDemarcado;
    }

    public void setSitioDemarcado(String sitioDemarcado) {
        this.sitioDemarcado = sitioDemarcado;
    }

    public String getVerificacaoEquipamentoAnestEMed() {
        return verificacaoEquipamentoAnestEMed;
    }

    public void setVerificacaoEquipamentoAnestEMed(String verificacaoEquipamentoAnestEMed) {
        this.verificacaoEquipamentoAnestEMed = verificacaoEquipamentoAnestEMed;
    }

    public String getOximetroFuncionando() {
        return oximetroFuncionando;
    }

    public void setOximetroFuncionando(String oximetroFuncionando) {
        this.oximetroFuncionando = oximetroFuncionando;
    }

    public String getAlergiaConhecida() {
        return alergiaConhecida;
    }

    public void setAlergiaConhecida(String alergiaConhecida) {
        this.alergiaConhecida = alergiaConhecida;
    }

    public String getComplicacaoViaAerea() {
        return complicacaoViaAerea;
    }

    public void setComplicacaoViaAerea(String complicacaoViaAerea) {
        this.complicacaoViaAerea = complicacaoViaAerea;
    }

    public String getRiscoPerdaSanguinea() {
        return riscoPerdaSanguinea;
    }

    public void setRiscoPerdaSanguinea(String riscoPerdaSanguinea) {
        this.riscoPerdaSanguinea = riscoPerdaSanguinea;
    }

    public String getMembrosSeAPresentaram() {
        return membrosSeAPresentaram;
    }

    public void setMembrosSeAPresentaram(String membrosSeAPresentaram) {
        this.membrosSeAPresentaram = membrosSeAPresentaram;
    }

    public String getConfirmouNomeProcedimentoELocal() {
        return confirmouNomeProcedimentoELocal;
    }

    public void setConfirmouNomeProcedimentoELocal(String confirmouNomeProcedimentoELocal) {
        this.confirmouNomeProcedimentoELocal = confirmouNomeProcedimentoELocal;
    }

    public String getProfilaxiaAntibiotica() {
        return profilaxiaAntibiotica;
    }

    public void setProfilaxiaAntibiotica(String profilaxiaAntibiotica) {
        this.profilaxiaAntibiotica = profilaxiaAntibiotica;
    }

    public String getEtapasCriticas() {
        return etapasCriticas;
    }

    public void setEtapasCriticas(String etapasCriticas) {
        this.etapasCriticas = etapasCriticas;
    }

    public String getDuracaoOperacao() {
        return duracaoOperacao;
    }

    public void setDuracaoOperacao(String duracaoOperacao) {
        this.duracaoOperacao = duracaoOperacao;
    }

    public String getPerdaSanguineaPrevista() {
        return perdaSanguineaPrevista;
    }

    public void setPerdaSanguineaPrevista(String perdaSanguineaPrevista) {
        this.perdaSanguineaPrevista = perdaSanguineaPrevista;
    }

    public String getPreocupacaoEspecificaAnestesiologista() {
        return preocupacaoEspecificaAnestesiologista;
    }

    public void setPreocupacaoEspecificaAnestesiologista(String preocupacaoEspecificaAnestesiologista) {
        this.preocupacaoEspecificaAnestesiologista = preocupacaoEspecificaAnestesiologista;
    }

    public String getEsterilizacaoConfirmada() {
        return esterilizacaoConfirmada;
    }

    public void setEsterilizacaoConfirmada(String esterilizacaoConfirmada) {
        this.esterilizacaoConfirmada = esterilizacaoConfirmada;
    }

    public String getPreocupacaoEquipamentos() {
        return preocupacaoEquipamentos;
    }

    public void setPreocupacaoEquipamentos(String preocupacaoEquipamentos) {
        this.preocupacaoEquipamentos = preocupacaoEquipamentos;
    }

    public String getImagensEssenciaisVisiveis() {
        return imagensEssenciaisVisiveis;
    }

    public void setImagensEssenciaisVisiveis(String imagensEssenciaisVisiveis) {
        this.imagensEssenciaisVisiveis = imagensEssenciaisVisiveis;
    }

    public String getConfirmouNomeProcedimento() {
        return confirmouNomeProcedimento;
    }

    public void setConfirmouNomeProcedimento(String confirmouNomeProcedimento) {
        this.confirmouNomeProcedimento = confirmouNomeProcedimento;
    }

    public String getConclusaoContagemEquipamentos() {
        return conclusaoContagemEquipamentos;
    }

    public void setConclusaoContagemEquipamentos(String conclusaoContagemEquipamentos) {
        this.conclusaoContagemEquipamentos = conclusaoContagemEquipamentos;
    }

    public String getIdentificacaoAmostras() {
        return identificacaoAmostras;
    }

    public void setIdentificacaoAmostras(String identificacaoAmostras) {
        this.identificacaoAmostras = identificacaoAmostras;
    }

    public String getHaProblemasEquipamentos() {
        return haProblemasEquipamentos;
    }

    public void setHaProblemasEquipamentos(String haProblemasEquipamentos) {
        this.haProblemasEquipamentos = haProblemasEquipamentos;
    }

    public String getPrincipaisPreocupacoesRecuperacaoEManejoPaciente() {
        return principaisPreocupacoesRecuperacaoEManejoPaciente;
    }

    public void setPrincipaisPreocupacoesRecuperacaoEManejoPaciente(String principaisPreocupacoesRecuperacaoEManejoPaciente) {
        this.principaisPreocupacoesRecuperacaoEManejoPaciente = principaisPreocupacoesRecuperacaoEManejoPaciente;
    }

}
