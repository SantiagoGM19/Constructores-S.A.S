package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class Gimnasio(materiales: Material*)

object Gimnasio extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2
}
