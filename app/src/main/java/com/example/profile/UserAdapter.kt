package com.example.profile

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class UserAdapter(private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]

        Glide.with(holder.itemView.context)
            .load(user.photo)
            .apply(RequestOptions().override(200, 200))
            .into(holder.imgPhoto)
        holder.tvName.text = user.name

        holder.itemView.setOnClickListener(View.OnClickListener {
            val activity = holder.itemView.context as Activity
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PHOTO, user.photo)
            intent.putExtra(DetailActivity.EXTRA_NAME, user.name)
            intent.putExtra(DetailActivity.EXTRA_BIRTH, user.birth)
            intent.putExtra(DetailActivity.EXTRA_PLACE, user.place)
            activity.startActivity(intent)
        })
    }

    override fun getItemCount(): Int = listUser.size

}