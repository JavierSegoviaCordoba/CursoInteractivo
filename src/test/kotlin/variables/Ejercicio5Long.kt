import org.junit.Assert
import org.junit.Test

//sampleStart
val edadDelUniverso: Long = 432_043_200_000_000_000
// tip: val edadDelUniverso: Long = 432_043_200_000_000_000
//sampleEnd

class Ejercicio5Long {
    @Test
    fun comprobarEdadDelUniverso() {
        Assert.assertEquals(edadDelUniverso, 432043200000000000)
        Assert.assertTrue(edadDelUniverso is Long)
    }
}