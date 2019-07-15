package carlosa.melerosa.sdosa.atajosteclado

import java.lang.StringBuilder


// Cómo configurar un atajo de teclado
// File -> Settings -> Keymap -> Doble clic sobre una acción -> Add Keyboard shortcut



// Modificar los atajos
//   - "Clone caret above": Ctrl + Alt + ↑
//   - "Clone caret below": Ctrl + Alt + ↓





// Ctrl + Y: borrar línea
// D1. Borra la siguiente línea
val unused: String = "No sirvo para nada"












// Ctrl + Mayús + Alt + Arriba/Abajo: cambio siguiente, cambio anterior
// D2. Realiza varios cambios a lo largo de este archivo y muévete entre ellos






// Ctrl + Alt + Clic/B: ir a implementación
// D3. Abre "ClaseQueImplementa2" y pulsa







// Ctrl + Mayús + E: Archivos editados recientemente
// D4. Pulsa esta combinación y visualiza los últimos archivos modificados










// Ctrl + W y Ctrl + Mayñús + W: Expandir contraer selección
// D5. Expande la selección hasta determinar dónde acaba cada condición y extrae cada bloque por separado
// con Ctrl + Alt + V
fun condicionesEnrevesadas() {

    val a = 1
    val b = 15
    val concepto = false
    val comprobacion = "Calle de la Piruleta"

    if ((a > b && concepto == ((a + 10) == 12) || (comprobacion.isEmpty() && !concepto) ||
                b > 50 && (comprobacion == "No" && concepto))) {

        println("No entiendo cómo he podido llegar hasta esta línea.")
    }

}










// Ctrl + D: Duplicar líneas
// D5. Completa el else con "La condición no se cumple" duplicando la línea
// y usando Ctrl + Alt + ↓
private fun completame(condition: Boolean) {
    if (condition) {
        println("La condición se cumple")
    } else {

    }
}










// Ctrl + Q: ver definición funcional de un campo
// D6. Consulta el KotlinDoc del método invocado
private fun pasaDeMi() {
    metodoConSuKotlinDocMaravilloso(1, 4)
}










// Ctrl + P: ver parámetros de entrada.
// D7. Coloca el cursor entre los paréntesis del método y pulsa Ctrl + P para ver los parámetros de entrada
private fun consultaTipado() {
    metodoConSuKotlinDocMaravilloso(1, 4)


    // D8. Comprueba los diferentes constructores de StringBuilder
    StringBuilder()
}








// Ctrl Alt + → / ←: adelante, atrás
// D9. Pulsa Hacia atrás y comprueba todas las ubicaciones en las que has estado






// Ctrl + Mayus + E: archivos recientes
// D10. Pulsa esta combinación para ver los últimos archivos editados.






// Alt + Izda / Dcha: cambiar de pestaña
// D11. Abre más de un archivo y navega entre pestañas.











/**
 * Este método mola tela. Referencia a otro método de cualquier otra clase [String.toString].
 *
 * # Este método hace
 * Cosas tela de
 * 1. Guays
 * 1. Cañeras
 * 1. Molonas
 *
 * Mira este ejemplo:
 * ```
 * soyUnEjemplo {
 *      conCodigoDeEjemplo();
 *      return variableDeEjemplo
 * }
 * ```
 * @param parametro1 Un número
 * @param parametro2 Otro número
 * @return Devuelve `true` si [parametro1] es mayor que [parametro2].
 */

// Crl + Alt + L: formatear código
// D12. Selecciona el código y reformatéalo
private fun metodoConSuKotlinDocMaravilloso(parametro1: Int, parametro2: Int): Boolean {
    if (parametro1 > parametro2) {
                    println("El primero es mayor que el segundo")
            return true
        }
    else {
    return false
    }
}

