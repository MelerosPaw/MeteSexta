package carlosa.melerosa.sdosa.di

import carlosa.melerosa.sdosa.atajosteclado.ClaseBuscadoraDeImplementacion
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(clase: ClaseBuscadoraDeImplementacion)

}