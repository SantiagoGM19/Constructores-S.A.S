package Modelo.Entidades.Materiales

import Modelo.Traits.{ComportamientoMaterial, Material}

case class Madera(override val cantidad: Int) extends Material

object Madera extends ComportamientoMaterial{

  override def utilizarRecurso(madera: Material, cantidadParaUsar: Int): Either[String, Material] = {

    val resultado = madera.verificarCantidadRecurso(madera, cantidadParaUsar)
    val cantidadRestante = madera.cantidad - cantidadParaUsar

    resultado match {
      case Right(true) => Right(Adobe(cantidadRestante))
      case Left(false) => Left("No hay cantidad suficiente de grava para esta construccion")
    }
  }
}
