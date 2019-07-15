fun refactorizacion() {




    // Alt + Mayús + Cursor: desplazar línea
    // C1. Mueve la siguiente línea de arriba a abajo.
    // C2. Selecciona dos lineas y el salto de línea y desplázalos de arriba a abajo.
    val lineaMovible: String = "Desplázame"
    val lineaMovible2: String = "Desplázame a mí también, que tengo envidia"











    // Ctrl + Mayús + Cursor: desplazar bloque
    // C3. Coloca el cursor sobre el "if" y mueve el bloque entero
    if (true) {
        print("Me desplazo")
    }
}











// C4. Coloca el cursor sobre la declaración del método y muévelo de arriba abajo
private fun mueveme(): Int {
    val variable1 = 1
    val variable2 = 2
    return variable1 + variable2
}











// Ctrl + Alt + F: Extracción de campos
// C5. Colócate sobre cualquiera el nombre de las siguientes variables de método
// y extráelas como variables de instancia
private fun despojame() {
    val variableQuePuedeSerUnaPropiedad: String = "¡Estoy atrapada!"
    val otraVariableQueSirveParaLoMismo: String = "¡Sácame de aquí!"

    println(variableQuePuedeSerUnaPropiedad)
    println(otraVariableQueSirveParaLoMismo)
}








// Ctrl + Alt + P: extraer a parámetro del método
// C6. Coloca el cursor sobre la constante y extráela como parámetro del método
private fun despojameOtraVez() {
    val yoEnVerdadPodriaSerRecibido: String = "¡Sácame de aquí!"
    println(yoEnVerdadPodriaSerRecibido)
}




// F5: Copiar clase, F6: Mover clase
// C7. Colócate sobre la clase "ClaseQueNoVaAquí", pulsa F5 y muévela a la misma ubicación
// pero en el paquete androidTest
