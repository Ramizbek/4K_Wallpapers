package ramizbek.aliyev.homework20

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import ramizbek.aliyev.homework20.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        MyObject.check()
        binding.apply {
            image1.setOnClickListener {
                setImage(it)
                MyObject.count = 0
            }
            image2.setOnClickListener {
                setImage(it)
                MyObject.count = 1

            }
            image3.setOnClickListener {
                MyObject.count = 2

                setImage(it)
            }
            image4.setOnClickListener {
                MyObject.count = 3

                setImage(it)
            }
            image5.setOnClickListener {
                MyObject.count = 4

                setImage(it)
            }
            image6.setOnClickListener {
                MyObject.count = 5

                setImage(it)
            }
            image7.setOnClickListener {
                MyObject.count = 6

                setImage(it)
            }
            image8.setOnClickListener {
                MyObject.count = 7

                setImage(it)
            }
            image9.setOnClickListener {
                MyObject.count = 8
                setImage(it)
            }
            image10.setOnClickListener {
                MyObject.count = 9
                setImage(it)
            }
            image11.setOnClickListener {
                MyObject.count = 10
                setImage(it)
            }
            image12.setOnClickListener {
                MyObject.count = 11

                setImage(it)
            }
            image13.setOnClickListener {
                MyObject.count = 12

                setImage(it)
            }
            image14.setOnClickListener {
                MyObject.count = 13

                setImage(it)
            }
            image15.setOnClickListener {
                MyObject.count = 14

                setImage(it)
            }
            image16.setOnClickListener {
                MyObject.count = 15

                setImage(it)
            }
            image17.setOnClickListener {
                MyObject.count = 16

                setImage(it)
            }
            image18.setOnClickListener {
                MyObject.count = 17

                setImage(it)
            }
            return root
        }
    }

    fun setImage(view: View) {
        val imageView = view as ImageView
        MyObject.drawable = imageView.drawable
        startActivity(Intent(binding.root.context, MainActivity::class.java))
    }
}