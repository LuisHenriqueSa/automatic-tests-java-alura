package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal concederReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal concederReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal concederReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20");
		}
	},
	EXCELENTE {
		@Override
		public BigDecimal concederReajuste() {
			return new BigDecimal("0.40");
		}
	};
	
	public abstract BigDecimal concederReajuste();

}
