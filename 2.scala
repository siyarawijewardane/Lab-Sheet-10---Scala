object TotalLetters{

    def countLetterOccurrences(words: List[String]): Int = {

        val lengths = words.map(_.length) // Transform words into their respective lengths
        val totalLength = lengths.reduce(_ + _) // Calculate the total count of letter occurrences
        totalLength
    }

    def main(args: Array[String]): Unit = {
        
        val input = List("apple", "banana", "cherry", "date")
        val output = countLetterOccurrences(input)
        println(s"Total count of letter occurrences: $output")
    }

}