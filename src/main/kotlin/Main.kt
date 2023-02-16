fun main(){
    var text = "AkiraChix"
    println(text[0]+" "+  (text[2])+" " +(text[3]))

   println(statement("Pauline", "25"))
    println(findlength("Codehive"))
   println(checkName("Paula"))






}

fun statement(x :String , y : String): String{
   var result = "Hi, my name is $x and I am $y years old."
    return result

}
fun findlength(name: String): Int{
var myname = "Codehive"
 return myname.length
}

fun checkName(name: String) =  if(name=="Pauline"){
    println("That's me!")
}
   else{
       println("I don't know who that is")
   }


