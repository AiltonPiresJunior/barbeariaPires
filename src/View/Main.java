/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Ailton
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "Thiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());    
        
       
        Cliente cliente = new Cliente(1, "Thiago", "Rua Teste", "92531214545");
        System.out.println(cliente.getNome());
        Usuario usuario1 = new Usuario(1, "Barbeiro", "Senha");
        System.out.println(usuario1.getNome());
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "26/07/2018 09:15");
        
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
    
    
}
