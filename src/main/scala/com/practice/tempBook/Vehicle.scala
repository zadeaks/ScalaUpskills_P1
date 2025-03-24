package com.practice.tempBook

case class Vehicle(val name: String, val model: String, val age: Int, val color: String) {

}

object vehicleInfo{

//  "Write a Scala expression that extracts only the vehicle names from the given
//  vehicles sequence and returns a list of names."
  def getVehicleNames(vehicles: Seq[Vehicle]): List[String] = {
    vehicles.map(vehicle => vehicle.name).toList
  }

//  Using map, generate a list of descriptions in the format: "<color> <name> <model> (<age>)
  def getListInfo(vehicles: Seq[Vehicle]) = {
    vehicles.map(v=> s"${v.color} ${v.name} ${v.model} (${v.age})").toList
  }

//  👉 Problem: The dealership wants to identify vehicles older than 2022.
  def identifyOlderVehicle(vehicles: Seq[Vehicle]) = {
    vehicles.filter(v=> v.age<2022).map(v=>v.name).toList
    }

  /*👉 Problem: Each vehicle has multiple features like Airbags, ABS, Sunroof, etc.
      The dealership has a function that takes a vehicle and returns a list of its features.*/
  def getFeatures(vehicle: Vehicle): List[String] = vehicle.name match {
    case "Honda" => List("Airbags", "ABS")
    case "Toyota" => List("Airbags", "Sunroof")
    case "Suzuki" => List("ABS", "Bluetooth")
  }

  //"Use groupBy to categorize vehicles based on the first letter of their name."

/*  Expected -
    Map(
      'H' -> List("Honda Civic"),
      'T' -> List("Toyota Corolla"),
      'S' -> List("Suzuki Swift")
    )*/

  def categVehicles(vehicles: Seq[Vehicle]) = {
//    vehicles.groupBy(_.name.head).mapValues(v=> v.na)
    vehicles.groupBy(_.name.head).view.mapValues(_.map(v => s"${v.name} ${v.model}")).toMap
  }


}

object main {
  def main(args: Array[String]): Unit = {

    val vehicles = Seq(
      new Vehicle("Honda", "Civic", 2023, "Red"),
      new Vehicle("Toyota", "Corolla", 2022, "Blue"),
      new Vehicle("Suzuki", "Swift", 2021, "Black")
    )

    val vehicleNames = vehicleInfo.getVehicleNames(vehicles)
    println(vehicleNames)

    println(vehicleInfo.getListInfo(vehicles))

    println(vehicleInfo.identifyOlderVehicle(vehicles))

    println(vehicles.flatMap(vehicleInfo.getFeatures(_)))

    println(vehicleInfo.categVehicles(vehicles))

  }
}

