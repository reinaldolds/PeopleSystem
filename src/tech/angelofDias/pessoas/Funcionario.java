package tech.angelofDias.pessoas;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private Cargo cargo;
    private float salario;
    private int matricula;

    public enum Cargo {
        Analista,
        Gerente,
        Coordenador,
        Programador;
    }

    private Scanner leitor = new Scanner(System.in);

    public Cargo getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    public void cadastrar() {
        super.cadastrar();

        
        System.out.println("Informe a matrícula do funcionário: ");
        this.matricula = leitor.nextInt();
        leitor.nextLine();


        System.out.println("Informe o salário do funcionário: ");
        this.salario = leitor.nextFloat();
        leitor.nextLine();


        System.out.println("Selecione o cargo do funcionário: ");
        System.out.println("1 - Analista");
        System.out.println("2 - Gerente");
        System.out.println("3 - Coordenador");
        System.out.println("4 - Programador");
        
        int opcaoCargo = leitor.nextInt();
        leitor.nextLine();

        switch(opcaoCargo) {
            case 1:
                this.cargo = Cargo.Analista;
                break;
            case 2:
                this.cargo = Cargo.Gerente;
                break;
            case 3:
                this.cargo = Cargo.Coordenador;
                break;
            case 4:
                this.cargo = Cargo.Programador;
                break;
            default:
                System.out.println("Opção de cargo inválida.");
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: " + getNome()+ '\'' +
                ", cargo: " + cargo +
                ", salario: " + salario +
                ", matricula=" + matricula +
                '}';
    }
}
