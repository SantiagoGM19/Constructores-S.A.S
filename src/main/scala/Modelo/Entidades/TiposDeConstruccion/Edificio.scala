package Modelo.Entidades.TiposDeConstruccion

import Modelo.Traits.{Material, TipoDeConstruccion}

case class Edificio(materiales: Material*)

object Edificio extends TipoDeConstruccion{

}
