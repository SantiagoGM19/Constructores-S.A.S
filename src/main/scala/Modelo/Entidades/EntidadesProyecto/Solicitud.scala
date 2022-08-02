package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.TipoDeConstruccion
import java.time.LocalDateTime

case class Solicitud(tipoDeConstruccion: TipoDeConstruccion, coordenadas: Coordenadas, fecha: LocalDateTime)


object Solicitud{

  def verificarSolicitud(solicitud: Solicitud): Unit ={

  }
}