package com.clinicamedica.modelo;

public enum Estado {
	
	Hla("HLA"),
	Nb("NB"),
	Lda("LDA"),
	Bg("BG"),
	Mlj("MLJ"),
	Bie("BIÉ"),
	Kk("KK"),
	Cbda("CBDA"),
	Ugi("UGI"),
	Hb("HB"),
	Mux("MUX"),
	Zr("ZR"),
	Ks("KS"),
	Kn("KN"),
	Cn("CN"),
	Ln("LN"),
	Ls("LS"),
	Bng("BNG");
	
	
	private String descricao;
	
	Estado(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}