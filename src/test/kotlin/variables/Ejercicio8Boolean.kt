import org.junit.Assert
import org.junit.Test

//sampleStart
val cocheRojo: Boolean = true
val cocheVerde: Boolean = false
//sampleEnd

class Ejercicio8Boolean {
    @Test
    fun comprobarCoches() {
        Assert.assertTrue(cocheRojo)
        Assert.assertFalse(cocheVerde)
    }
}