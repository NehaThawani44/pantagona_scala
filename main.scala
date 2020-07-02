import scala.collection.Seq
case class Animal(name:String, children: Seq[Animal]=Seq())

object Main {
   
  val animalTree = Animal(
    "Animalia",
    Seq(
      Animal(
        "Chordate",
        Seq(
          Animal(
            "Mammel",
            Seq(
              Animal("Primate"),
              Animal("Carnivora")
            )
          )
        )
      ),
      Animal("Arthropoda",
        Seq(
          Animal("Insect")
        )
      )
    )
  )


  def main(args: Array[String]): Unit = {
    //i understand if i pass a Mammel i should get a Seq of Primate and Carnivora
    val expectedResult = Seq(
      "Animalia",
      "Chordate",
      "Mammel",
      "Primate",
      "Carnivora",
      "Arthropoda",
      "Insect"
    )
   
     //havent defined the size 

    println(s"Expected result: $expectedResult")

    // As per the defined tree it is following a preorder and here only one case class is mentioned 

    val root :Animal = null
    val myResult: Seq[String] = null
    //base case for node with no children,here unit could be Seq() as it returns Seq
    def Seq(visit:String=>String): Seq[String] =
      { 
      
      def recur(a:Animal) { 
         
        //println(a.name)
        visit(a.name)   
        for(c <- a.children) 
          recur(c) 
        myResult + a.name
      }
     myResult + root.name  
     recur(root) 
      
      return myResult
      }
  
    
    //must get the sequences from funtion and return to result
    val result = Seq("Mammel")

    println(s"Your result: $result")

    val testPassed: Boolean = result == expectedResult

    println(s"Test passed: $testPassed")
  }
}