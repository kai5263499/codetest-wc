import org.scalatest._

class TriangleSpec extends FreeSpec  with Matchers{
    "A set of numbers should correctly label" - {
        "an equal set of sides as equilateral" in {
            Triangle.determineType(15,15,15) shouldEqual "Equilateral"
        }
        "two equal sides as isosceles" in {
            Triangle.determineType(100,100,141) shouldEqual "Isosceles"
        }
        "no equal sides as scalene" in {
            Triangle.determineType(1,2,3) shouldEqual "Scalene"
        }
    }
}