package com.harry.adapters
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.harry.R
import com.harry.models.Model
import com.harry.showToast
import kotlinx.android.synthetic.main.view_lists.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Model.Hobby>) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_lists, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentHobby: Model.Hobby? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                currentHobby?.let {
                    context.showToast(currentHobby!!.title + "Clicked!")
                }
            }
            itemView.imageView.setOnClickListener {
                currentHobby?.let {
                    val message: String = "My hobby is: " + currentHobby!!.title
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"
                    context.startActivity(Intent.createChooser(intent, "Please Select App: "))
                }

            }
        }

        fun setData(hobby: Model.Hobby?, pos: Int) {
            hobby?.let {
                itemView.textView.text = hobby.title
            }

            this.currentHobby = hobby
            this.currentPosition = pos
        }
    }
}
