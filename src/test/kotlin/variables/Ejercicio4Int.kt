import org.junit.Assert
import org.junit.Test

//sampleStart
val edad: Int = 20
//sampleEnd

class Ejercicio4Int {
    @Test
    fun comprobarEdad() {
        Assert.assertTrue(edad is Int)
    }
}