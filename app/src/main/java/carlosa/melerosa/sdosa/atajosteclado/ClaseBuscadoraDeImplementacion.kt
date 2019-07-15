package carlosa.melerosa.sdosa.atajosteclado

import carlosa.melerosa.sdosa.di.DIManager
import javax.inject.Inject

class ClaseBuscadoraDeImplementacion {

    @Inject lateinit var interfazMaldita: InterfazMaldita
    @Inject lateinit var dejadaDeLaManoDeDios: InterfazDejadaDeLaManoDeDios

    init {
        DIManager.getAppComponent().inject(this)
    }

    fun yoLlamoAMetodosDeInterfaz() {

        // Prueba la diferencia entre Ctrl + Clic (ir a declaración/uso)
        // y Ctrl + Alt + B (ir a implementación) en estos dos métodos
        interfazMaldita.metodoMaldito()
        dejadaDeLaManoDeDios.metodoDejado()
    }
}