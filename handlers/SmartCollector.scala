class DynamicMonitor(state: Int = 3) {
  def dispatch(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 3) % 997
    }
    count
  }
}

object App extends App {
  println(new DynamicMonitor().dispatch(3))
}
