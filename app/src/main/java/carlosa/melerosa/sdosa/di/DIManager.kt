package carlosa.melerosa.sdosa.di

object DIManager {

    private val component by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
    }

    fun getAppComponent() = component
}
