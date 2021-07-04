package br.com.alura.tdd.modelo;

public enum CargoFuncionario {
	OPERARIO {
		@Override
		public Double calcularAlimentacao() {
			// TODO Auto-generated method stub
			return 15.00;
		}
	},
	GERENTE {
		@Override
		public Double calcularAlimentacao() {
			// TODO Auto-generated method stub
			return 25.00;
		}
	},
	DIRETOR {
		@Override
		public Double calcularAlimentacao() {
			// TODO Auto-generated method stub
			return 40.00;
		}
	};
	
	public abstract Double calcularAlimentacao();
}
