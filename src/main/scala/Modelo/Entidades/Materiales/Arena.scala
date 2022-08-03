package Modelo.Entidades.Materiales

import Modelo.Traits.{ComportamientoMaterial, Material}

case class Arena(override val cantidad: Int) extends Material


object Arena extends ComportamientoMaterial{

  override def utilizarRecurso(arena: Material, cantidadParaUsar: Int): Either[String, Material] = {
    val resultado = arena.verificarCantidadRecurso(arena, cantidadParaUsar)
    val cantidadRestante = arena.cantidad - cantidadParaUsar

    resultado match {
      case Right(true) => Right(Arena(cantidadRestante))
      case Left(false) => Left("No hay cantidad suficiente de arena para esta construccion")
    }
  }
}
