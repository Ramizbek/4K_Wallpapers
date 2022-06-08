package ramizbek.aliyev.homework20

import android.graphics.drawable.Drawable

object MyObject {
    var image = 0
    var drawable: Drawable? = null
    var liked = 0
    var count=-1
    var list = ArrayList<Int>()
    fun check(){
        for (i in 0 until 18){
            list.add(0)
        }
    }
}