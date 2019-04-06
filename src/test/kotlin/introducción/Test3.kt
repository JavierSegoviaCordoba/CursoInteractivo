import org.junit.Assert
import org.junit.Test

//sampleStart
val numero = 10
//sampleEnd

class Test3 {
    @Test
    fun numero() {
        Assert.assertEquals(numero, 10)
    }
}