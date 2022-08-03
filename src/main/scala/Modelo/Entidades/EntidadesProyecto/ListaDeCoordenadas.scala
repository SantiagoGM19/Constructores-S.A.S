package Modelo.Entidades.EntidadesProyecto

case class ListaDeCoordenadas(coordenadas: Coordenadas*)

object ListaDeCoordenadas{

  def agregarNuevasCoordenadas(coordenadas: Coordenadas, listaDeCoordenadas: ListaDeCoordenadas): Either[String, ListaDeCoordenadas] = {
    val yaExiste = listaDeCoordenadas.coordenadas.toList.exists(punto => punto.equals(coordenadas))
    if (!yaExiste) {
      Right(ListaDeCoordenadas(listaDeCoordenadas.coordenadas: _*, coordenadas))
    } else {
      Left("Ya existe una construccion en esa coordenada")
    }
  }
}
