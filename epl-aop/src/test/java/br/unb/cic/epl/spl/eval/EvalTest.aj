package br.unb.cic.epl.spl.eval;

public aspect EvalTest {
	public void br.unb.cic.epl.spl.Test.testEval() {
		br.unb.cic.epl.spl.Literal lit = new br.unb.cic.epl.spl.Literal(1000);
		assertEquals(new Integer(1000), lit.eval());
	}
	
	public void br.unb.cic.epl.spl.Test.testAddEval() {
		br.unb.cic.epl.spl.Exp.Add add = new br.unb.cic.epl.spl.Exp.Add(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(5), add.eval());
	}
	
	public void br.unb.cic.epl.spl.Test.testMultEval() {
		br.unb.cic.epl.spl.Exp.Mult mult = new br.unb.cic.epl.spl.Exp.Mult(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(6), mult.eval());
	}
	
	public void br.unb.cic.epl.spl.Test.testSubEval() {
		br.unb.cic.epl.spl.Exp.Sub sub = new br.unb.cic.epl.spl.Exp.Sub(new br.unb.cic.epl.spl.Literal(7), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(4), sub.eval());
	}
	
}
