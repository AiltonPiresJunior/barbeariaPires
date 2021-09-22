/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import static DAO.Banco.agendamento;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ailton
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencharTabela(ArrayList<Agendamento> agendamento) {
        
       DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaAgendamentos().getModel();
       tableModel.setNumRows(0);
       
        for (Agendamento agendamento1 : agendamento) {
            
            tableModel.addRow(new Object[]{
                
                agendamento1.getId(),
                agendamento1.getCliente().getNome(),
                agendamento1.getServico().getDescricao(),
                agendamento1.getValor(),
                agendamento1.getDataFormatada(),
                agendamento1.getHoraFormatada(),
                agendamento1.getObservacao()
                
            });
            
        
         
        }
        
        
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
      DefaultComboBoxModel comboBoxModel =  (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
      
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
            
        }
        
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel =  (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
        
    }

    public Cliente obterCliente() {
        
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
        
    }
    
    public Servico obterServico() {
        
        return (Servico) view.getjComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getData().getText();
        String hora = view.getHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getObservacao().getText();
        
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        
        return agendamento;
        
        
        //new Agendamento();
        
        
    }

    @Override
    public void limparTela() {
        
        view.getId().setText("0");
        view.getData().setText("");
        view.getHora().setText("");
        view.getObservacao().setText("");
    }
    
    
    
    
    
    
}
