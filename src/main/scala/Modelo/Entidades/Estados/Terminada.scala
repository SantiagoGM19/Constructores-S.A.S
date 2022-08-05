package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class Terminada(override val descripcion: String = _) extends Estado