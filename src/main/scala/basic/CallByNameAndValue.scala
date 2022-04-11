import java.util.Calendar

/**
 * Call By Value
 *
 * @param t
 */
def printTimeMilis(t: Long): Unit = {
  println(t)
  Thread.sleep(200);
  println(t)
  Thread.sleep(200);
  println(t)
}
printTimeMilis(Calendar.getInstance().getTimeInMillis)

/**
 * Call By Name
 * utilizamos um lambda dizendo que o retorno dessa ação será um lambda
 *
 * @param t
 */
def printTimeMilisCallByName(t: => Long): Unit = {
  println(t)
  Thread.sleep(200);
  println(t)
  Thread.sleep(200);
  println(t)
}
printTimeMilisCallByName(Calendar.getInstance().getTimeInMillis)