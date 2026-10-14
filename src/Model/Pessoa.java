package Model;

public class Pessoa {

    private int id;
    private String nome;
    private String email;

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}'+"\n";
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


