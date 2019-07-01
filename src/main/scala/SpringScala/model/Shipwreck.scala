package SpringScala.model

import javax.persistence.Entity

import javax.persistence.GeneratedValue

import javax.persistence.GenerationType

import javax.persistence.Id

//remove if not needed
import scala.collection.JavaConversions._

@Entity
class Shipwreck {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: java.lang.Long = _

  var name: String = _

  var description: String = _

  var condition: String = _

  var depth: java.lang.Integer = _

  var latitude: java.lang.Double = _

  var longitude: java.lang.Double = _

  var yearDiscovered: java.lang.Integer = _

  def this(id: java.lang.Long,
           name: String,
           description: String,
           condition: String,
           depth: java.lang.Integer,
           latitude: java.lang.Double,
           longitude: java.lang.Double,
           yearDiscovered: java.lang.Integer) = {
    this()
    this.id = id
    this.name = name
    this.description = description
    this.condition = condition
    this.depth = depth
    this.latitude = latitude
    this.longitude = longitude
    this.yearDiscovered = yearDiscovered
  }

  def getId(): java.lang.Long = id

  def setId(id: java.lang.Long): Unit = {
    this.id = id
  }

  def getName(): String = name

  def setName(name: String): Unit = {
    this.name = name
  }

  def getDescription(): String = description

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getCondition(): String = condition

  def setCondition(condition: String): Unit = {
    this.condition = condition
  }

  def getDepth(): java.lang.Integer = depth

  def setDepth(depth: java.lang.Integer): Unit = {
    this.depth = depth
  }

  def getLatitude(): java.lang.Double = latitude

  def setLatitude(latitude: java.lang.Double): Unit = {
    this.latitude = latitude
  }

  def getLongitude(): java.lang.Double = longitude

  def setLongitude(longitude: java.lang.Double): Unit = {
    this.longitude = longitude
  }

  def getYearDiscovered(): java.lang.Integer = yearDiscovered

  def setYearDiscovered(yearDiscovered: java.lang.Integer): Unit = {
    this.yearDiscovered = yearDiscovered
  }

}
