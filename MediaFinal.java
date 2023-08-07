package EXERCICIO;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("===================================SITUAÇÃO DO ALUNO=====================================");
        System.out.println("Calcular se o aluno está aprovado ou não!");
        System.out.println("Insira os dados do aluno.");

        System.out.print("Nome: ");
        String nome = leia.nextLine();

        System.out.print("Registro Academico: ");
        int registroAcademico = leia.nextInt();

        boolean gate = false;

        double projeto;
        double prova2;
        double prova1;
        do {
            System.out.print("\nNotas (0-10)\n1° Prova: ");
            prova1 = leia.nextDouble();

            System.out.print("2° Prova: ");
            prova2 = leia.nextDouble();

            System.out.print("Projeto: ");
            projeto = leia.nextDouble();

            if (prova1 >= 0 && prova1 <= 10 && prova2 >= 0 && prova2 <= 10 && projeto >= 0 && projeto <= 10) {
                gate = true;
            } else {
                System.out.println("Alguma nota é inválida! Todas as notas devem estar entre 0 e 10.");
            }
        } while (!gate);

        Aluno aluno = new Aluno(nome, registroAcademico, prova1, prova2, projeto);
        System.out.println("\nRESULTADO:");
        System.out.println(aluno.toString());
        System.out.printf("Média Final: %.1f\n", aluno.calcularMediaFinal());
        System.out.println("Situação: " + aluno.situacao());

        leia.close();
    }
}
