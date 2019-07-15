package carlosa.melerosa.sdosa.ejemplo1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import carlosa.melerosa.sdosa.R
import kotlinx.android.synthetic.main.activity_list.*

open class MyListActivity : AppCompatActivity() {

    val animals: ArrayList<Animal> = ArrayList()


    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MyListActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // Loads animals into the ArrayList
        addAnimals()
        // Creates a vertical Layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
//        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        recyclerView.adapter = MyListAdapter(animals, this)
    }

    fun addAnimals() {
        animals.add(Animal("dog", "unknown", 0))
        animals.add(Animal("cat", "unknown", 1))
        animals.add(Animal("owl", "unknown", 2))
        animals.add(Animal("cheetah", "unknown", 3))
        animals.add(Animal("raccoon", "unknown", 4))
        animals.add(Animal("bird", "unknown", 5))
        animals.add(Animal("snake", "unknown", 6))
        animals.add(Animal("lizard", "unknown", 7))
        animals.add(Animal("hamster", "unknown", 8))
        animals.add(Animal("bear", "unknown", 91))
        animals.add(Animal("lion", "unknown", 10))
        animals.add(Animal("tiger", "unknown", 11))
        animals.add(Animal("horse", "unknown", 12))
        animals.add(Animal("frog", "unknown", 13))
        animals.add(Animal("fish", "unknown", 14))
        animals.add(Animal("shark", "unknown", 15))
        animals.add(Animal("turtle", "unknown", 16))
        animals.add(Animal("elephant", "unknown", 17))
        animals.add(Animal("cow", "unknown", 18))
        animals.add(Animal("beaver", "unknown", 19))
        animals.add(Animal("easter egg", "unknown", 20))
        animals.add(Animal("bison", "unknown", 21))
        animals.add(Animal("porcupine", "unknown", 22))
        animals.add(Animal("rat", "unknown", 23))
        animals.add(Animal("mouse", "unknown", 24))
        animals.add(Animal("goose", "unknown", 25))
        animals.add(Animal("melero", "unknown", 26))
        animals.add(Animal("deer", "unknown", 27))
        animals.add(Animal("fox", "unknown", 28))
        animals.add(Animal("moose", "unknown", 29))
        animals.add(Animal("moose", "unknown", 30))
        animals.add(Animal("buffalo", "unknown", 31))
        animals.add(Animal("monkey", "unknown", 32))
        animals.add(Animal("penguin", "unknown", 33))
        animals.add(Animal("parrot", "unknown", 34))
    }
}