package ListaA;
public class FuncionarioAdministrativo extends Funcionario{

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String CPF, int numeroRegistro, String lotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, CPF, numeroRegistro, lotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
