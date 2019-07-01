package SpringScala.controllers

import java.util
import java.util.List

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, RequestBody, RequestMapping, RequestMethod, RestController}
import SpringScala.model.Shipwreck
import SpringScala.controllers.ShipwreckStub
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import SpringScala.repository.ShipwreckRepository

@RestController
@RequestMapping(Array("api/v1/"))
class ShipwreckController {

  @Autowired
  private var shipwreckRepository: ShipwreckRepository = _

  @RequestMapping(value = Array("shipwrecks"),method = Array(RequestMethod.GET))
  def list():util.List[Shipwreck] = {
    shipwreckRepository.findAll()
  }

  @RequestMapping(value = Array("shipwrecks"), method = Array(RequestMethod.POST))
  def create(@RequestBody shipwreck: Shipwreck): Shipwreck =
    shipwreckRepository.saveAndFlush(shipwreck)


  @RequestMapping(value = Array("shipwrecks/{id}"),method = Array(RequestMethod.GET))
  def get(@PathVariable id:Long):Shipwreck = {
    shipwreckRepository.findById(id).get()
  }


  @RequestMapping(value = Array("shipwrecks/{id}"), method = Array(RequestMethod.PUT))
  def update(@PathVariable id: java.lang.Long, @RequestBody shipwreck: Shipwreck): Shipwreck = {
    val existingShipwreck: Shipwreck = shipwreckRepository.findById(id).get()
    BeanUtils.copyProperties(shipwreck, existingShipwreck)
    shipwreckRepository.saveAndFlush(existingShipwreck)
  }

  @RequestMapping(value = Array("shipwrecks/{id}"), method = Array(RequestMethod.DELETE))
  def delete(@PathVariable id: java.lang.Long): Shipwreck = {
    val existingShipwreck: Shipwreck = shipwreckRepository.findById(id).get()
    shipwreckRepository.delete(existingShipwreck)
    existingShipwreck
  }

}
