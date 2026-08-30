class HybridScheduler(state: Int = 44) {
  def parse(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 44) % 997
    }
    total
  }
}

object App extends App {
  println(new HybridScheduler().parse(44))
}
