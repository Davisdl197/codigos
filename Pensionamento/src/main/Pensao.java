package main;

public class Pensao {

    public String nome;
    public String email;

    public void setEmail(String email){
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Pensao(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String toString(){
        return "Nome: "
        + nome 
        + "\nEmail: " 
        + email;
    }
}
