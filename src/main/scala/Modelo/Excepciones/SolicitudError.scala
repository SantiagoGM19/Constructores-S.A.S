package Modelo.Excepciones

case class SolicitudError(override val descripcion: String) extends ErrorNegocio
