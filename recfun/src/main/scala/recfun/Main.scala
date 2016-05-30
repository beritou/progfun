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
        if (requestRowNumber == 0) List(1)
        else if (previousRow == 0 && requestRowNumber == 1) List(1,1)
        else {
          val row = List(1)
          for (column <- 0 to previousRowNumber - 1)
            row :+ previousRow(column) + previousRow(column + 1)
          if (requestRowNumber == previousRowNumber + 1) row :+ 1
          else getRow(row :+ 1, previousRowNumber + 1, requestRowNumber)
        }
      }
      getRow(List(1), 0, r)(c)
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
