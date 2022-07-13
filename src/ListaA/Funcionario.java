package ListaA;
public class Funcionario {

    private String nome;
    private String CPF;
    private int numeroRegistro;
    private String lotacao;
    private double salario;

    public Funcionario(String nome, String CPF, int numeroRegistro, String lotacao, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.numeroRegistro = numeroRegistro;
        this.lotacao = lotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double salario){
        double aumento = (salario * 10) / 100;
        salario = salario + aumento;
        return salario;
    }
}