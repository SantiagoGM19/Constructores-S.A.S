package Modelo.Entidades.Factories

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.Lago
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

object LagoFactory extends ConstruccionFactory{
  override def crearConstruccion(): TipoDeConstruccion = Lago(
    Cemento(50),
    Grava(60),
    Arena(80),
    Madera(10),
    Adobe(20)
  )
}
