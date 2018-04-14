package br.unb.cic.epl.spl.Size;

public privileged aspect SubSize {
    public Integer br.unb.cic.epl.spl.Exp.Sub.size() {
        return (lhs.size() + rhs.size())+1;
    }
}