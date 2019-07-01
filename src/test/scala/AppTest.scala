import org.junit.Test
import org.junit.Assert.assertEquals
import SpringScala.controllers.HomeController
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

//remove if not needed
import scala.collection.JavaConversions._

//@RunWith(classOf[JUnitRunner])
class AppTest {

  @Test
  def testApp() ={
    val hc = new HomeController
    val result = hc.index()

    assertEquals(result,"return blah")
  }

}
