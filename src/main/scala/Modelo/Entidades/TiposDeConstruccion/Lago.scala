package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class Lago(materiales: Material*)

object Lago extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2
}
