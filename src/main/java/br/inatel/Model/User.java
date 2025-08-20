package br.inatel.Model;

public class User {
    private String nome;
    private String cpf;
    private int id;

    public User(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    /*
    public void setNome() {
        this.nome = nome;
    }
    */

    public String getCpf() {
        return cpf;
    }
    /*
    public void setCpf() {
        this.cpf = cpf;
    }

    */

    public int getId() {
        return id;
    }
    /*
    public void setId() {
        this.id = id;
    }
    */
}
