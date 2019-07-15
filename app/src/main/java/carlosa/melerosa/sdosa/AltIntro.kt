package carlosa.melerosa.sdosa

import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import carlosa.melerosa.sdosa.atajosteclado.InterfazMaldita

enum class Enumerado {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS
}


// Completado de ramas de when
// E1. Sitúate sobre el when y pulsa Alt + Intro para completar todas las ramas
fun completaElEnum(valor: Enumerado) {
    when (valor) {

    }
}





// De else a when
// E2. Sitúate sobre el if y pulsa Alt + Intro para convertirlo en un when y viceversa
fun podriaTenerUnWhen(valor: Enumerado) {
    if (valor == Enumerado.UNO) {

    } else if (valor == Enumerado.DOS) {

    } else if (valor == Enumerado.TRES) {

    } else if (valor == Enumerado.CUATRO) {

    } else if (valor == Enumerado.CINCO) {

    } else if (valor == Enumerado.SEIS) {

    }
}





// Implementar métodos de interfaz
// E3. Coloca el cursor sobre el nombre de la clase y pulsa Alt + Intro para implementar
// los métodos de la interfaz
//class Implementacion(): InterfazMaldita {
//
//}









// Implementar Parcelable
// E4. Coloca el cursor sobre el nombre de la clase e implementa Parcelable
// E5. Coloca el cursor sobre el nombre de la clase padre y sobrescribe todos los constructores de la clase
//private class EditTextTachable: EditText {
//
//
//
//
//
    // Suprimir advertencias
    // E6. Suprime la advertenca de "no usado"
//    fun imprimirTexto() {
//        println(text.toString())
//    }
//}





// Suprimir advertencia
// E7. Suprime la advertencia de "casting no comprobado"
fun <F> AppCompatActivity.getFragment(tag: String): F? {
    val fragment = supportFragmentManager.findFragmentByTag(tag)
    return fragment as? F
}





fun funcionDe1Parametro(unParametro: String) {

}

fun funcionQueNoDevuelveNada() { }




// Cambiar signatura

fun yoCambioCosas() {

    // E8. Coloca el cursor sobre el segundo parámetro y añádelo a la signatura
//    funcionDe1Parametro("Lala", "Lala2")


    // E9. Coloca el cursor sobre la función y cambia su tipo de retorno
//    val resultado: Double = funcionQueNoDevuelveNada()
}


// Declarar activity en Manifest
// E9. Coloca el cursor sobre la advertencia, pulsa Alt + Intro y selecciona
// "Add activity to manifest"
class ActivitySinDeclarar: AppCompatActivity()


