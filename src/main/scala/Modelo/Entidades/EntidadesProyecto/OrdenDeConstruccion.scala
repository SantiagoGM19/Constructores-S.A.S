package Modelo.Entidades.EntidadesProyecto

import Modelo.Entidades.Estados.{EnProgeso, Pendiente, Terminada}
import Modelo.Traits.Estado

import java.time.LocalDateTime

case class OrdenDeConstruccion(solicitud: Solicitud, estado: Estado, fechaInicio: LocalDateTime = null, fechaFinalizacion: LocalDateTime = null)

object OrdenDeConstruccion{

  private def cambiarEstado(ordenDeConstruccion: OrdenDeConstruccion, nuevoEstado: Estado) = {
    OrdenDeConstruccion(
      ordenDeConstruccion.solicitud,
      nuevoEstado,
      ordenDeConstruccion.fechaInicio,
      ordenDeConstruccion.fechaFinalizacion
    )
  }

  def verificarCambioDeEstado(ordenDeConstruccion: OrdenDeConstruccion): OrdenDeConstruccion = {

    val fechaActual = LocalDateTime.now()

    if((fechaActual.getHour >= 6 && fechaActual.getMinute <= 59) && (fechaActual.getHour <= 11 && fechaActual.getMinute <= 59 )){

      val fechaDeSolicitud = ordenDeConstruccion.solicitud.fecha
      val fechaActualEsMayor = fechaActual.isAfter(fechaDeSolicitud)

      val estadoNuevo = fechaActualEsMayor match {
        case true => ordenDeConstruccion.estado match {
          case Pendiente("") => EnProgeso()
        }
      }

      cambiarEstado(ordenDeConstruccion, estadoNuevo)

    }else if ((fechaActual.getHour >= 18 && fechaActual.getMinute <= 59) && (fechaActual.getHour <= 23 && fechaActual.getMinute <= 59 )){

      val esFechaDeFinalizacion = fechaActual.isEqual(ordenDeConstruccion.fechaFinalizacion)

      val estadoNuevo = esFechaDeFinalizacion match {
        case true => ordenDeConstruccion.estado match {
          case EnProgeso("") => Terminada()
        }
      }

      cambiarEstado(ordenDeConstruccion, estadoNuevo)
    }

    OrdenDeConstruccion(
      ordenDeConstruccion.solicitud,
      ordenDeConstruccion.estado,
      ordenDeConstruccion.fechaInicio,
      ordenDeConstruccion.fechaFinalizacion
    )
  }

}
