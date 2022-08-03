package Modelo.Entidades.Factories

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.CanchaDeFutbol
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.{Material, TipoDeConstruccion}

object CanchaDeFutbolFactory extends ConstruccionFactory{
  override def crearConstruccion(): TipoDeConstruccion = CanchaDeFutbol(
    Cemento(20),
    Grava(20),
    Arena(20),
    Madera(20),
    Adobe(20)
    )
}
