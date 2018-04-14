package br.unb.cic.epl.spl.Height;


public privileged aspect AddHeight {
	public Integer br.unb.cic.epl.spl.Exp.Add.height() {
		return Math.max(lhs.height(),rhs.height())+1;
	}
	
}