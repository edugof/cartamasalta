package carta.fluxxy.com.cartamasalta

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newCard(view: View) {
        val card = Card.values()[rand(0, 2)]

        println(card)

        val uri = "@drawable/$card" // where myresource (without the extension) is the file
        val imageResource = resources.getIdentifier(uri, null, packageName)
        val res = resources.getDrawable(imageResource)
        myCardView.setImageDrawable(res)
    }
}
