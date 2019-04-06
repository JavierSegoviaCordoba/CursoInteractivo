import org.junit.Assert
import org.junit.Test

//sampleStart
val lados: Int = 10
val ladosTexto: String = lados.toString()
//sampleEnd

class Ejercicio9Conversion {
    @Test
    fun comprobarLados() {
        Assert.assertTrue(lados is Int)
        Assert.assertTrue(ladosTexto is String)
    }
}