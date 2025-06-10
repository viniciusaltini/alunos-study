package alunos;

import javax.swing.JOptionPane;

public class resolucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vetNomes [] = {"João", "Maria", "José", "Adão", "Eva", "Camelo"};
		double vetMedia[] = new double [6];
		String vetSituacao [] = new String [6]; //>= 7 = aprovado; 5 até 6.99 = em recuperação; < 5 = reprovado
		double matNotas[][] = new double[6][3]; //6 alunos, 3 notas para cada
		double acumNotas = 0;
		for (int lin = 0; lin < 6; lin++) {
			
			for (int col = 0; col < 3; col++) {
				matNotas[lin][col] = Double.valueOf(JOptionPane.showInputDialog("Informe a " + (col+1) + "ª nota do " + (lin+1) + "º aluno"));
				acumNotas += matNotas[lin][col];
			}
			vetMedia[lin] = Math.round(acumNotas/3);
			vetSituacao [lin] = testaSituacao(vetMedia[lin]);
		}
		String saida = "As notas do(a) aluno(a) " + vetNomes[0] + " são " + matNotas[0][0] + " " + matNotas[0][1] + " " + matNotas[0][2] + " "
				+ "e sua média é " + vetMedia[0] + " e ele(a) está " + vetSituacao[0] + "\nAs notas do(a) aluno(a) " + vetNomes[1] + " são " + matNotas[1][0] + " " + matNotas[1][1] + " " + matNotas[1][2] + " "
						+ "e sua média é " + vetMedia[1] + " e ele(a) está " + vetSituacao[1] + "\nAs notas do(a) aluno(a) " + vetNomes[2] + " são " + matNotas[2][0] + " " + matNotas[2][1] + " " + matNotas[2][2] + " "
								+ "e sua média é " + vetMedia[2] + " e ele(a) está " + vetSituacao[2] + "\nAs notas do(a) aluno(a) " + vetNomes[3] + " são " + matNotas[3][0] + " " + matNotas[3][1] + " " + matNotas[3][2] + " "
										+ "e sua média é " + vetMedia[3] + " e ele(a) está " + vetSituacao[3] + "\nAs notas do(a) aluno(a) " + vetNomes[4] + " são " + matNotas[4][0] + " " + matNotas[4][1] + " " + matNotas[4][2] + " "
												+ "e sua média é " + vetMedia[4] + " e ele(a) está " + vetSituacao[4] + "\nAs notas do(a) aluno(a) " + vetNomes[5] + " são " + matNotas[5][0] + " " + matNotas[5][1] + " " + matNotas[5][2] + " "
														+ "e sua média é " + vetMedia[5] + " e ele(a) está " + vetSituacao[5];
		JOptionPane.showMessageDialog(null, saida);
	}
	
	static String testaSituacao (double pMedia) {
		String situacao = "";
		if (pMedia >= 7) {
			situacao = "aprovado.";
		} else if (pMedia <= 6.99 && pMedia >= 5) {
			situacao = "em Recuperação.";
		} else {
			situacao = "reprovado.";
		}
		return situacao;
	}

}

