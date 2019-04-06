import org.junit.Assert
import org.junit.Test

//sampleStart
val letra: Char = 'A'
//sampleEnd

class Ejercicio3Char {
    @Test
    fun comprobarLetra() {
        Assert.assertTrue(letra is Char)
        Assert.assertEquals(letra, 'A')
    }
}