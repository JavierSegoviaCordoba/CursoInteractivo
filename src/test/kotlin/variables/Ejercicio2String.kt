import org.junit.Assert
import org.junit.Test
import kotlin.reflect.KMutableProperty

//sampleStart
val nombre: String = "Javier"
val apellido: String = "García"
var nombreCompleto = "$nombre $apellido"
//sampleEnd

class Ejercicio2String {
    @Test
    fun comprobarNombreApellidoNombreCompleto() {
        Assert.assertFalse(::nombre is KMutableProperty<*>)
        Assert.assertEquals(nombre, "Javier")

        Assert.assertFalse(::apellido is KMutableProperty<*>)
        Assert.assertEquals(apellido, "García")

        Assert.assertTrue(::nombreCompleto is KMutableProperty<*>)
        Assert.assertEquals(nombreCompleto, "Javier García")
    }
}