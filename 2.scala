object TotalLetters{

    def countLetterOccurrences(words: List[String]): Int = {

        val lengths = words.map(_.length) 
        val totalLength = lengths.reduce(_ + _) 
        totalLength
    }

    def main(args: Array[String]): Unit = {
        
        val input = List("apple", "banana", "cherry", "date")
        println(s"Total count of letter occurrences: "+countLetterOccurrences(input))
    }

}