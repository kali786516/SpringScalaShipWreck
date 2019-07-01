package SpringScala.controllers

import java.util
import java.util.{ArrayList, HashMap, List}
import scala.collection.JavaConversions._


import SpringScala.model._

class ShipwreckStub(wrecks:HashMap[Long, Shipwreck],idIndex:Long=3L)

object ShipwreckStub {

   val wrecks:HashMap[Long,Shipwreck] = new HashMap[Long,Shipwreck]()
   var idIndex:Long = 3L


    var a:Shipwreck = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994)
    wrecks.put(1L,a)
    val b:Shipwreck  = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994)
    wrecks.put(2L, b)
    val c:Shipwreck =  new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994)
    wrecks.put(3L, c)


  def list: util.List[Shipwreck] = {
    new util.ArrayList[Shipwreck](wrecks.values)
  }

  def create(wreck:Shipwreck):Shipwreck ={
    idIndex += idIndex
    wreck.setId(idIndex)
    wrecks.put(idIndex, wreck)
    return wreck
  }

  def get(id:Long):Shipwreck = {
    wrecks.get(id)
  }

  def update(id:Long,wreck:Shipwreck)={
    wrecks.put(id,wreck)
    wreck
  }

  def delete(id:Long):Shipwreck ={
    wrecks.remove(id)
  }

}
