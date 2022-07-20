package su.codesign.p0261intentfilter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.sql.Date;

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.time)
        val timeText = findViewById(R.id.timeText) as TextView
        val backBtn = findViewById(R.id.back) as Button
        val sdf = SimpleDateFormat("HH:mm:ss")
        val currentTime = sdf.format(Date(System.currentTimeMillis()))
        timeText.text = currentTime

        backBtn.setOnClickListener() {
            intent.putExtra("title", "Time")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}