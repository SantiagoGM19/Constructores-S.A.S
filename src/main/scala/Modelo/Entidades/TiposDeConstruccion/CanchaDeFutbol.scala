package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class CanchaDeFutbol(materiales: Material*)


object CanchaDeFutbol extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 1
}