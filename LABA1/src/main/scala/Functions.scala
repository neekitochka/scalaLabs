package exercise1

/** Напишите отдельные функции, решающие поставленную задачу.
 *
 * Синтаксис:
 * // метод
 * def myFunction(param0: Int, param1: String): Double = // тело
 *
 * // значение
 * val myFunction: (Int, String) => Double (param0, param1) => // тело
 */



object Functions {

  def main(args: Array[String]): Unit = {
    println(Functions.testCircle(4))
    println(Functions.testRectangleCurried(2,4))
    println(Functions.testRectangleUc(2,4))
  }

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */

  def areaCircle(r:Double):Double = Math.pow(r,2)*Math.PI;
  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = areaCircle(r)



  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */

  def areaRectangle(a:Double)=(b:Double)=> a*b;
  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = areaRectangle(a)(b)


  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def areaRectangleNotCurried(a:Double,b:Double)=a*b;
  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = areaRectangleNotCurried(a,b);
}