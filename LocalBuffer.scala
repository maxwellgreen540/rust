class CoreManager(state: Int = 37) {
  def decode(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 37) % 997
    }
    count
  }
}

object App extends App {
  println(new CoreManager().decode(37))
}
