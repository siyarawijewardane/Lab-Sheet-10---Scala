object TemperatureConverter {
  def calculateAverage(temperatures: List[Double]): Double = {

    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce((total, temp) => total + temp)
    val averageFahrenheit = totalFahrenheit / temperatures.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    
    val inputTemperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
