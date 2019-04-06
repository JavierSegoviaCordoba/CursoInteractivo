import org.junit.Assert
import org.junit.Test

private
//sampleStart
val hola = "Hola mundo"
//sampleEnd

class HolaMundoTest2 {
    @Test
    fun holaMundo() {
        Assert.assertEquals(hola, "Hola Mundo")
    }
}