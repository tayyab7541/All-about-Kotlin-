fun main()
{
       var ar=mutableListOf<Int>(1,2,3,4,5,6)

      var c=C<Int>()
    println(ar)
      c.change(ar)
    println(ar)


}
class C<T>() {
    fun change(ar: MutableList<T>)
    {
        var s = ar.size-1
        for (i in 0..s) {
            if (ar[i]==2) {
                var temp = ar[i]
                ar[i] = ar[i + 1]
                ar[i + 1] = temp
                break
            }
        }
    }

}
