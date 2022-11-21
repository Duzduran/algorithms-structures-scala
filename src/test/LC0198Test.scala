import org.scalatest.funsuite.AnyFunSuite

class LC0198Test extends AnyFunSuite{
  var solution = new LC0198_HouseRobber;
  test("HouseRobberTest"){
    assert(solution.rob(Array(1, 2, 3, 1)).equals(4))
    assert(solution.rob(Array(2, 7, 9, 3, 1)).equals(12))
    assert(solution.rob(Array(2, 1, 1, 2)).equals(4))
  }
}
