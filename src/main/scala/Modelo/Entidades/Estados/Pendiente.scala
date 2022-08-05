package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class Pendiente(override val descripcion: String = "") extends Estado
