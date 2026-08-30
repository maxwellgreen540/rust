class AsyncResolver(state: Int = 39) {
  def dispatch(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 39) % 997
    }
    result
  }
}

object App extends App {
  println(new AsyncResolver().dispatch(39))
}
