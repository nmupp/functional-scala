/**
  * Created by nmupp on 8/3/16.
  */
object EitherPractice {

  def divide(dividend:Int, divider:Int):Either[Exception,Int] = {
    try Right(dividend/divider)
    catch {
      case ex:Exception => Left(ex)
    }
  }

  divide(10,0) match {
    case Right(v) => v
    case Left(e) => e.getMessage
  }

}
