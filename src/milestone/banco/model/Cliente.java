package milestone.banco.model;

import java.util.ArrayList;

/*
 * Programação Orientada a Objetos
 * Milestone 2
 * Discente: Emanoel Carvalho
 * 
 */
public class Cliente {

	private String cpf;
    private String nome;
    private ArrayList<Conta> contas;

    //Não alterar o construtor
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    /*
     * Método recebe uma conta a ser adicionada no arraylist de contas
     * do cliente. Antes de adicioná-la, deve-se verificar se já existe uma
     * conta existente. Para uma adição realizada com sucesso, deve-se retornar 
     * true. Caso contrário, false.
     */
    public boolean adicionarConta(Conta conta) {
        for (Conta c : contas) {
        	if (c.equals(conta) ) {
        		return false;
        	}
        }
        
        contas.add(conta);
        return true;
    }

    /*
     * Método recebe um número de conta a ser removida do arraylist de contas
     * do cliente. Antes de remove-la, deve-se verificar se a conta existe no
     * array. Para tanto, implemente o método localizarConta deste método, pois 
     * convém utilizá-lo no escopo deste método. Para remoção realizada com sucesso, 
     * deve-se retornar true. Caso contrário, false.
     */
    public boolean removerConta(String numeroConta) {
        Conta conta = localizarConta(numeroConta);
        
        if (conta != null) {
        	contas.remove(conta);
        	return true;
        }
        	return false;
    }

    /*
     * Método recebe uma número de conta como argumento a fim
     * de verificar se existe o elemento com tal número no array.
     * Caso exista, retorne o elemento consultado, caso contrário
     * retorne null.
     * 
     */
    public Conta localizarConta(String numeroConta) {
        for (Conta c : contas) {
        	if (c.getNumero().equals(numeroConta) ) {
        		return c; 
        	}
        }
        return null;
    }
    

    //Não alterar os métodos abaixo
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
}
