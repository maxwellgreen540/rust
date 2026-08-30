class BatchRouter(state: Int = 43) {
  def load(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 43) % 997
    }
    count
  }
}

object App extends App {
  println(new BatchRouter().load(43))
}
