class RemoteContext(state: Int = 80) {
  def flush(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 80) % 997
    }
    value
  }
}

object App extends App {
  println(new RemoteContext().flush(80))
}
