class Bob {
  def hey(input: String): String = {
    if (input.trim == "")
      "Fine. Be that way!"
    else if (input.matches("[^a-z]*[A-Z][^a-z]*"))
      "Whoa, chill out!"
    else if (input.last == '?')
      "Sure."
    else
      "Whatever."
  }
}
