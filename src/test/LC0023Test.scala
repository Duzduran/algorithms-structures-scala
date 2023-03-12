import main.{LC0023_MergeKSortedLists, ListNode}
import org.scalatest.funsuite.AnyFunSuite

class LC0023Test extends AnyFunSuite {
    val solution = new LC0023_MergeKSortedLists

    test("Empty input should return null") {
      val input = Array[ListNode]()
      val expected = null
      assert(solution.mergeKLists(input) === expected)
    }

    test("Merging one list returns the list") {
      val input = Array[ListNode](createList(Array(1, 2, 3)))
      val expected = createList(Array(1, 2, 3))
      assert(solution.mergeKLists(input) === expected)
    }

    test("Merging multiple lists returns the correct result") {
      val input = Array[ListNode](
        createList(Array(1, 4, 5)),
        createList(Array(1, 3, 4)),
        createList(Array(2, 6))
      )
      val expected = createList(Array(1, 1, 2, 3, 4, 4, 5, 6))
      assert(solution.mergeKLists(input) === expected)
    }

    private def createList(nums: Array[Int]): ListNode = {
      if (nums.isEmpty) return null
      val head = new ListNode(nums(0))
      var curr = head
      for (i <- 1 until nums.length) {
        curr.next = new ListNode(nums(i))
        curr = curr.next
      }
      head
    }
  }

