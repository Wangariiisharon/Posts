package dev.mwangi.myposts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mwangi.myposts.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getposts()
    }
    fun getposts(){
        val retrofit=ApiClient.buildApiClient(ApiInterface::class.java)
        val request=retrofit.getPost()

        request.enqueue(object:Callback<List<post>> {
            override fun onResponse(call: Call<List<post>>, response: Response<List<post>>) {
              if(response.isSuccessful){
               val post=response.body()!!
                  Toast.makeText(baseContext,"fetched ${post!!.size} posts", Toast.LENGTH_SHORT).show()

                  var postAdapter = postsAdapter(baseContext, post)
                  binding.rcvPosts.layoutManager = LinearLayoutManager(baseContext)
                  binding.rcvPosts.adapter = postAdapter

              }
            }

            override fun onFailure(call: Call<List<post>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}