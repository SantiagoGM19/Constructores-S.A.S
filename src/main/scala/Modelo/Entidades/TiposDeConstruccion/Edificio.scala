package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{Material, TipoDeConstruccion}

case class Edificio(cemento: Cemento, grava: Grava, arena: Arena, madera: Madera, adobe: Adobe)

object Edificio extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 6

  override def verificarMateriales(): Boolean = ???
}
