package carlosa.melerosa.sdosa.ejemplo1

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import carlosa.melerosa.sdosa.R

class ListActivity : Activity(){
    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        setContentView(R.layout.activity_list)
        return super.onCreateView(name, context, attrs)
    }
}