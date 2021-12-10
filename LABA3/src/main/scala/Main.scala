object Main {
  def main(args:Array[String]):Unit = {
    println(Adts.testGetNth(List(1,2,3,4,5,6),2))
    println(Adts.testDouble(Some(5)))
    println( Adts.testIsEven(9))
    println(Adts.testSafeDivide(10,0))
    println( Adts.testGoodOldJava(_.toInt, "123"))
    println(Maps.testGroupUsers(Seq(Maps.User("Maxim", 35) , Maps.User("Nikita", 54), Maps.User("Adam", 28), Maps.User("Felix", 10))))
    println(Maps.testNumberFrodos {Map("First User" -> Maps.User("Maxim", 35), "Second User" -> Maps.User("Nikita", 54), "Third User" -> Maps.User("Adam", 28), "Fourth User" -> Maps.User("Felix", 10))})
    println(Maps.testUnderaged {Map("First User" -> Maps.User("Maxim", 35), "Second User" -> Maps.User("Nikita", 54), "Third User" -> Maps.User("Adam", 28), "Fourth User" -> Maps.User("Felix", 10))})
    println(Sequence.testLastElement(Seq(1,2,3,4,5,6)))
    println(Sequence.testZip(Seq(1,2), Seq(3,4,5,6)))
    println(Sequence.testForAll(Seq(1,2,3,4,5,6))( _ >= 3))
    println(Sequence.testPalindrom(Seq(1,2,3,2,1)))
    println(Sequence.testFlatMap(Seq(1,2,3,4,5,6))(value => Seq(value * 2)))
    println(Strings.testUppercase("aboba"))
    println(Strings.testInterpolations("Nikita", 19))
    println(Strings.testComputation(2,28))
    println(Strings.testTakeTwo("nikita"))
  }
}