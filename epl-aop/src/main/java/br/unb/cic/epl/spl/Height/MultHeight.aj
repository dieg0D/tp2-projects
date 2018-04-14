package br.unb.cic.epl.spl.Height;

public privileged aspect MultHeight {
    public Integer br.unb.cic.epl.spl.Exp.Mult.height() {
    	return Math.max(lhs.height(),rhs.height())+1;
    }
}