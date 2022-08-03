package Modelo.Entidades.EntidadesProyecto

import Modelo.Entidades.Materiales.{Adobe, Arena, Cemento, Grava, Madera}
import Modelo.Entidades.TiposDeConstruccion.{CanchaDeFutbol, Casa, Edificio, Gimnasio, Lago}
import Modelo.Traits.FactoryTraits.ConstruccionFactory
import Modelo.Traits.{Material, TipoDeConstruccion}

import java.time.LocalDateTime

case class Solicitud(tipoDeConstruccion: TipoDeConstruccion, coordenadas: Coordenadas, fecha: LocalDateTime)


object Solicitud{

  def sondearSolicitud(solicitud: Solicitud, listaDeCoordenadas: ListaDeCoordenadas, materiales: List[Material]): Unit = {

    val construccionSolicitada = solicitud.tipoDeConstruccion
    val coordenadasSolicitadas = solicitud.coordenadas

    val existenRecursosSuficientes =
      construccionSolicitada match {
        case Casa() => verificarRecursosParaUtilizar(100, 50, 90, 20, 100, materiales)
        case Lago() => verificarRecursosParaUtilizar(50,60,80,10,20, materiales)
        case CanchaDeFutbol() => verificarRecursosParaUtilizar(20,20,20,20,20, materiales)
        case Edificio() => verificarRecursosParaUtilizar(200,100,180,40,200, materiales)
        case Gimnasio() => verificarRecursosParaUtilizar(50,25,45,10,50, materiales)
      }

    if(existenRecursosSuficientes){
      val resultadoCoordenadas =  ListaDeCoordenadas.agregarNuevasCoordenadas(coordenadasSolicitadas, listaDeCoordenadas)
      resultadoCoordenadas match {
        case Right(value) =>
      }
    }
  }

  def verificarRecursosParaUtilizar(cemento: Int, grava: Int, arena: Int, madera: Int, adobe: Int, materiales: List[Material]) = {
    val listaDeMateriales = materiales

    val resultadoCemento = Cemento.utilizarRecurso(listaDeMateriales(0), cemento)
    val resultadoGrava = Grava.utilizarRecurso(listaDeMateriales(1), grava)
    val resultadoArena = Arena.utilizarRecurso(listaDeMateriales(2), arena)
    val resultadoMadera = Madera.utilizarRecurso(listaDeMateriales(3), madera)
    val resultadoAdobe = Adobe.utilizarRecurso(listaDeMateriales(4), adobe)

    val resultados = List(resultadoCemento, resultadoGrava, resultadoArena, resultadoMadera, resultadoAdobe)

    val resultadoFallidos = resultados.map(resultado => resultado.isLeft).filter(booleano =>  booleano == true)

    resultadoFallidos.isEmpty
  }

  def aprobarSolicitud() = {

  }

  def rechazarSolicitud() = {

  }
}