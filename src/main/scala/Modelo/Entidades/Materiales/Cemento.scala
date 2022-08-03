package Modelo.Entidades.Materiales

import Modelo.Traits.{ComportamientoMaterial, Material}

case class Cemento(override val cantidad: Int) extends Material


object Cemento extends ComportamientoMaterial{

  override def utilizarRecurso(cemento: Material, cantidadParaUsar: Int): Either[String, Material] = {

    val resultado = cemento.verificarCantidadRecurso(cemento, cantidadParaUsar)
    val cantidadRestante = cemento.cantidad - cantidadParaUsar

    resultado match {
      case Right(true) => Right(Adobe(cantidadRestante))
      case Left(false) => Left("No hay cantidad suficiente de cemento para esta construccion")
    }
  }
}
