package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.akirachix.my_blogs_project.Blog
import com.akirachix.my_blogs_project.BlogsAdapter
import com.akirachix.my_blogs_project.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }



    fun displayBlogs() {
        val blog1 = Blog("Nyaga Gloria","", "STRENGTH", "24-June-2024", "","", "")

        val blogList = listOf(
            blog1,
        )

        val blogsAdapter = BlogsAdapter(blogList)

        binding.rvBlogs.adapter = blogsAdapter
    }
}