package kata.mergesort

import org.scalatest._

class MergeSortTest extends FlatSpec with Matchers with BeforeAndAfter with PrivateMethodTester {

  "Input array" should "should be sorted." in {
    val input = Array(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    val quickSort = MergeSort()
    quickSort.sort(input) should be (Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  }
}