package testmap1

import com.supraweb.data.db.entities.TablaCongresoVentas
import testmap1.TestArray.itemsListVentasNew
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println("""""""""""""""""""""""""""""""""""""""""""")
    val index = TestArray.cantidad++
    val metAgregarArray = ArgarArray().metAgregarArray()


}


object TestArray {
    var cantidad :Int = 0
    var itemsListVentasNew: ArrayList<TablaCongresoVentas>? = ArrayList()
    var itemsListVentasNuevo: ArrayList<TablaCongresoVentas>? = ArrayList()


}
class ArgarArray{

fun metAgregarArray() : List<TablaCongresoVentas>{
    var xd = TablaCongresoVentas(
        "1",
        "fecha1",
        "123",
        "producto xd",
        "55",
        "sebas",
        "seba@supraweb.com")
    var xd1 = TablaCongresoVentas(
        "1",
        "fecha1",
        "123",
        "producto xd",
        "55",
        "sebas",
        "seba@supraweb.com")

    var xd2 = TablaCongresoVentas(
        "1",
        "fecha1",
        "123",
        "producto xd",
        "55",
        "sebas",
        "seba@supraweb.com")
    var wd = TablaCongresoVentas(
        "1",
        "fecha1",
        "321",
        "producto wd",
        "15",
        "sebas",
        "seba@supraweb.com")

    var wx = TablaCongresoVentas(
        "1",
        "fecha1",
        "111",
        "producto wx",
        "15",
        "sebas",
        "seba@supraweb.com")

    var wx1 = TablaCongresoVentas(
        "1",
        "fecha1",
        "111",
        "producto wx",
        "15",
        "sebas",
        "seba@supraweb.com")

    var yy = TablaCongresoVentas(
        "1",
        "fecha1",
        "yy",
        "producto yy",
        "150",
        "sebas",
        "seba@supraweb.com")

    itemsListVentasNew?.add(0, xd)
    itemsListVentasNew?.add(1, xd1)
    itemsListVentasNew?.add(2, xd2)
    itemsListVentasNew?.add(3, wd)
    itemsListVentasNew?.add(4, wx)
    itemsListVentasNew?.add(4, wx1)
    itemsListVentasNew?.add(4, yy)

    val mutableListOf = mutableListOf(xd, xd1, xd2, wd, wx,wx1,yy)

//
//    val groupBy = mutableListOf.groupBy { it.idCodigoDeBarra }
//
//       .mapValues {                entry -> entry.value.sumByDouble { it.remarcacionResultadoFinal!!.toDouble()  }         }
//
//
//
//     for (num in groupBy){
//        println("id "+num.key+ " value "+num.value +" bingo ")
//    }
   val testa = itemsListVentasNew!!.groupBy { it?.idCodigoDeBarra }
       .mapValues {                entry -> entry.value.sumByDouble { it.remarcacionResultadoFinal!!.toDouble()  }         }
    //   .mapValues { it.value.get(0) }

 for(numx in testa){
   //  println("id.. "+numx.key+ " value.. "+numx.value +" bingo ")
     for (i in itemsListVentasNew!!.indices) {
       //  itemsListVentasNew!![i].idCodigoDeBarra?.contains(numx.key.toString())

         if(itemsListVentasNew!![i].idCodigoDeBarra?.contains(numx.key.toString())!!){
             //nuevo array list
             println("si contiene "+itemsListVentasNew!![i].nombreDelProducto +"" +
                     "y su valor es "+numx.value)
             break
         }
     }
   val xd =  itemsListVentasNew!!.any {
         objectx -> objectx.idCodigoDeBarra ==numx.key

     }



 }
//    for (i in itemsListVentasNew!!.indices) {
//        println(itemsListVentasNew!![i].nombreDelProducto?.contains(""))
//    }
    return itemsListVentasNew!!

}




}