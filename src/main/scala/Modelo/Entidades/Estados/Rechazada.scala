package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class Rechazada(override val descripcion: String = "") extends Estado {
}
