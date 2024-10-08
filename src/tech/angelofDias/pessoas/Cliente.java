package tech.angelofDias.pessoas;

import tech.angelofDias.composicao.Profissao;

import java.util.Scanner;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner leitor = new Scanner(System.in);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = leitor.nextLine();
        System.out.println("Informe a profissão do cliente: ");
        System.out.println("1 - PROFESSOR,\r\n"
            + "2 - MEDICO,\r\n"
            + "3 - ENGENHEIRO,\r\n"
            + "4 - ADVOGADO,\r\n"
            + "5 - DESENVOLVEDOR,\r\n"
            + "6 - QA,\r\n"
            + "7 - OUTROS;");
        
        int opc = leitor.nextInt();
        leitor.nextLine(); // Para limpar o buffer após nextInt()

        // Agora atribuímos diretamente ao atributo 'profissao'
        if(opc == 1) {
            this.profissao = Profissao.PROFESSOR;
        } else if(opc == 2) {
            this.profissao = Profissao.MEDICO;
        } else if(opc == 3) {
            this.profissao = Profissao.ENGENHEIRO;
        } else if(opc == 4) {
            this.profissao = Profissao.ADVOGADO;
        } else if(opc == 5) {
            this.profissao = Profissao.DESENVOLVEDOR;
        } else if(opc == 6) {
            this.profissao = Profissao.QA;
        } else if(opc == 7) {
            this.profissao = Profissao.OUTROS;
            System.out.println("Informe sua profissão: ");
            this.tipoProfissaoOutros = leitor.nextLine();
        }
    }


    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                "} ";
    }
}