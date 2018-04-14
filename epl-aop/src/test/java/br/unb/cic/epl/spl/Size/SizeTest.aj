package br.unb.cic.epl.spl.Size;

public aspect SizeTest {
	public void br.unb.cic.epl.spl.Test.testSize() {
		br.unb.cic.epl.spl.Literal lit = new br.unb.cic.epl.spl.Literal(1000);
		assertEquals(new Integer(1), lit.size());
	}
	
	public void br.unb.cic.epl.spl.Test.testAddSize() {
		br.unb.cic.epl.spl.Exp.Add add = new br.unb.cic.epl.spl.Exp.Add(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(3), add.size());
	}
	
	public void br.unb.cic.epl.spl.Test.testMultSize() {
		br.unb.cic.epl.spl.Exp.Mult mult = new br.unb.cic.epl.spl.Exp.Mult(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(3), mult.size());
	}
	
	public void br.unb.cic.epl.spl.Test.testSubSize() {
		br.unb.cic.epl.spl.Exp.Sub sub = new br.unb.cic.epl.spl.Exp.Sub(new br.unb.cic.epl.spl.Literal(7), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(3), sub.size());
	}
	
}
