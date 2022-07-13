package ListaA;
import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {

    private List<Professor> ProfessoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, String CPF, int numeroRegistro, String lotacao, double salario) {
        super(nome, CPF, numeroRegistro, lotacao, salario);
    }

    public List<Professor> getProfessoresSupervisionados() {
        return ProfessoresSupervisionados;
    }

    public double aumentoSalarioCoordenador(double salario){
        double aumento = (salario * 5) / 100;
        salario = salario + aumento;
        return salario;
    }

    public void adicionaProfessor(Professor professor){
        ProfessoresSupervisionados.add(professor);
    }
}