import org.junit.Assert
import org.junit.Test

//sampleStart
val piTexto: String = "3.14"
val piF: Float = piTexto.toFloat()
val piD: Double = piF.toDouble()
//sampleEnd

class Conversion10 {
    @Test
    fun comprobarPI() {
        Assert.assertTrue(piTexto is String)
        Assert.assertEquals(piTexto, "3.14")
        Assert.assertTrue(piF is Float)
        Assert.assertTrue(piD is Double)
    }
}