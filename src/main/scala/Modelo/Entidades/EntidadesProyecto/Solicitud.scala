package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.TipoDeConstruccion
import java.time.LocalDateTime

case class Solicitud(tipoDeConstruccion: TipoDeConstruccion, coordenadas: Coordenadas, fecha: LocalDateTime)
