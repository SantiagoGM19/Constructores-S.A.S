package Modelo.Entidades.TiposDeConstruccion

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Traits.{Material, TipoDeConstruccion}

case class Casa(cemento: Cemento, grava: Grava, arena: Arena, madera: Madera, adobe: Adobe)

object Casa extends TipoDeConstruccion{
  override def diasDeConstruccion(): Int = 3

  override def verificarMateriales(casa: Casa): Boolean = {
    val cantidadCemento = casa.cemento.cantidad
    val cantidadGrava = casa.cemento.cantidad
    val cantidadArena = casa.arena.cantidad
    val cantidadMadera = casa.madera.cantidad
    val cantidadAdobe = casa.adobe.cantidad


  }
}
