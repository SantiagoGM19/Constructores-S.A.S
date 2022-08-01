package Modelo.Entidades.EntidadesProyecto

case class Fecha(dia: String, mes: String, anio: String)

object Fecha{

  def toString(fecha: Fecha) : String = {
    fecha.dia + " - " + fecha.mes + " - " + fecha.anio
  }
}
