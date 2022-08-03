package Modelo.Entidades.Factories

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.Casa
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

object CasaFactory extends ConstruccionFactory{
  override def crearConstruccion(): TipoDeConstruccion = Casa(
    Cemento(100),
    Grava(50),
    Arena(90),
    Madera(20),
    Adobe(100)
  )
}
