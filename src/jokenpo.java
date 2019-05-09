import java.util.Scanner;

public class jokenpo {
	public static void main (String args []){
		int j1,j2;	//Escolhas dos jogadores.
		int repetir = 0;
		int escolha;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Jokenpo!"+"\n"+
		"Digite 1 para Pedra."+"\n"+
		"Digite 2 para Papel."+"\n"+
		"Digite 3 para Tesoura."+"\n");
		
		while(repetir == 0) {
			System.out.println("Escolha do jogador 1: ");
			j1 = sc.nextInt();
			
			System.out.println("Escolha do jogador 2: ");
			j2 = sc.nextInt();
			jogo(j1,j2);
			
			System.out.println("Deseja continuar jogando?");
			System.out.println("Responda '1' para sim e '2' para não.");
			escolha = sc.nextInt();
			switch(escolha) {
				case 1:
					System.out.println("Nova rodada começará.");
					break;
				case 2: 
					repetir = 1;
					System.out.println("Jogo encerrado.");
					break;
				default:
					repetir = 1;
					System.out.println("Foi escolhida uma opção inválida, o jogo será encerrado.");
					break;
			}
		}
	}
	public static void jogo(int j1,int j2) {
		switch(j1) {
			case 1:	//Jogador 1 jogou Pedra
				System.out.println("Jogador 1 jogou Pedra!");
				switch(j2) {
					case 1:	//Jogador 2 jogou Pedra
						System.out.println("Jogador 2 jogou Pedra!");
						System.out.println("Empate!");
						break;
					case 2:	//Jogador 2 jogou Papel
						System.out.println("Jogador 2 jogou Papel!");
						System.out.println("Jogador 2 é o Vencedor!");
						break;
					case 3:	//Jogador 2 jogou Tesoura
						System.out.println("Jogador 2 jogou Tesoura!");
						System.out.println("Jogador 1 é o Vencedor!");
						break;
					default:		
						System.out.println("Jogador 2 colocou uma entrada inválida.");
						break;
				}
				break;
				
			case 2:	//Jogador 1 jogou Papel
				System.out.println("Jogador 1 jogou Papel!");
				switch(j2) {
					case 1:	//Jogador 2 jogou Pedra
						System.out.println("Jogador 2 jogou Pedra!");
						System.out.println("Jogador 1 é o Vencedor!");
						break;
					case 2:	//Jogador 2 jogou Papel
						System.out.println("Jogador 2 jogou Papel!");
						System.out.println("Empate!");
						break;
					case 3:	//Jogador 2 jogou Tesoura
						System.out.println("Jogador 2 jogou Tesoura!");
						System.out.println("Jogador 2 é o Vencedor!");
						break;
					default:
						System.out.println("Jogador 2 colocou uma entrada inválida.");
						break;
				}
				break;
				
			case 3:	//Jogador 1 jogou Tesoura
				System.out.println("Jogador 1 jogou Tesoura!");
				switch(j2) {
					case 1:	//Jogador 2 jogou Pedra
						System.out.println("Jogador 2 jogou Pedra!");
						System.out.println("Jogador 2 é o Vencedor!");
						break;
					case 2:	//Jogador 2 jogou Papel
						System.out.println("Jogador 2 jogou Papel!");
						System.out.println("Jogador 1 é o Vencedor!");
						break;
					case 3:	//Jogador 2 jogou Tesoura
						System.out.println("Jogador 2 jogou Tesoura!");
						System.out.println("Empate!");
						break;
					default:
						System.out.println("Jogador 2 colocou uma entrada inválida.");
						break;
				}
				break;
				
			default:
				System.out.println("Jogador 1 colocou uma entrada inválida.");
				break;
		}
	}
}