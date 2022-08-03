package Modelo.Traits.FactoryTraits

import Modelo.Traits.{Material, TipoDeConstruccion}

trait ConstruccionFactory {
  def crearConstruccion(): TipoDeConstruccion
}
