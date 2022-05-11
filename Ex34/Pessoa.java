package Ex34;

public class Pessoa {
		String nome;
		double altura;
		int peso;
		public Pessoa(String nome, double altura, int peso) {
			super();
			this.nome = nome;
			this.altura = altura;
			this.peso = peso;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		public String imprimirPessoa() {
			return ("Nome: "+getNome()+" Altura: "+getAltura()+" Peso: "+getPeso());
		}
	}

