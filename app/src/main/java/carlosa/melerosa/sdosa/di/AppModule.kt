package carlosa.melerosa.sdosa.di

import carlosa.melerosa.sdosa.atajosteclado.ClaseQueImplementa
import carlosa.melerosa.sdosa.atajosteclado.ClaseQueImplementa2
import carlosa.melerosa.sdosa.atajosteclado.InterfazDejadaDeLaManoDeDios
import carlosa.melerosa.sdosa.atajosteclado.InterfazMaldita
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideInterfazMaldita(): InterfazMaldita {
        return ClaseQueImplementa2()
    }

    @Provides
    fun provideInterfazPerdidaDeLaManoDeDios(): InterfazDejadaDeLaManoDeDios {
        return ClaseQueImplementa()
    }
}