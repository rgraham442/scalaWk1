java.util.TimeZone.getAvailableIDs
  .map(element => element.split("/"))
  .filter(element => element.length > 1)
  .flatMap(_.toList)
  .distinct
  .grouped(10)
  .toList.foreach(element => println(element.mkString("\n")))
