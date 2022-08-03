package Modelo.Entidades.Factories

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.Edificio
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

object EdificioFactory extends ConstruccionFactory{
  override def crearConstruccion(): TipoDeConstruccion = Edificio(
    Cemento(200),
    Grava(100),
    Arena(180),
    Madera(40),
    Adobe(200)
  )
}
