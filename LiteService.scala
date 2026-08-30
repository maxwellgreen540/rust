class SimpleEngine(state: Int = 11) {
  def render(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 11) % 997
    }
    total
  }
}

object App extends App {
  println(new SimpleEngine().render(11))
}
