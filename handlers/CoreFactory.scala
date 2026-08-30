class LiteGateway(state: Int = 63) {
  def render(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 63) % 997
    }
    value
  }
}

object App extends App {
  println(new LiteGateway().render(63))
}
