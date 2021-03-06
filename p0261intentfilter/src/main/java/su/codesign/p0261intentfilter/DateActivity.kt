package su.codesign.p0261intentfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.sql.Date;

class DateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date)
        val dateText = findViewById(R.id.dateText) as TextView
        val sdf = SimpleDateFormat("dd.MM.yyyy")
        val currentDate = sdf.format(Date(System.currentTimeMillis()))
        dateText.text = currentDate

    }
}