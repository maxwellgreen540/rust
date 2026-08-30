class BatchParser(state: Int = 62) {
  def load(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 62) % 997
    }
    result
  }
}

object App extends App {
  println(new BatchParser().load(62))
}
