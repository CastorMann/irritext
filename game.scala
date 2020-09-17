import scala.io.StdIn.readInt
import scala.util.Random
import scala.util.control.Breaks._
object Irritext {
    def main(args: Array[String]): Unit = {
        println("Hello and welcome to 'What number is this!?'\n")

        var score = 0
        var a = Random.nextInt(10)
        var b = Random.nextInt(10)
        
        breakable {
        while (true) {

            println(s"If the number $a is the number $b, then what is the number ${Random.nextInt(10)}!? ")
            var guess = readInt()

            if (guess == a) {

                println(s"Correct... Your score is $score points.")
                break
            }

            else {

                println("Wrong...")
                score -= Random.nextInt(10)
            }
            b = a
            a = Random.nextInt(10)
            }
        }
    }
}