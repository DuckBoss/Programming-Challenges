fun main(args: Array<String>) {
    if(args.size != 3) {
        println("This program requires 2 starting integers, and the max terms!")
        return
    }
    println("Program Started...")



    val start1: Int = args[0].toInt()
    val start2: Int = args[1].toInt()
    var maxCount: Int = args[2].toInt()

    if(maxCount < 2) {
        maxCount = 2
    }

    val fullList = IntArray(maxCount)
    fullList[0] = start1
    fullList[1] = start2

    for(i in 2..maxCount-1) {
        fullList[i] = fullList[i-1]+fullList[i-2]
    }

    print("Result - {")
    for(fib in fullList) {
        print(" %d".format(fib))
    }
    print(" }\n")


    println()
}
