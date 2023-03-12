package main
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
  override def equals(that: Any): Boolean = that match {
    case other: ListNode => x == other.x && next == other.next
    case _ => false
  }
}
class LC0023_MergeKSortedLists {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists.isEmpty) return null
    mergeLists(lists)
  }

  private def mergeLists(lists: Array[ListNode]): ListNode = {
    if (lists.length == 1) return lists(0)
    val mid = lists.length / 2
    val left = mergeLists(lists.slice(0, mid))
    val right = mergeLists(lists.slice(mid, lists.length))
    merge(left, right)
  }

  private def merge(l1: ListNode, l2: ListNode): ListNode = {
    (Option(l1), Option(l2)) match {
      case (None, _) => l2
      case (_, None) => l1
      case (Some(head1), Some(head2)) =>
        if (head1.x < head2.x) {
          head1.next = merge(head1.next, head2)
          head1
        } else {
          head2.next = merge(head1, head2.next)
          head2
        }
    }
  }
}