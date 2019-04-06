import org.junit.Assert
import org.junit.Test

//sampleStart
val altura: Float = 1.80f
//sampleEnd

class Ejercicio6Float {
    @Test
    fun comprobarAltura() {
        Assert.assertTrue(altura is Float)
    }
}