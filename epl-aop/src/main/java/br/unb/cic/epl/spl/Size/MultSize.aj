package br.unb.cic.epl.spl.Size;

public privileged aspect MultSize {
    public Integer br.unb.cic.epl.spl.Exp.Mult.size() {
        return (lhs.size() + rhs.size())+1;
    }
}