  //  - Earth: orbital period 365.25 Earth days, or 31557600 seconds
  //  - Mercury: orbital period 0.2408467 Earth years
  //  - Venus: orbital period 0.61519726 Earth years
  //  - Mars: orbital period 1.8808158 Earth years
  //  - Jupiter: orbital period 11.862615 Earth years
  //  - Saturn: orbital period 29.447498 Earth years
  //  - Uranus: orbital period 84.016846 Earth years
  //  - Neptune: orbital period 164.79132 Earth years

object SpaceAge {
  val yearInSecondsOn: Map[String, Double] = Map(
    "Earth" -> 31557600,
    "Mercury" -> (0.2408467 * 31557600),
    "Venus" -> (0.61519726 * 31557600),
    "Mars" -> (1.8808158 * 31557600),
    "Jupiter" -> (11.862615 * 31557600),
    "Saturn" -> (29.447498 * 31557600),
    "Uranus" -> (84.016846 * 31557600),
    "Neptune" -> (164.79132 * 31557600)
  )

  def apply(seconds:Int): SpaceAge = new SpaceAge(seconds)
}

class SpaceAge(s: Int) {
  val seconds = s
  val onEarth = s/(SpaceAge.yearInSecondsOn("Earth"))
}
