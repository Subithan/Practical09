def toUpper(str:String):String={
  str.toUpperCase()
}
def toLower(str:String):String={
  str.toLowerCase()
}
def formatNames(name:String)(format:String=>String):String={
  format(name)
}

def main(args:Array[String]):Unit={
val name1 = formatNames("Benny")(toUpper)
val name2 = formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2).toLowerCase)
val name3 = formatNames("Saman")(toLower)
val name4 = formatNames("Kumara")(name => name.take(1).toUpperCase + name.drop(1).dropRight(1).toLowerCase + name.takeRight(1).toUpperCase)
println(name1)  
println(name2) 
println(name3)
println(name4) 
}