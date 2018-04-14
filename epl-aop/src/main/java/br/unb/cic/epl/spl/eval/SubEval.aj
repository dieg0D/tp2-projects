package br.unb.cic.epl.spl.eval;

public privileged aspect SubEval {
    public Integer br.unb.cic.epl.spl.Exp.Sub.eval() {
        return lhs.eval() - rhs.eval();
    }
pointcut createExp(br.unb.cic.epl.spl.Main m) : execution(void br.unb.cic.epl.spl.Main.createExpressions()) && target(m); 
	
	void around(br.unb.cic.epl.spl.Main m): createExp(m) {
		proceed(m);
		m.expressions.add(new br.unb.cic.epl.spl.Exp.Sub(new br.unb.cic.epl.spl.Literal(5), new br.unb.cic.epl.spl.Literal(3)));	
	}
}