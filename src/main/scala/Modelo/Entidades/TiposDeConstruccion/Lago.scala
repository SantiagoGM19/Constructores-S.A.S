package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{Material, TipoDeConstruccion}

case class Lago(cemento: Cemento, grava: Grava, arena: Arena, madera: Madera, adobe: Adobe)

object Lago extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2

  override def verificarMateriales(): Boolean = ???
}
