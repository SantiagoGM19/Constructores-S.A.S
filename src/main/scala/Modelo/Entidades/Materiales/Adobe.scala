package Modelo.Entidades.Materiales

import Modelo.Traits.{ComportamientoMaterial, Material}

case class Adobe(override val cantidad: Int) extends Material

object Adobe extends ComportamientoMaterial{

  override def utilizarRecurso(adobe: Material, cantidadParaUsar: Int): Either[String, Material] = {

    val resultado = adobe.verificarCantidadRecurso(adobe, cantidadParaUsar)
    val cantidadRestante = adobe.cantidad - cantidadParaUsar

    resultado match {
      case Right(true) => Right(Adobe(cantidadRestante))
      case Left(false) => Left("No hay cantidad suficiente de adobe para esta construccion")
    }
  }
}
