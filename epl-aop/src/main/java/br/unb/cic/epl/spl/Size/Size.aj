package br.unb.cic.epl.spl.Size;


public privileged aspect Size {
	public abstract Integer br.unb.cic.epl.spl.Expression.size();
	
	public Integer br.unb.cic.epl.spl.Literal.size() {
		return 1;
	}
		
}