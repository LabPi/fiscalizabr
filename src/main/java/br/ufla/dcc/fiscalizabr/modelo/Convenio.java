package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = Convenio.TODOS, query = "select c from Convenio c")
public class Convenio implements Serializable {

    public static final String TODOS = "Convenio.TODOS";
    @Id
    @GeneratedValue
    private Long id;
    private int anoConvenio;
    private int numeroConvenio;
    @Embedded
    private Proposta proposta;
    @Enumerated(EnumType.STRING)
    private Modalidade modalidade;
    @Enumerated(EnumType.STRING)
    private SituacaoConvenio situacaoConvenio;
    @Enumerated(EnumType.STRING)
    private SubsituacaoConvenio subsituacaoConvenio;
    @Enumerated(EnumType.STRING)
    private SituacaoPublicacaoConvenio situacaoPublicacaoConvenio;
    @Embedded
    private OrgaoSuperior orgaoSuperior;
    @Embedded
    private OrgaoConcedente orgaoConcedente;
    @Embedded
    private Valor valor;
    private int identificacaoConvenio; 
    private String numeroProcesso;
    private String numeroInterno;
    private boolean estaAssinado; 
    private boolean possuiAditivo;
    private boolean estaPublicado;
    private boolean estaEmpenhado;
    private boolean possuiProrrogaDeOficio;
    private boolean permiteAjusteNoCronogramaFisico; 
    private int quantidadeEmpenhos;
    private int quantidadeAditivos;
    private int quantidadeProrrogas;
    @Lob
    private String objeto;
    @Lob
    private String justificativa;
    private String codigoPrograma;
    private String nomePrograma;
    private String codigoAcao;
    private String identificacaoPrograma;
    private Date inicioVigencia;
    private Date fimVigencia;
    private Date dataAssinatura;
    private int mesAssinatura;
    private int anoAssinatura;
    private Date dataPublicacao;
    private int mesPublicacao;
    private int anoPublicacao;
    private Date ultimoEmpenho;
    private Date ultimoPagamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnoConvenio() {
        return anoConvenio;
    }

    public void setAnoConvenio(int anoConvenio) {
        this.anoConvenio = anoConvenio;
    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public SituacaoConvenio getSituacaoConvenio() {
        return situacaoConvenio;
    }

    public void setSituacaoConvenio(SituacaoConvenio situacaoConvenio) {
        this.situacaoConvenio = situacaoConvenio;
    }

    public SubsituacaoConvenio getSubsituacaoConvenio() {
        return subsituacaoConvenio;
    }

    public void setSubsituacaoConvenio(SubsituacaoConvenio subsituacaoConvenio) {
        this.subsituacaoConvenio = subsituacaoConvenio;
    }

    public SituacaoPublicacaoConvenio getSituacaoPublicacaoConvenio() {
        return situacaoPublicacaoConvenio;
    }

    public void setSituacaoPublicacaoConvenio(SituacaoPublicacaoConvenio situacaoPublicacaoConvenio) {
        this.situacaoPublicacaoConvenio = situacaoPublicacaoConvenio;
    }

    public OrgaoSuperior getOrgaoSuperior() {
        return orgaoSuperior;
    }

    public void setOrgaoSuperior(OrgaoSuperior orgaoSuperior) {
        this.orgaoSuperior = orgaoSuperior;
    }

    public OrgaoConcedente getOrgaoConcedente() {
        return orgaoConcedente;
    }

    public void setOrgaoConcedente(OrgaoConcedente orgaoConcedente) {
        this.orgaoConcedente = orgaoConcedente;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public int getIdentificacaoConvenio() {
        return identificacaoConvenio;
    }

    public void setIdentificacaoConvenio(int identificacaoConvenio) {
        this.identificacaoConvenio = identificacaoConvenio;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public boolean isEstaAssinado() {
        return estaAssinado;
    }

    public void setEstaAssinado(boolean estaAssinado) {
        this.estaAssinado = estaAssinado;
    }

    public boolean isPossuiAditivo() {
        return possuiAditivo;
    }

    public void setPossuiAditivo(boolean possuiAditivo) {
        this.possuiAditivo = possuiAditivo;
    }

    public boolean isEstaPublicado() {
        return estaPublicado;
    }

    public void setEstaPublicado(boolean estaPublicado) {
        this.estaPublicado = estaPublicado;
    }

    public boolean isEstaEmpenhado() {
        return estaEmpenhado;
    }

    public void setEstaEmpenhado(boolean estaEmpenhado) {
        this.estaEmpenhado = estaEmpenhado;
    }

    public boolean isPossuiProrrogaDeOficio() {
        return possuiProrrogaDeOficio;
    }

    public void setPossuiProrrogaDeOficio(boolean possuiProrrogaDeOficio) {
        this.possuiProrrogaDeOficio = possuiProrrogaDeOficio;
    }

    public boolean isPermiteAjusteNoCronogramaFisico() {
        return permiteAjusteNoCronogramaFisico;
    }

    public void setPermiteAjusteNoCronogramaFisico(boolean permiteAjusteNoCronogramaFisico) {
        this.permiteAjusteNoCronogramaFisico = permiteAjusteNoCronogramaFisico;
    }

    public int getQuantidadeEmpenhos() {
        return quantidadeEmpenhos;
    }

    public void setQuantidadeEmpenhos(int quantidadeEmpenhos) {
        this.quantidadeEmpenhos = quantidadeEmpenhos;
    }

    public int getQuantidadeAditivos() {
        return quantidadeAditivos;
    }

    public void setQuantidadeAditivos(int quantidadeAditivos) {
        this.quantidadeAditivos = quantidadeAditivos;
    }

    public int getQuantidadeProrrogas() {
        return quantidadeProrrogas;
    }

    public void setQuantidadeProrrogas(int quantidadeProrrogas) {
        this.quantidadeProrrogas = quantidadeProrrogas;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getNomePrograma() {
        return nomePrograma;
    }

    public void setNomePrograma(String nomePrograma) {
        this.nomePrograma = nomePrograma;
    }

    public String getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(String codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getIdentificacaoPrograma() {
        return identificacaoPrograma;
    }

    public void setIdentificacaoPrograma(String identificacaoPrograma) {
        this.identificacaoPrograma = identificacaoPrograma;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public int getMesAssinatura() {
        return mesAssinatura;
    }

    public void setMesAssinatura(int mesAssinatura) {
        this.mesAssinatura = mesAssinatura;
    }

    public int getAnoAssinatura() {
        return anoAssinatura;
    }

    public void setAnoAssinatura(int anoAssinatura) {
        this.anoAssinatura = anoAssinatura;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(int mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Date getUltimoEmpenho() {
        return ultimoEmpenho;
    }

    public void setUltimoEmpenho(Date ultimoEmpenho) {
        this.ultimoEmpenho = ultimoEmpenho;
    }

    public Date getUltimoPagamento() {
        return ultimoPagamento;
    }

    public void setUltimoPagamento(Date ultimoPagamento) {
        this.ultimoPagamento = ultimoPagamento;
    }
    
    

}
