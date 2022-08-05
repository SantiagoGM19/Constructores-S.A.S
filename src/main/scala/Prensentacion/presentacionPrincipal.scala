package Prensentacion

object presentacionPrincipal {

  def main(args: Array[String]): Unit = {
    mostrarMenu()
  }

  def mostrarMenu(opcion: Int = 0): Unit ={
    if(opcion != 4) {
      println("                                   BIENVENIDO A LA CIUDADELA DEL FUTURO")
      println("1.Solicitar una solución")
      println("2.Ver fecha de terminación de la ciudadela")
      println("3.Ver informe de construcciones")
      println("4. Salir")
      println("Elije una opcion")
      val opcionInterna = scala.io.StdIn.readInt()
      opcion match {
        case 1 => solicitarConstruccion()
        case 2 => verFechaDeTerminacion()
        case 3 => verInforme()
        case _ => println("Por favor selecciona una opción existente")
      }
      mostrarMenu(opcionInterna)
    }else{
      println("Hasta pronto!")
    }
  }

  def solicitarConstruccion(): Unit ={
    println("construccion solicitada")
  }

  def verFechaDeTerminacion() = {
    println("esta es la fecha --->")
  }

  def verInforme() = {
    println("Este es el informe --->")
  }

}
