package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class EnProgeso(override val descripcion: String = "") extends Estado
