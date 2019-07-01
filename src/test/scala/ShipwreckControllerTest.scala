import org.junit.Assert.assertEquals

import org.hamcrest.MatcherAssert.assertThat

import org.hamcrest.Matchers._

import org.junit.Before

import org.junit.Test

import org.mockito.InjectMocks

import org.mockito.Mock

import org.mockito.MockitoAnnotations

import org.mockito.Mockito._

import SpringScala.controllers.ShipwreckController

import SpringScala.model.Shipwreck

import SpringScala.repository.ShipwreckRepository

//remove if not needed
import scala.collection.JavaConversions._

class ShipwreckControllerTest {
  @InjectMocks
  private var sc: ShipwreckController = _

  @Mock
  private var shipwreckRepository: ShipwreckRepository = _

  @Before
  def init(): Unit = {
    MockitoAnnotations.initMocks(this)
  }

  @Test
  def testShipwreckGet(): Unit = {
    val sw: Shipwreck = new Shipwreck()
    sw.setId(1l)
    when(shipwreckRepository.findById(1l).get()).thenReturn(sw)
    val wreck: Shipwreck = sc.get(1L)
    verify(shipwreckRepository).findById(1l).get()
    assertEquals(1l, wreck.getId().longValue());
    //assertThat(wreck.getId, is(1l))
  }

}
