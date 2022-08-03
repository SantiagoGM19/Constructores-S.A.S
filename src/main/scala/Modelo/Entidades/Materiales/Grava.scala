package Modelo.Entidades.Materiales

import Modelo.Traits.{ComportamientoMaterial, Material}

case class Grava(override val cantidad: Int) extends Material


object Grava extends ComportamientoMaterial{

  override def utilizarRecurso(grava: Material, cantidadParaUsar: Int): Either[String, Material] = {

    val resultado = grava.verificarCantidadRecurso(grava, cantidadParaUsar)
    val cantidadRestante = grava.cantidad - cantidadParaUsar

    resultado match {
      case Right(true) => Right(Adobe(cantidadRestante))
      case Left(false) => Left("No hay cantidad suficiente de grava para esta construccion")
    }
  }

}
