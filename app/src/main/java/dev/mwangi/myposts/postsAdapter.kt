package dev.mwangi.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.mwangi.myposts.databinding.PostsBinding

class postsAdapter(var context: Context, var posts: List<post> ): RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var bindingView = PostsBinding.inflate(LayoutInflater.from(context), parent, false)
        return PostViewHolder(bindingView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPost  = posts[position]
        with(holder.binding){
            tvId.text = currentPost.id.toString()
            tvUser.text = currentPost.userId.toString()
            tvTitle.text = currentPost.title
            tvBody.text = currentPost.body
        }



    }

    override fun getItemCount(): Int {
        return posts.size
    }
}

class PostViewHolder(var binding: PostsBinding): RecyclerView.ViewHolder(binding.root)