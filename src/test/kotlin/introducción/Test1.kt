import org.junit.Assert
import org.junit.Test

private
//sampleStart
// El siguiente texto sería tu respuesta:
val hola = "Hola Mundo"
//sampleEnd

class Test1 {
    @Test
    fun holaMundo() {
        Assert.assertEquals(hola, "Hola Mundo")
    }
}