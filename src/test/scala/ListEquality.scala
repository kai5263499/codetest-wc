import org.scalatest._

class ListEqualitySpec extends FreeSpec with Matchers {
    "Two lists should be marked as" - {
        "unequal with completely different elements" in {
            ListEquality.isEqual(List(1,2,3), List(4,5,6)) should be (false)
        }
        "equal if all elements are equal" in {
            ListEquality.isEqual(List(1,2,3), List(1,2,3)) should be (true)
        }
        "unequal if second list is longer" in {
            ListEquality.isEqual(List(1,2,3), List(1,2,3,4)) should be (false)
        }
    }
}