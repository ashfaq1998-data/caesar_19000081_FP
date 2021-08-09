

object caesar extends App {
  
   println("Please type the letter : ")
    val letter = scala.io.StdIn.readLine()
    
    val Encrypt = (c:Char, index:Int, a:String) => a((a.indexOf(c.toUpper)+index) % a.size)
    
     val Decrypt = (c:Char, index:Int, a:String) => a((a.indexOf(c.toUpper)-index) % a.size)
     
     val cipher = (algo: (Char,Int,String) => Char, s:String, index:Int, a:String) => s.map(algo(_,index,a))
     
     
     println("Please do the Encryption first")
     
     println("Type the letter you want to encrypt")
     var x =  scala.io.StdIn.readLine()
     println("Type the position of letter you want to replace")
     var y =  scala.io.StdIn.readInt()
     
     var ct = cipher(Encrypt, x, y, letter)
     println("The letter that going to replace "+ x + " is "+ ct)
     
     println("Do you want to Decrypt it")
     
     var a = scala.io.StdIn.readLine()
     
     if(a == "yes"){
       var pt = cipher(Decrypt, ct, y, letter)
       println("Orginal character is " + pt)
     }
     else{
       println("Sorry Invalid Input")
     }
     
     
     
     
}