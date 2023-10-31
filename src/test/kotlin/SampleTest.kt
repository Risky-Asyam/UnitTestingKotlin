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