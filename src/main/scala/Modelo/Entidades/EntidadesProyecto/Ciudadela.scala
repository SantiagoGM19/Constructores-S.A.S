package Modelo.Entidades.EntidadesProyecto

case class Ciudadela(OrdenesDeConstruccion: List[OrdenDeConstruccion] = Nil)

object Ciudadela{

  def calcularPlazo(): Fecha = {Fecha(1,2,3)}
}