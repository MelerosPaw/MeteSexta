package carlosa.melerosa.sdosa

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_depuracion.*
import java.util.*

class DepuracionActivity: AppCompatActivity() {

    private val containerTexto: LinearLayout by lazy { depuracion__container__textRoot }
    private val labelTexto: TextView by lazy { depuracion__label__texto }
    private val buttonUno: Button by lazy { depuracion__button__uno }
    private val buttonDos: Button by lazy { depuracion__button__dos }
    private val buttonTres: Button by lazy { depuracion__button__tres }
    private val buttonCuatro: Button by lazy { depuracion__button__cuatro }
    private val buttonCinco: Button by lazy { depuracion__button__cinco }
    private val buttonSeis: Button by lazy { depuracion__button__seis }
    private val buttonSiete: Button by lazy { depuracion__button__siete }
    private val buttonAleatorio: Button by lazy { depuracion__button__aleatorio }

    private var textoActual: String = ""
    private val valores: Array<String> by lazy { resources.getStringArray(R.array.valores_depuracion) }

    companion object {

        private const val RESTORE_TEXTO_ACTUAL = "TEXTO ACTUAL"

        fun start(context: Context) {
            context.startActivity(Intent(context, DepuracionActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depuracion)

        // Múltiples puntos de ruptura (Alt + J)
        // B1. Pon un punto de ruptura en cada llamada a "textoActual"
        // B2. Pon un punto de ruptura en la variable textoActual
        buttonUno.setOnClickListener {
            textoActual = getValor(0)
            cambiarTexto()
        }

        buttonDos.setOnClickListener {
            textoActual = getValor(1)
            cambiarTexto()
        }

        buttonTres.setOnClickListener {
            textoActual = getValor(2)
            cambiarTexto()
        }

        buttonCuatro.setOnClickListener {
            textoActual = getValor(3)
            cambiarTexto()
        }

        buttonCinco.setOnClickListener {
            textoActual = getValor(4)
            cambiarTexto()
        }

        buttonSeis.setOnClickListener {
            textoActual = getValor(5)
            cambiarTexto()
        }


        // F7: Step Into
        // Mayús + F8: Step Out
        // B3. Pon un punto de ruptura en la primera línea de este método y entra en el método
        // "getValor()" con F7 para seguir la depuración. Sal del método llegando al final
        // B4. Igual que el anterior pero sal del método antes de que finalice con Mayús + F8
        buttonSiete.setOnClickListener {
            textoActual = getValor(6)
            cambiarTexto()
        }

        buttonAleatorio.setOnClickListener {
            textoActual = textoAleatorio()
            cambiarTexto()
        }
    }

    private fun cambiarTexto() {
        setTransitionReady()
        labelTexto.text = textoActual
    }





    // F11: Marcar un valor
    // B5. Pon un punto de ruptura en "return valorNuevo", marca un valor y comprueba que siempre
    // pulsas el mismo boton, el valor viene marcado, pero no en otro caso
    private fun getValor(index: Int): String {
        val valorNuevo = valores[index]
        return valorNuevo
    }





    // Watches: Alt + Click y "evaluate expression"
    // B6. Pon un punto de ruptura en "return" y comprueba el valor antes de que se resuelva
    // con Alt y con "Evaluate Expression"
    // B7. En el mismo punto de ruptura, cambia el valor de "indiceAleatorio" con
    // Click secundario -> "Set Value..." o pulsando F2
    fun textoAleatorio() : String {
        val indiceAleatorio = Random().nextInt(7)
        return getValor(indiceAleatorio)
    }

    private fun setTransitionReady() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            TransitionManager.beginDelayedTransition(containerTexto)
        }
    }




    // Puntos de ruptura con condiciones
    //  ccccccccccccccccccccccB8. Pon un punto de ruptura en la línea 104, pulsa el botón secundario sobre el punto de
    // ruptura y, dentro de "Condition" indica "index == 5". Comprueba que la ejecución solo se
    // detiene en el 5.





    // Toggle breakpoint enabled: habilita inhabilita puntos de ruptura
    // B9. Igual que el anterior, pero en lugar de indicar una condición, desmarca la casilla
    // "Enabled" y comprueba que la ejecucion no se detiene mientras no esté marcada.





    // Mute breakpoints: suspender depuración temporalmente
    // B10. Depura. Suspende la depuración con el botón "Mute breakpoints" en la pestaña "5: Debug"
    // y comprueba que puedes operar con la aplicación. Vuelve a habilitar la depuración
    // y comprueba que vuelven a funcionar.





    // Terminate application: simular muerte del proceso por parte del sistema para liberar memoria.
    // B11. Navega hasta esta activity.
    // - Sal de la aplicación y vuelve a entrar -> el texto sigue siendo el mismo porque la activity
    // no se ha destruido.
    // - Vuelve a salir y pulsa "Terminate application" en el panel izquierdo de la pestaña "6: Logcat".
    // - Comprueba que el proceso está muerto en Logcat.
    // - Vuelve a la aplicación. Ahora el texto es el primero porque la aplicación ha muerto.
    // Si descomentas las líneas de abajo y repites la prueba, el texto se abrá restaurado porque
    // es persistido en el bundle a través de la muerte de la aplicación.

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
//        outState?.putString(RESTORE_TEXTO_ACTUAL, textoActual)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
//        if (savedInstanceState != null) {
//            val textoGuardado = savedInstanceState.getString(RESTORE_TEXTO_ACTUAL)
//
//            if (textoGuardado != null) {
//                textoActual = textoGuardado
//                cambiarTexto()
//            }
//        }
    }
}
