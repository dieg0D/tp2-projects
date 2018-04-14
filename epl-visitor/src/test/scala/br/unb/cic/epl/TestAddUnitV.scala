package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers


class TestAddUnitV extends FlatSpec with Matchers {

  var literal100: Literal = _
  var literal200: Literal = _

  literal100 = new Literal(100)
  literal200 = new Literal(200)

  var teste = "(100 + 200)"
  var test2 = 300 

  val add = new Add(literal100, literal200)

  if(add.print() == teste){
    print("\n====>> Teste unitario ADD print:  (100 + 200) e igual a " + add.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario ADD print:  (100 + 200) e diferente de " + add.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }

  val eval = new Eval()

  add.accept(eval)

  if(eval.result() == test2){
    print("\n====>> Teste unitario ADD: " + add.print() + " e igual a " + eval.result() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario ADD: " + add.print() + " e igual a " + eval.result() + " mas deveria ser (100 + 200) = 300" + " ==> ")
    println("O teste falhou!!\n\n")
  }
}
