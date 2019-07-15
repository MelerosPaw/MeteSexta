package carlosa.melerosa.sdosa.ejemplo1

import android.view.View

object ViewUtils {
    fun setVisible(visible: Boolean, view: View) {
        if (visible) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }
}