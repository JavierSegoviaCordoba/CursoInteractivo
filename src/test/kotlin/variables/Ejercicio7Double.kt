import org.junit.Assert
import org.junit.Test

//sampleStart
val pi: Double = 3.14159265359
//sampleEnd

class Ejercicio7Double {
    @Test
    fun comprobarPI() {
        Assert.assertEquals(pi, 3.14159265359, 0.0)
        Assert.assertTrue(pi is Double)
    }
}