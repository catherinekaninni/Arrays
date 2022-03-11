fun main(){
    name("fay","shaina","favor","kanini")
    cities()
    num()
    var y = word(arrayOf("school","church","place"))
    println(y)

}
fun name(a:String,b:String,c:String,d:String){
    var myname= arrayOf(a,b,c,d)
    println(myname.contentToString())
}
fun cities(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city->
        println(city.capitalize())
    }
}
fun num(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sorted())
}
fun word(name:Array<String>):String{
    var num = name.contentToString()
    return num

}