package Modelo.Traits

trait Material{
  val cantidad: Int

  def verificarCantidadRecurso(material: Material, cantidadParaUsar:Int): Either[Boolean, Boolean] = {
    val cantidadRestante = material.cantidad - cantidadParaUsar

    if(cantidadRestante >= 0){
      Right(true)
    }else{
      Left(false)
    }
  }
}