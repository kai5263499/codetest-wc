object Triangle {
    def determineType(a:Double, b:Double, c:Double): String = {
        // Create a list of sides so that we can use list comprehensions
        val sides = List(a, b, c)

        // We are not using the pythagoren theoreum to make sure the given sides make sense mathmatically
        sides.groupBy(identity).size match {
            case 1 => "Equilateral"
            case 2 => "Isosceles"
            case 3 => "Scalene"
        }
    }
}