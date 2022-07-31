package Modelo.Entidades.EntidadesProyecto

import Modelo.Traits.TipoDeConstruccion

case class Solicitud(tipoDeConstruccion: TipoDeConstruccion, coordenadas: Coordenadas, fecha: Fecha)
