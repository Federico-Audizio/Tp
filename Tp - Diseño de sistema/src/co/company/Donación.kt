package co.company

class Donación {

    fun donacion(gestor: Gestor){
        println("Ingrece la cantidad de donantes requeridos:")
        val cant = readLine()!!.toInt()
        var i: Int =0
        println("Lista de donantes: ")
        for(asociado in gestor.asociados ){

            if (cant != i){
                if (asociado.Donaciones == 2){
                    println("${asociado.Nombre} ${asociado.Apellido}")
                    i += 1
                }
                else {
                    if (asociado.Donaciones == 1) {
                        println("${asociado.Nombre} ${asociado.Apellido}")
                        i += 1
                    }
                }
            }
        }
    }
}