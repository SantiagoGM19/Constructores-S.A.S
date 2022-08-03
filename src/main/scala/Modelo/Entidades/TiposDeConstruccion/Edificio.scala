package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{ComportamientoTipoDeConstruccion, Material, TipoDeConstruccion}

case class Edificio(materiales:Material*) extends TipoDeConstruccion

object Edificio extends ComportamientoTipoDeConstruccion{
  override def diasDeConstruccion(): Int = 6

}
