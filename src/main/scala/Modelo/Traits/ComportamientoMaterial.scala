package Modelo.Traits

trait ComportamientoMaterial {

  def utilizarRecurso(material: Material, cantidadParaUsar: Int): Either[String, Material]

}
