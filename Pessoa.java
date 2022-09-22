import java.util.Date;

public abstract class Pessoa {
    
    private String nomeCompleto;
    private int cpf;
    private String endereco;
    private Date dataNascimento;
    private Date dataCadastro;
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

 


}
