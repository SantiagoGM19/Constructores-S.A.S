package Modelo.Entidades.EntidadesProyecto

case class ListaDeCoordenadas(coordenadas: Coordenadas*)

object ListaDeCoordenadas{

  def agregarNuevasCoordenadas(coordenadas: Coordenadas, listaDeCoordenadas: ListaDeCoordenadas): Either[String, ListaDeCoordenadas] = {
    val yaExiste = listaDeCoordenadas.coordenadas.toList.exists(punto => punto.equals(coordenadas))
    if (!yaExiste) {
      val nuevaListaDeCoordenadas = coordenadas :: listaDeCoordenadas.coordenadas.toList
      Right(ListaDeCoordenadas(nuevaListaDeCoordenadas: _*))
    } else {
      Left("Ya existe una construccion en esa coordenada")
    }
  }
}
