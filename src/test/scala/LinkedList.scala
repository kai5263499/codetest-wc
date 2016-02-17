import org.scalatest._

class LinkedListSpec extends FreeSpec with Matchers {
    val list = Node(1,Node(2,Node(3,Node(4,Node(5,Node(6,null))))))
    "A helper function should return" - {
        "2 as the 5th last element" in {
            LinkedList.nthFromEnd(5,list).value shouldEqual 2
        }
        "3 as the 4th last element" in {
            LinkedList.nthFromEnd(4,list).value shouldEqual 3
        }
        "4 as the 3rd last element" in {
            LinkedList.nthFromEnd(3,list).value shouldEqual 4
        }
        "5 as the 2nd last element" in {
            LinkedList.nthFromEnd(2,list).value shouldEqual 5
        }
    }
}