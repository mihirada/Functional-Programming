
object question3 {
  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }


  def main(args: Array[String]): Unit = {
    val names1 ="Benny"
    val names2 ="Niroshan"
    val names3="Saman"
    val names4="Kumara"

    println(formatNames(names1)(toUpper))
    println(formatNames(names2)(str => toUpper(str.substring(0, 2)) +toLower(str.substring(2))))
    println(formatNames(names3)(toLower))
    println(formatNames(names4)(str => toUpper(str.substring(0, 1)) +toLower(str.substring(1,5))+str.charAt(str.length - 1).toUpper))
  }


}
