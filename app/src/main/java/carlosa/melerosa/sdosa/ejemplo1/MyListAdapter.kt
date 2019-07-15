package carlosa.melerosa.sdosa.ejemplo1

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import carlosa.melerosa.sdosa.R
import kotlinx.android.synthetic.main.animal_list_item.view.*

//useless context
class MyListAdapter(val items: ArrayList<Animal>, val context: Context) : RecyclerView.Adapter<MyViewHolder>() {

    // Gets the number of animals in the list. useless comment to example
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views. useless comment to example
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //alt enter fix all
        if (items.get(position).type != null) {
            holder.tvAnimalType.text = items.get(position).type
            holder.tvAnimalType.visibility = View.VISIBLE
        } else {
            holder.tvAnimalType.visibility = View.GONE
        }

        if (items.get(position).specie != null) {
            holder.tvAnimalSpecie.text = items.get(position).specie
            holder.tvAnimalSpecie.visibility = View.VISIBLE
        } else {
            holder.tvAnimalSpecie.visibility = View.GONE
        }
    }
}

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to. useless comment to delete
    val viewRoot: ConstraintLayout = view.view_root
    val tvAnimalType: TextView = view.tv_animal_type
    val tvAnimalSpecie: TextView = view.tv_animal_specie
    val ivAnimal: ImageView = view.iv_animal
}