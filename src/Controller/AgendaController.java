/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import DAO.AgendamentoDAO;
import static DAO.Banco.agendamento;
import DAO.ClienteDAO;
import DAO.ServicoDAO;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Ailton
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;


    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    public void atualizaTabela(){
        
     AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
     
     ArrayList<Agendamento> agentamentos = agendamentoDAO.selectAll();
     
     helper.preencharTabela(agendamento);
        
    }
    
    public void atualizaCliente(){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
                
    }
    
    public void atualizServico(){
        ServicoDAO sercicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = sercicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        
    }

    public void agendar() {
        
        Agendamento agendamento = helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
       
        atualizaTabela();
        helper.limparTela();
    }
    
}
