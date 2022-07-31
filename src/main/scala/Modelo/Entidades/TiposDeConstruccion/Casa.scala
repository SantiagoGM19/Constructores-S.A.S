package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class Casa(materiales: Material*)

object Casa extends TipoDeConstruccion{

}
