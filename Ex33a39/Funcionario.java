package Ex33a39;

public class Funcionario {
		String nome, departamento, data, RG, funAtivo;
		double salario;
		boolean ativo;
		
		public Funcionario(String nome, String departamento, String data, String rG, double salario, boolean ativo) {
			super();
			this.nome = nome;
			this.departamento = departamento;
			this.data = data;
			RG = rG;
			this.salario = salario;
			this.ativo = ativo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getRG() {
			return RG;
		}
		public void setRG(String rG) {
			RG = rG;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public boolean isAtivo() {
			return ativo;
		}
		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		public void bonificar(double valBonificacao) {
			salario+=valBonificacao;
		}
		public void demitir() {
			ativo=false;
		}
		public String mostrarDados() {
			if(isAtivo()== false) {
				funAtivo = "Funcion�rio atualmente n�o ativo";
			}else {
				funAtivo = "Funcion�rio atualmente ativo!";
			}
			return ("Nome: "+nome+"\nRG: "+RG+"\nDepartamento: "+departamento+"\nData de entrada: "+data+"\nSal�rio: "+salario+"\nAtualmente na empresa? "+funAtivo);
		}

		
		
}
