package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

import java.time.LocalDateTime

case class Ciudadela(ordenesDeConstruccion: List[OrdenDeConstruccion] = Nil)

object Ciudadela{

  //Para calcular el plazo en el que se va a terminar la ciudadela se debe saber la fecha mas alta de todas las construcciones actuales
  def calcularPlazo(ordenesDeConstruccion: List[OrdenDeConstruccion]) = {
    val fechasDeFinalizacion = ordenesDeConstruccion.map(orden => orden.fechaFinalizacion)
    val fechasOrdenadas = fechasDeFinalizacion.sortBy(_.getDayOfYear)(Ordering[Int].reverse)
    fechasOrdenadas(0)
  }

  def generarSolicitud(tipoDeConstruccion: ConstruccionFactory, coordenadas: Coordenadas, fecha: LocalDateTime) = {
    val construccion = tipoDeConstruccion.crearConstruccion()
    Solicitud(construccion, coordenadas, fecha)
  }
}