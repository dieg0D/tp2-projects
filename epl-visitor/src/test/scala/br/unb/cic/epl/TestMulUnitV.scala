package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers


class TestMulUnitV extends FlatSpec with Matchers {


  var literal100: Literal = _
  var literal200: Literal = _

  literal100 = new Literal(100)
  literal200 = new Literal(200)

  var teste = "(100 * 200)"
  var test2 = 20000

  val mul = new Mul(literal100, literal200)

  if(mul.print() == teste){
    print("\n====>> Teste unitario MUL print:  (100 * 200) e igual a " + mul.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario MUL print:  (100 * 200) e diferente de " + mul.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }

  val eval = new Eval()

  mul.accept(eval)

  if(eval.result() == test2){
    print("\n====>> Teste unitario MUL: " + mul.print() + " e igual a " + eval.result() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario MUL: " + mul.print() + " e igual a " + eval.result() + " mas deveria ser (100 * 200) = 20000" + " ==> ")
    println("O teste falhou!!\n\n")
  }
  
}
