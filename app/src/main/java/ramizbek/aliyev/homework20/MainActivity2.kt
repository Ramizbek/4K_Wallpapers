package ramizbek.aliyev.homework20

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import ramizbek.aliyev.homework20.MainActivity2.dialogShow.dialogCancel
import ramizbek.aliyev.homework20.adapter.Adapter
import ramizbek.aliyev.homework20.databinding.ActivityMain2Binding
import ramizbek.aliyev.homework20.databinding.AppBarMainBinding

class MainActivity2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: ActivityMain2Binding
    lateinit var adapter: Adapter
    lateinit var list: ArrayList<String>

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        smsDialog(this)

        binding.apply {
            findViewById<ImageView>(R.id.menu_bar).setOnClickListener {
                drawerLayout.openDrawer(Gravity.START)
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(50)
            }
            navView.itemIconTintList = null

            list = ArrayList()
            list.add("All")
            list.add("New")
            list.add("Animals")
            list.add("Technology")
            list.add("Nature")
            list.add("Favourites")
// NavigationVIwBottonNavigation
            myBottomNav.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_like -> {
                        tvName.text = "Like"
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                    }
                    R.id.menu_popular -> {
                        tvName.text = "Popular"
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                    }
                    R.id.menu_random -> {
                        tvName.text = "Random"
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                    }
                    R.id.menu_home -> {
                        tvName.text = "Home"
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                    }
                }
                true
            }

            //
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_home1 -> {
                        myBottomNav.selectedItemId = R.id.menu_home
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                        drawerLayout.closeDrawers()
                    }
                    R.id.menu_popular1 -> {
                        myBottomNav.selectedItemId = R.id.menu_popular
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                        drawerLayout.closeDrawers()

                    }
                    R.id.menu_random1 -> {
                        myBottomNav.selectedItemId = R.id.menu_random
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                        drawerLayout.closeDrawers()

                    }
                    R.id.menu_like1 -> {
                        myBottomNav.selectedItemId = R.id.menu_like
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                        drawerLayout.closeDrawers()

                    }
                    R.id.menu_about1 -> {
                        smsDialog1(this@MainActivity2)
                        dialogCancel()
                        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                        vibratorService.vibrate(50)
                    }
                }
                true
            }

            adapter = Adapter(list, supportFragmentManager)

            viewPager.adapter = adapter

            tabLayout.setupWithViewPager(viewPager)


        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home1 -> {
                Toast.makeText(binding.root.context, "FKSODFKSDKF:K", Toast.LENGTH_SHORT).show()
                binding.myBottomNav.selectedItemId = R.id.menu_home
            }
        }
        return true
    }

    companion object dialogShow {
        lateinit var dialog: AlertDialog
        fun smsDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context, R.style.NewDialog)


            dialog = alertDialog.create()

            val dialogView =
                LayoutInflater.from(context).inflate(R.layout.item_dialog, null, false)
            dialog.setView(dialogView)

            dialog.show()
            SmsDialog().start()
        }

        fun dialogCancel() {
            dialog.cancel()
        }
    }
}

lateinit var dialog: AlertDialog
fun smsDialog1(context: Context) {
    val alertDialog = AlertDialog.Builder(context, R.style.NewDialog)


    dialog = alertDialog.create()

    val dialogView =
        LayoutInflater.from(context).inflate(R.layout.item_about, null, false)
    dialog.setView(dialogView)

    dialog.show()
    SmsDialog().start()

}

fun dialogCancel() {
    dialog.cancel()
}


class SmsDialog() : Thread() {
    override fun run() {
        super.run()
        sleep(2000)
        dialogCancel()
    }

}