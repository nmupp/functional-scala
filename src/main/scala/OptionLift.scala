/**
  * Created by nmupp on 8/1/16.
  */
object OptionLift {

  def sum(a:Int, b:Int) = a + b

  def map2[A,B,C](a:Option[A],b:Option[B])(f:(A,B) => C):Option[C] = {
    a.flatMap {
      (aValue) => {
        b.map {
          (bValue) => f(aValue,bValue)
        }
      }
    }
  }
  map2(Some(10),Some(10))(sum)

}
