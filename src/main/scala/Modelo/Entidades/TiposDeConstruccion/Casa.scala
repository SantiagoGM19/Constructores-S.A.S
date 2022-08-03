package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{ComportamientoTipoDeConstruccion, Material, TipoDeConstruccion}

case class Casa(materiales:Material*) extends TipoDeConstruccion

object Casa extends ComportamientoTipoDeConstruccion{
   override def diasDeConstruccion(): Int = 3
}
