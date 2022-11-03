import org.scalatest.funsuite.AnyFunSuite

class LC0001Test extends AnyFunSuite {
  val solution = new LC0001_TwoSum;

  test("Two sum tests") {
    assert(solution.twoSum(Array(2, 7, 11, 15), 9) sameElements Array(0, 1))
    assert(solution.twoSum(Array(2, 7, 11, 15), 18) sameElements Array(1, 2))
    assert(solution.twoSum(Array(3,2,4), 6) sameElements Array(1, 2))
  }

}
