import org.junit.Assert
import org.junit.Test
import kotlin.reflect.KMutableProperty

//sampleStart
val holaMundo: String = "Hola Mundo"
//sampleEnd

class Ejercicio1String {
    @Test
    fun comprobarVariableSoloLectura() {
        Assert.assertFalse(::holaMundo is KMutableProperty<*>)
        Assert.assertEquals(holaMundo, "Hola Mundo")
    }
}