package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class Casa(materiales: Material*)

object Casa extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 3
}
