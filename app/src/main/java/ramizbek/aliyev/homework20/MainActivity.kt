package ramizbek.aliyev.homework20

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import androidx.appcompat.app.AppCompatActivity
import ramizbek.aliyev.homework20.MyObject.count
import ramizbek.aliyev.homework20.MyObject.image
import ramizbek.aliyev.homework20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (MyObject.list[count] == 1) {
            binding.like.setImageResource(R.drawable.liked)
        }
        binding.apply {
            image1.id = MyObject.image
            image1.setImageDrawable(MyObject.drawable!!)
            buttonBack.setOnClickListener {
                finish()

                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(50)
            }

            buttonLike.setOnClickListener {
                if (MyObject.list[count] == 0) {
                    like.setImageResource(R.drawable.liked)
                    MyObject.list[count] = 1
                } else {
                    like.setImageResource(R.drawable.like_huge)
                    MyObject.list[count] = 0
                }

                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(50)
            }

            buttonShare.setOnClickListener {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, "$image")
                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Share To:"))

                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(50)
            }
        }
    }


}