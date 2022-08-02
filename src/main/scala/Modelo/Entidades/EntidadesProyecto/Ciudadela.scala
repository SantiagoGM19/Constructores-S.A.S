package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.TipoDeConstruccion

import java.time.LocalDateTime

case class Ciudadela(ordenesDeConstruccion: List[OrdenDeConstruccion] = Nil)

object Ciudadela{

  def calcularPlazo(ordenesDeConstruccion: List[OrdenDeConstruccion]): Unit = {
  }

  def generarSolicitud(tipoDeConstruccion: TipoDeConstruccion, coordenadas: Coordenadas, fecha: LocalDateTime): Either[String, Solicitud] = {
    Solicitud(tipoDeConstruccion, coordenadas, fecha)

  }
}