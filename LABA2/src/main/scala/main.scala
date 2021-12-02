object main {
  def main(args: Array[String]):Unit = {
    println(Compositions.testCompose((a:Int)=> a*3)((b:Int)=>b*2)((c:Int)=>Math.pow(c,2)/100)(10))
    println(Compositions.testMapFlatMap((a: Int) => Some(a.toString))((b: String) => Some(b.isBlank))((c: Boolean) => c.toString)(Some(0)))
    println(Compositions.testForComprehension((a: Int) => Some(a.toString))((b: String) => Some(!b.isBlank))((c: Boolean) => c.toString)(Some(5)))
    println(RecursiveFunctions.testReverse(Cons(1,Cons(2,Cons(3, Nil())))))
    println(RecursiveFunctions.testMap(Cons(1,Cons(2,Cons(3, Nil()))),(a:Int)=>a*2))
    println(RecursiveFunctions.testFlatMap(Cons(1,Cons(2,Cons(3, Nil()))),(a:Int)=>Cons(a*2,Nil())))
    println(RecursiveData.testListIntEmpty(Cons(1,Nil())))
    println(RecursiveData.testListIntHead(Cons(1,Nil())))
  }
}