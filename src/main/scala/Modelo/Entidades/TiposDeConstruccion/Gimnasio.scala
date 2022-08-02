package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{Material, TipoDeConstruccion}

case class Gimnasio(cemento: Cemento, grava: Grava, arena: Arena, madera: Madera, adobe: Adobe)

object Gimnasio extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 2

  override def verificarMateriales(): Boolean = ???
}
