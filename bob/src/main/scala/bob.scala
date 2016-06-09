// Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
// Bob answers 'Sure.' if you ask him a question.
//
// He answers 'Whoa, chill out!' if you yell at him.
//
// He says 'Fine. Be that way!' if you address him without actually saying
// anything.
//
// He answers 'Whatever.' to anything else.


class Bob {
  def hey(input: String): String = {
    if (input.trim == "" || input == null || input == Unit) { // respond to nothing
      return "Fine. Be that way!"
    } else if (input.matches(".*[A-Z].*") && input.toUpperCase() == input) { // respond to shouting
      return "Whoa, chill out!"
    } else if (input.last == '?') { // respond to questions (shouty questions are shouty, so do this second)
      return "Sure."
    } else { // catch the rest
      return "Whatever."
    }
  }
}
