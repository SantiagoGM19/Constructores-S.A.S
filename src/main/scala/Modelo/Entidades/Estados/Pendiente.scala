package Modelo.Entidades.Estados

import Modelo.Traits.Estado

case class Pendiente(faseTerminada: Boolean) extends Estado
