class LC0198_HouseRobber {
  def rob(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
    case ((a, b), c) => (b, Math.max(b, a + c))
  }._2
}
