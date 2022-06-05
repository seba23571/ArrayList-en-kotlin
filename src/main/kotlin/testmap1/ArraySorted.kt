package testmap1


import com.supraweb.data.db.entities.TablaCongresoVentas


import testmap1.TestArray.itemsListVentasNew
import testmap1.TestArray.itemsListVentasNuevo

fun main() {
    val metAgregarArray = ArraySorted().metAgregarArray()
    val arraySorted = ArrayOrdenado().setArraySorted(metAgregarArray)
    arraySorted.forEach {
        println(it.toString())
    }
}
class ArrayOrdenado {
    fun setArraySorted(metAgregarArray: List<TablaCongresoVentas>): ArrayList<TablaCongresoVentas> {
        val mapValues = metAgregarArray!!.groupBy {
            it?.idCodigoDeBarra
        }
            .mapValues { entry ->
                entry.value.sumByDouble {
                    it.remarcacionResultadoFinal!!.toDouble()
                }
            }
        for (numx in mapValues) {
            for (i in itemsListVentasNew!!.indices) {
                if (itemsListVentasNew!![i].idCodigoDeBarra?.contains(numx.key.toString())!!) {
                    val division = numx.value / itemsListVentasNew!![i].remarcacionResultadoFinal!!.toDouble()
                    println("division es " + division.toInt() + " y el ide es " + numx.key)
                    itemsListVentasNew!![i].remarcacionResultadoFinal = numx.value.toString()
                    itemsListVentasNew!![i].cantidadDeProductos = division.toInt().toString()
                    itemsListVentasNuevo?.add(
                        TablaCongresoVentas(
                            itemsListVentasNew!![i].cantidadDeProductos,
                            itemsListVentasNew!![i].fechadeventas,
                            itemsListVentasNew!![i].idCodigoDeBarra,
                            itemsListVentasNew!![i].nombreDelProducto,
                            itemsListVentasNew!![i].remarcacionResultadoFinal,
                            itemsListVentasNew!![i].usuario,
                            itemsListVentasNew!![i].mail
                        )
                    )
                    break
                }
            }
        }
        return itemsListVentasNuevo!!
    }
}

class ArraySorted {
    fun metAgregarArray(): List<TablaCongresoVentas> {
        var xd = TablaCongresoVentas(
            "1",
            "fecha1",
            "123",
            "producto xd",
            "55",
            "sebas",
            "seba@supraweb.com"
        )
        var xd1 = TablaCongresoVentas(
            "1",
            "fecha1",
            "123",
            "producto xd",
            "55",
            "sebas",
            "seba@supraweb.com"
        )

        var xd2 = TablaCongresoVentas(
            "1",
            "fecha1",
            "123",
            "producto xd",
            "55",
            "sebas",
            "seba@supraweb.com"
        )
        var wd = TablaCongresoVentas(
            "1",
            "fecha1",
            "321",
            "producto wd",
            "15",
            "sebas",
            "seba@supraweb.com"
        )

        var wx = TablaCongresoVentas(
            "1",
            "fecha1",
            "111",
            "producto wx",
            "15",
            "sebas",
            "seba@supraweb.com"
        )

        var wx1 = TablaCongresoVentas(
            "1",
            "fecha1",
            "111",
            "producto wx",
            "15",
            "sebas",
            "seba@supraweb.com"
        )

        var yy = TablaCongresoVentas(
            "1",
            "fecha1",
            "yy",
            "producto yy",
            "150",
            "sebas",
            "seba@supraweb.com"
        )

        itemsListVentasNew?.add(0, xd)
        itemsListVentasNew?.add(1, xd1)
        itemsListVentasNew?.add(2, xd2)
        itemsListVentasNew?.add(3, wd)
        itemsListVentasNew?.add(4, wx)
        itemsListVentasNew?.add(4, wx1)
        itemsListVentasNew?.add(4, yy)
        return itemsListVentasNew!!
    }
}