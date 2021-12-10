package exercise1

import exercise1.PatternMatching.{Paper, Rock, nemo}

import scala.jdk.FunctionWrappers.FromJavaObjDoubleConsumer

/** Напишите решение в виде функции.
 *
 * Синтаксис:
 *   val a: Int = ???
 *
 *   a match {
 *     case 0 => true
 *     case _ => false
 *   }
 */



object PatternMatching {

  def main(args: Array[String]): Unit = {
    println(PatternMatching.testIntToString(5))
    println(PatternMatching.testIsMaxAndMoritz("max"))
    println(PatternMatching.testIsEven(5))
    println(PatternMatching.testWinsA(Paper, Rock))
    println(PatternMatching.testExtractMammalWeight(nemo))
    println(PatternMatching.testUpdateFood( PatternMatching.Fish("nemo", PatternMatching.Vegetables)))
  }

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {
    val name: String
    val food: Food
  }

  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Fish(name: String, food: Food)                extends Animal
  case class Bird(name: String, food: Food)                extends Animal


  def intToString(n:Int):String={
    n match {
      case 1 => "it is one"
      case 2 => "it is two"
      case 3 => "it is three"
      case _ => "what's that"
    }
  }
  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = intToString(value);

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max
   *     "moritz" или "Moritz"
   */
  def StringToBoolean(n:String):Boolean={
    n match {
      case "max" => true
      case "Max" => true
      case "moritz" => true
      case "Moritz" => true
      case _ => false
    }
  }


  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = StringToBoolean(value);

  // c) Напишите функцию проверки является ли `value` четным

  def isEven(n:Int): Boolean = {
    n%2 match {
      case 0 => true
      case _ =>false
    }
  }


  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = isEven(value)



  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */
  def winsA(a:Hand, b:Hand):Result={
    a match {
      case Rock => b match {
        case Paper =>Lose
        case Scissor => Win
        case Rock => Draw
      }
      case Paper => b match {
        case Paper =>Draw
        case Scissor => Lose
        case Rock => Win
      }
      case Scissor => b match {
        case Paper =>Win
        case Scissor => Draw
        case Rock => Lose
      }
    }
  }

  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = winsA(a,b)



  // Примечание: используйте определение Animals

  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.
  def extractMammalWeight(animal: Animal): Int ={
    animal match {
      case animal: Mammal => animal.weight;
      case _ => -1;
    }
  }

  var nemo = Fish("nemo", Meat)
  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = extractMammalWeight(animal)


  // f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.

  def updateFood(animal: Animal):Animal = {
    animal match {
      case Fish(name, food) => Fish(name, Plants)
      case Bird(name, food) => Bird(name, Plants)
      case _ => animal
    }
  }

  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = updateFood(animal)

}