package br.unb.cic.epl.spl.Size;

public privileged aspect AddSize {
	public Integer br.unb.cic.epl.spl.Exp.Add.size() {
		return (lhs.size() + rhs.size())+1;
	}
}