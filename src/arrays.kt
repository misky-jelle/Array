fun main() {
    println(findProduct(arrayOf(14,2,4)))
    println(arrayOfMixedTypes(arrayOf(6.3,2.2,true,"Baseball",7,13,4.4)))
    println(arrayCharacters(arrayOf('v','e','w','i','o','u','m','z')))

}
fun findProduct(num:Array<Int>):Int {
    var multiplication = 1
    num.forEach { product ->
        multiplication *= product
    }
    return multiplication
}
fun arrayOfMixedTypes(mixed:Array<Any>):Double{
    var sum=0.0
    mixed.forEach { Any ->
        if(Any is Double)
        sum+=Any
    }
    return sum
}
fun arrayCharacters(mixedArr:Array<Char>):Int{
    var m=0
    mixedArr.forEach { c->
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            m++
        }
    }
    return m

    }
