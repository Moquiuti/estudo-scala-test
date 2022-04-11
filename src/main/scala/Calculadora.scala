import scala.util.Try

class Calculadora {
  def soma(x: Int, y: Int) = x + y

  def subtracao(x: Int, y: Int) = x - y

  def multiplicacao(x: Int, y: Int) = x * y

  def divisao(x: Int, y: Int) = Try(x / y).getOrElse(0)

  def + = soma _

  def - = subtracao _

  def * = multiplicacao _

  def /(a: Int, b: Int) = divisao(a, b)
}
