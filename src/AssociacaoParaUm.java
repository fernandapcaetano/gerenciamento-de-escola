//associar aluno com turma

import java.util.Date;

import classes.Aluno;
import classes.Turma;

public class AssociacaoParaUm {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSigla("1d");
        turma1.setAno(1);
        

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Nanda");
        aluno1.setMatricula(0000001);
        aluno1.setDatanascimento(new Date());
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setMatricula(0000002);
        aluno2.setDatanascimento(new Date());
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);


        System.out.println("Informaçoes Aluno 1");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTurma().getSigla());
        System.out.println("_____________________________");
        System.out.println("Informaçoes da turma");
        for (int i = 0; i < turma1.quantidadeAlunos(); i++) {
            System.out.println(turma1.getAluno(i).getNome());
        }
    }
    
}
