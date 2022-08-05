package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class Rechazada(override val descripcion: String = _) extends Estado {
}
