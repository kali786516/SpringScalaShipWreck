package SpringScala.repository

import org.springframework.data.jpa.repository.JpaRepository

import SpringScala.model.Shipwreck

//remove if not needed
import scala.collection.JavaConversions._

trait ShipwreckRepository extends  JpaRepository[Shipwreck,Long]