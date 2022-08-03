package Modelo.Entidades.Factories

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.Gimnasio
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.TipoDeConstruccion

object GimnasioFactory extends ConstruccionFactory{
  override def crearConstruccion(): TipoDeConstruccion = Gimnasio(
    Cemento(50),
    Grava(25),
    Arena(45),
    Madera(10),
    Adobe(50)
  )
}
