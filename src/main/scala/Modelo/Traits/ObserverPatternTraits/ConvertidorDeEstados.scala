package Modelo.Traits.ObserverPatternTraits

trait ConvertidorDeEstados[T] {

  val observadores: List[T]

  def notificar(): Unit
}
