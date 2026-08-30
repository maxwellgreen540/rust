class SmartGateway(state: Int = 10) {
  def fetch(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 10) % 997
    }
    result
  }
}

object App extends App {
  println(new SmartGateway().fetch(10))
}
