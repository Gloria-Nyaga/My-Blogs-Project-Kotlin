package com.akirachix.my_blogs_project


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter(val blogsList: List<Blog>):
    RecyclerView.Adapter<BlogsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_blogs_list_item, parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return blogsList.size
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blog = blogsList[position]
        holder.tvTitle.text = blog.title
        holder.tvAuthor.text = blog.author
        holder.tvPublishingDate.text = blog.publishingDate
        holder.tvArticlePreview.text = blog.articlePreview
        holder.tvLink.text = blog.link
    }
}


class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvTitle =itemView.findViewById<TextView>(R.id.tvTitle)
    var tvAuthor =itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvPublishingDate= itemView.findViewById<TextView>(R.id.tvPublishingDate)
    var tvArticlePreview = itemView.findViewById<TextView>(R.id.tvArticlePreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink )

}
