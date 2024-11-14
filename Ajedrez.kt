fun main(){
    definirPiezas(insertarTablero())
    }
fun insertarTablero():Array<CharArray> {
    var tablero = Array(8){CharArray(8){' '}}
    for (i in tablero.indices) {
        print(" \n")
       for (j in tablero.indices){
       print("[${tablero[i][j]}]")
       }
    }
    return tablero
}
fun definirPiezas(tablero:Array<CharArray>): CharArray {
    var otravez=false
    var reina="♕"
    var torre="♖"
    var alfil="♗"
    var caballo="♘"
    do {
        println(
            "\nQue pieza quieres poner?\n" +
                    "Tienes para elegir:\n" +
                    "-Reina\n" +
                    "-Torre\n" +
                    "-Alfil\n" +
                    "-Caballo"
        )
        when (readln().lowercase()) {
            "reina"-> println("♕")
            "torre"-> println("♖")
            "alfil"-> println("♗")
            "caballo"-> println("♘")
            else -> {
                println("esa pieza no esta disponible, puede que en futuras actualizaciones")
                otravez=true
            }
        }
    }
        while (otravez)
    var Preina=tablero[7][4]
    var Ptorre=tablero[7][0]
    var Palfil=tablero[7][5]
    var Pcaballo=tablero[7][1]
    var posiciones=CharArray(4){' '}
    posiciones[0]=Preina
    posiciones[1]=Ptorre
    posiciones[2]=Palfil
    posiciones[3]=Pcaballo
    return posiciones
}

fun moverFicha(tablero:Array<IntArray>,posiciones:IntArray){

}
