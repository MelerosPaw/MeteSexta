package carlosa.melerosa.sdosa

class Multicursor {

    // Ctrl + Cursor: moverse entre palabras
    // A1. Muévete entre las palabras
    val variable1: String = "Soy la variable 1"
    val variable2: String = "Tengo, signos, de, puntuación"






    // Mayús -> Selección
    // Mayús + Cursor: selección hacia una dirección
    // A2. Selecciona carácter a caracter
    val variable3: String = "Seleccióname carácter por carácter"
    val variable4: String = "Selección hacia arriba o abajo"






    // Ctrl + Mayús + Cursor: selección de palabra
    // A3. Selecciona palabra por palabra
    val variable5: String = "Seleccióname palabra por palabra"
    val variable6: String = "Tengo palabras, con signos, de, puntuación"






    // Mayús + Fin: seleccionar hasta el final
    // A4. Selecciona la línea desde el principio
    val variable7: String = "Soy la variable 7"






    // Mayús + Inicio: seleccionar hasta el principio
    // A5. Selecciona la línea desde el final
    val variable8: String = "Soy la variable 8"






    // Ctrl + Inicio/Fin: ir a inicio/fin de archivo
    // A6. Ve al principio y al final del archivo
    val variable9: String = "Vete al principio o al final"






    // Ctrl + Mayús + Inicio/Fin: seleccionar inicio hasta inicio o fin de archivo
    // A7. Selecciona hasta desde aquí hasta el principio/final del archivo
    val variable10: String = "Selecciona de aquí hacia arriba / abajo"






    // Alt + Selección con el ratón / Clone caret: selección en columna
    // A8. Selecciona todos los textos en columna y cámbialos
    val variable11: String = "Cambiame por otro texto"
    val variable12: String = "Cambiame por otro texto"
    val variable13: String = "Cambiame por otro texto"
    val variable14: String = "Cambiame por otro texto"
    val variable15: String = "Cambiame por otro texto"
    val variable16: String = "Cambiame por otro texto"
    val variable17: String = "Cambiame por otro texto"






    // Alt + Mayús + Clic: multicursor
    // A9. Posiciona un cursor antes de cada "aquí" y conviértelos en "allí".
    // A10. Con multicursor muévete al inicio, al fin y palabra por palabra
    val variable18: String = "Quiero un cursor aquí"
    val variable19: String = "Otro aquí"
    val variable20: String = "Otro cursor por aquí"









    // Selección, cortar y pegar con multicursor
    // A11. Coloca varios cursores y usar Mayús para seleccionar y reemplazar
    // todos los interrogantes por el número de la variable
    val variable21: String = "Soy la variable número ?"
    val variable22: String = "Soy la variable número ?"
    val variable23: String = "Soy la variable número ?"
    val variable24: String = "Soy la variable número ?"









    // Alt + J: seleccionar mismo
    // A12. Cambia todos los tipos a Int
    val variable25: String = "15"
    val var26: String = "2"
    val vari27: String = "12323"
    val v28: String = "43"
    val va29: String = "500"









    // A13. Cambia el género de todas las palabras
    val variable30: String = "BUENA"
    val variable31: String = "MALA"
    val variable32: String = "BUENA"
    val variable33: String = "MALA"
    val variable34: String = "BUENA"
    val variable35: String = "MALA"






    // A14. Haz que todos los tipos sean nulables
    private fun reciboNulos(entero: Int, condicion: Boolean, texto: String) {
        if (entero == null && condicion == null && texto == null) {
            println("Magnífico, todo es nulo")
        }
    }






// A15. Declarar vistas de Depuracion Activity

}