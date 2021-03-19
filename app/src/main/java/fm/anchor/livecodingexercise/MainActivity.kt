package fm.anchor.livecodingexercise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        We have provided an object to help create a Retrofit service.
        Feel free to use it or do something else entirely!

        RetrofitServiceProvider.kt

        ------------------
        We have also provided an xml layout for rendering the list item cell.

        R.layout.album_cell
         */

        val recyclerView = findViewById<RecyclerView>(R.id.albumsRecyclerView)
    }
}
