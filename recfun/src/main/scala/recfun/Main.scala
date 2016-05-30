package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
    * The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum
    * of the two numbers above it. Write a function that computes the elements of Pascal’s triangle by
    * means of a recursive process.
    **
    *Do this exercise by implementing the pascal function in Main.scala, which takes a column c and a row r,
    *counting from 0 and returns the number at that spot in the triangle.
    *For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.
    *
   */
    def pascal(c: Int, r: Int): Int = {
      def getRow(previousRow:List[Int], previousRowNumber: Int, requestRowNumber: Int): List[Int] = {
        println("prevRow:" + previousRowNumber + " reqRow: " + requestRowNumber)
        println("prevList" + previousRow)
        if (requestRowNumber == 0) List(1)
        else if (requestRowNumber == 1) List(1,1)
        else if (previousRowNumber == 0) getRow(List(1,1), 1, requestRowNumber)
        else {
          val rowWithIntermediateNumbers =
            for (column <- 0 to previousRowNumber - 1)
              yield previousRow(column) + previousRow(column + 1)

          if (requestRowNumber == previousRowNumber + 1) List(1) ++ rowWithIntermediateNumbers.toList ++ List(1)
          else getRow(List(1) ++ rowWithIntermediateNumbers.toList ++ List(1), previousRowNumber + 1, requestRowNumber)
        }
      }
    println("getting row " + r + " & column " + c)
    val theRow = getRow(List(1), 0, r)
    println(theRow)
    theRow(c)
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = ???
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
