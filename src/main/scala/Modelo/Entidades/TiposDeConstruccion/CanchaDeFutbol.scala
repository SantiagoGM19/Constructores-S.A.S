package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{ComportamientoTipoDeConstruccion, Material, TipoDeConstruccion}

case class CanchaDeFutbol(materiales:Material*) extends TipoDeConstruccion


object CanchaDeFutbol extends ComportamientoTipoDeConstruccion{
  override def diasDeConstruccion(): Int = 1
}