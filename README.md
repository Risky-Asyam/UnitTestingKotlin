# UnitTestingKotlin

Unit testing in Kotlin, as in many other programming languages, is the practice of testing individual units of code in isolation to ensure that they function correctly. These individual units are typically functions, methods, or classes. Unit testing is an important part of the software development process and is essential for maintaining code quality and ensuring that changes to the codebase do not introduce regressions or new bugs.

### Open main.kt and create Sample class with the sum() function
```kotlin
class Sample(){   //Definisi nama class
    fun sum(a:Int, b:Int): Int{ //deklarasi fungsi "sum" dalam class Sample dengan parameter int a dan b
        return a + b //mengembalikan hasil penjumlahan dari a dan b
    }
```

### Create Test, Select Code | Generate | Test
Specify the name of the test class "SampleTest"

### Add Code in SampleTest.kt

```kotlin
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test //import fungsi tes
import kotlin.test.assertEquals //import fungsi assertEquals

internal class SampleTest { //deklarasi class SampleTest dengan internal yang berarti hanya diakses modul yang sama
    private val testSample: Sample = Sample() //deklarasi variabel testSample dan diinisialisasi dengan konstruktor tanpa argumen dari class Sample

    @Test
    fun testSum(){ //deklarasi fungsi testSum
        val expected = 42 // deklarasi variabel expected dengan nilai 42
        assertEquals(expected, testSample.sum(40, 2)) //pengujian menggunakan fungsi assertEquals yang membandingkan nilai variabel expected dengan hasil dari pemanggilan testSample.sum(40,2).
    }
}
```

### Run a Test
