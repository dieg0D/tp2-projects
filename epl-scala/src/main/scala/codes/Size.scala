package codes


package object Size { 
  trait Expression extends Core.Expression {
    def size(): Int
  }

  trait Literal extends Core.Literal with Expression {
    override
    def size() = 1
  }
}