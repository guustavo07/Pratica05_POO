package Ex34;

public class main {
		public static void main(String[] args) {
			Pessoa[] pessoas = new Pessoa[10];
			
			pessoas [0] = new Pessoa("Gustavo", 1.87, 65);
			pessoas [1] = new Pessoa("Carlos", 1.63, 80);
			pessoas [2] = new Pessoa("Eugenio", 1.77, 80);
			pessoas [3] = new Pessoa("Pedro", 1.74, 80);
			pessoas [4] = new Pessoa("Malu", 1.96, 80);
			pessoas [5] = new Pessoa("Lazaro", 1.55, 80);
			pessoas [6] = new Pessoa("Paulo", 1.72, 80);
			pessoas [7] = new Pessoa("Joao", 1.69, 80);
			pessoas [8] = new Pessoa("Ana", 1.77, 80);
			pessoas [9] = new Pessoa("Fabio", 1.62, 80);

			for(int i=0; i<pessoas.length;i++) {
				System.out.println(pessoas[i].imprimirPessoa());
			}
		}

	}


