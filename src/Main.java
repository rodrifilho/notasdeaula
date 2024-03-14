//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando um professor
        Professor professor = new Professor("Dr. Smith", 40, 5000.00);
        // Criando um aluno
        Aluno aluno = new Aluno("João", 20, "2023001");

        // Mostrando informações do professor
        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Salário: R$" + professor.getSalario());

        // Mostrando informações do aluno
        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
