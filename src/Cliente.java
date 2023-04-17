import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int cpf;
    private Endereco endereco;
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    private ArrayList<Telefone> listaTelefone = new ArrayList<Telefone>();

    public Cliente () {}

    public Cliente (String nome, int cpf, Endereco endereco, 
                    ArrayList<Conta> listaContas, ArrayList<Telefone> listaTelefone) {
            
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.listaContas = listaContas;
            this.listaTelefone = listaTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public void addConta(Conta novaConta){
        this.listaContas.add(novaConta);
    }

    public ArrayList<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(ArrayList<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    public void addTelefone(Telefone novoTelefone) {
        this.listaTelefone.add(novoTelefone);
    }
    
}

