object ListEquality {
    def isEqual(list1:List[Any], list2:List[Any]): Boolean = {
        val intersect = list1.intersect(list2)
        intersect.size == list1.size && intersect.size == list2.size
    }
}