package br.unb.cic.epl.spl.Height;

public privileged aspect SubHeight {
    public Integer br.unb.cic.epl.spl.Exp.Sub.height() {
    	return Math.max(lhs.height(),rhs.height())+1;
    }
}