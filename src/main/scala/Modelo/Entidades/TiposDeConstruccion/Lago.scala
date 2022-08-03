package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{ComportamientoTipoDeConstruccion, Material, TipoDeConstruccion}

case class Lago(materiales:Material*) extends TipoDeConstruccion

object Lago extends ComportamientoTipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2
}
