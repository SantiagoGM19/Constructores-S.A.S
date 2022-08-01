package Modelo.Entidades.EntidadesProyecto

import java.time.LocalDateTime

case class Ciudadela(ordenesDeConstruccion: List[OrdenDeConstruccion] = Nil)

object Ciudadela{

  def calcularPlazo(ordenesDeConstruccion: List[OrdenDeConstruccion]): Unit = {
  }

  def verificarHorario(ordenesDeConstruccion: List[OrdenDeConstruccion]) = {

  }
}