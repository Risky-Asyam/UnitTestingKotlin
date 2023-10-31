fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Sample(){   //Definisi nama class
    fun sum(a:Int, b:Int): Int{ //deklarasi fungsi "sum" dalam class Sample dengan parameter int a dan b
        return a + b //mengembalikan hasil penjumlahan dari a dan b
    }
}