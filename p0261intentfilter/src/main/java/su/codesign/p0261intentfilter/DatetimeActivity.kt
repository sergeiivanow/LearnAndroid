package su.codesign.p0261intentfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.sql.Date
import java.text.SimpleDateFormat

class DatetimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datetime)
        val dateTimeText = findViewById(R.id.dateTimeText) as TextView
        val sdf = SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
        val currentDate = sdf.format(Date(System.currentTimeMillis()))
        dateTimeText.text = currentDate
    }
}