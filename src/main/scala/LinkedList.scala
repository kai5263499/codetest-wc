case class Node(value: Int, next: Node)

object LinkedList {
    def nthFromEnd(n:Integer, node: Node): Node = {
        // Initialize two node pointers
        var p1 = node
        var p2 = node

        // Fast forward the desired amount
        // Assumes list has n+1 elements
        for (_ <- 1 to (n-1)) {
            if(p1.next != null) {
                p1 = p1.next
            }
        }

        // Step through the list to the end, advancing both node pointers
        while(p1.next != null) {
            p1 = p1.next
            p2 = p2.next
        }

        // Return the delayed or nth element
        p2
    }
}