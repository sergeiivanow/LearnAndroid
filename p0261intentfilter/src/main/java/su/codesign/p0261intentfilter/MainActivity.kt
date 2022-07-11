package su.codesign.p0261intentfilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = findViewById(R.id.date) as Button
        val time = findViewById(R.id.time) as Button

        date.setOnClickListener {
            val intent = Intent("su.codesign.action.DATE")
            startActivity(intent)
        }

        time.setOnClickListener {
            val intent = Intent("su.codesign.action.TIME")
            startActivity(intent)
        }
    }
}