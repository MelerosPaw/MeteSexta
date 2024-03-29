package carlosa.melerosa.sdosa

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import carlosa.melerosa.sdosa.ejemplo1.MyListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main__button__depuracion.setOnClickListener { DepuracionActivity.start(this) }
        activity_list__button.setOnClickListener { MyListActivity.start(this) }
    }
}
