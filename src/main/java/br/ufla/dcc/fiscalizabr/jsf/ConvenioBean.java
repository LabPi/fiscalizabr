package br.ufla.dcc.fiscalizabr.jsf;

import br.ufla.dcc.fiscalizabr.dao.ConvenioDAO;
import br.ufla.dcc.fiscalizabr.dao.jpa.JPAConvenioDAO;
import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.rest.ConvenioResource;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "cBean")
@RequestScoped
public class ConvenioBean {

    @ManagedProperty(value = "#{param.nConv}")
    private Integer nConv;
    private Convenio convenio;
    private ConvenioDAO cDAO = new JPAConvenioDAO();

    @PostConstruct
    public void init() {
        if (nConv != null) {
            convenio = cDAO.porNumero(nConv);
        } else {
            convenio = null;
        }
    }

    public static void adicionarMensagem(FacesMessage.Severity sev, String msg, String componente) {
        FacesMessage fm = new FacesMessage(sev, msg, msg);
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(componente, fm);
    }

    public void setnConv(Integer nConv) {
        this.nConv = nConv;
    }

    public boolean isCarregouConvenio() {
        return convenio != null;
    }

    public Convenio getConvenio() {
        return convenio;
    }

}
