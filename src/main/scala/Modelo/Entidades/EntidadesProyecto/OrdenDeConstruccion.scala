package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.Estado

case class OrdenDeConstruccion(solicitud: Solicitud, estado: Estado, fechaInicio: Fecha = null, fechaFinalizacion: Fecha = null)

object OrdenDeConstruccion{
}
