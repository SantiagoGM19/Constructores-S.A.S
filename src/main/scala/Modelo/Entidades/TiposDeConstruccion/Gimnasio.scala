package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{ComportamientoTipoDeConstruccion, Material, TipoDeConstruccion}

case class Gimnasio(materiales:Material*) extends TipoDeConstruccion

object Gimnasio extends ComportamientoTipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2
}
