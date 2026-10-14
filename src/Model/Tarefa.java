package Model;

public class Tarefa {

    private int id;
    private Pessoa responsavel;
    private String nome;
    private String descricao;

    public Tarefa(int id, Pessoa responsavel, String nome, String descricao) {
        this.id = id;
        this.responsavel = responsavel;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
