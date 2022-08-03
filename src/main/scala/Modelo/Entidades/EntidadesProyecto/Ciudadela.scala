package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

import java.time.LocalDateTime

case class Ciudadela(ordenesDeConstruccion: List[OrdenDeConstruccion] = Nil)

object Ciudadela{

  def calcularPlazo(ordenesDeConstruccion: List[OrdenDeConstruccion]): Unit = {
  }

  def generarSolicitud(tipoDeConstruccion: ConstruccionFactory, coordenadas: Coordenadas, fecha: LocalDateTime) = {
    val construccion = tipoDeConstruccion.crearConstruccion()
    Solicitud(construccion, coordenadas, fecha)
  }
}