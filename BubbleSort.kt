import java.util.*

fun main(args : Array<String>)
{
  val numbers = takeInput()
  bubbleSort(numbers)
  println("The sorted array ")
  println(numbers.joinToString(separator = " "))

}

fun takeInput( ) :IntArray
{
   val scanner = Scanner(System.`in`)
   val size = scanner.nextInt()
    
  
   val numbers = IntArray(size)
   for(i in 0 until size)
   {
     numbers[i] = scanner.nextInt()
   
   }

  return numbers

}



fun bubbleSort(numbers : IntArray) 
{
    var noOfSwaps = false
    
   for(pass in 0 until (numbers.size -1))
   {
        noOfSwaps = false
     for(curpos in 1 until (numbers.size - pass - 1))
     {
    
        if(numbers[curpos-1] >   numbers[curpos])
      
        {
        //swap 
          val temp = numbers[curpos-1]
          numbers[curpos-1] = numbers[curpos]
          numbers[curpos] = temp
          noOfSwaps = true
        }
                
     
     }
      if(!noOfSwaps) break;
     
    }
   
}   
       
       




