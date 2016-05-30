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
   */
    def pascal(c: Int, r: Int): Int = {
      def getRow(previousRow:List[Int], previousRowNumber: Int, requestRowNumber: Int): List[Int] = {
        println("prevRow:" + previousRowNumber + " reqRow: " + requestRowNumber)
        if (requestRowNumber == 0) List(1)
        else if (requestRowNumber == 1 || previousRowNumber == 1) List(1,1)
        else {
          val row = List(1)
          for (column <- 0 to previousRowNumber - 1) {
            println("List is " + row.length + " elements long, adding one more")
            println("attempting to access this..." + previousRow)
            println("column " + column + " and column " + (column +1))
            row :+ previousRow(column) + previousRow(column + 1)
          }
          if (requestRowNumber == previousRowNumber + 1) row :+ 1
          else getRow(row, previousRowNumber + 1, requestRowNumber)
        }
      }
    println("getting row " + r + " & column " + c)
      val theRow = getRow(List(1), 0, r)
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
