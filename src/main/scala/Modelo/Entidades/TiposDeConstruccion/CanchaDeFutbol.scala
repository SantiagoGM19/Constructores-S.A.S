package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{Material, TipoDeConstruccion}

case class CanchaDeFutbol(cemento: Cemento, grava: Grava, arena: Arena, madera: Madera, adobe: Adobe)


object CanchaDeFutbol extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 1

  override def verificarMateriales(): Boolean = ???
}