package com.akirachix.my_blogs_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.my_blogs_project.databinding.ActivityMainBinding
import com.akirachix.myblogsproject.Blog
import com.akirachix.myblogsproject.BlogsAdapter


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        displayBlogs()

    }

    fun displayBlogs() {
        val blog1 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog2 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog3 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog4 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog5 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog6 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog7 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog8 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog9 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog10 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog11 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog12 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blog13 = Blog("Author: Margaret Ochola", "", " Title: Sadness", "PublishingDate: 20-Oct-2024", "We use a variety of words to describe sadness, including pain, anguish, broken heart, hurt, sorrow, dejection, dismay, homesickness, distress, and dissatisfaction. \n" +
                "\n" +
                "Sadness is typically accompanied by other emotions such as anger, tension, guilt, grief, anxiety, or hopelessness. Sometimes the other emotion is so intense that you don't realize you're sad.\n" +
                "So, how does sadness feel like? It may affect how you feel physically. Perhaps you have a stomach pain, a headache, or are unable to sleep.\n", "Read More")

        val blog14 = Blog("Author: Talia Mukami", "", "Title: Live Laugh", "21-June-2024", "We need to enjoy our lives to the utmost. Be kind to yourself, your family, and others. Be big in behavior, not little. Think mature, not immature. Maintain your composure. Consider Abraham Lincoln's statement, \"In the end, it's not the years in your life that count.\" It's the life in your years. Or repeat Oscar Wilde's idea throughout the day: \"To live is the rarest thing in the world.\" Most people exist, that's all.\" It is not required to do or have magnificent things in order to live a fulfilling life. All you need is freedom, accuracy of perception, and appreciation. ", "Read More")

        val blogList = listOf(
            blog1,
            blog2,
            blog3,
            blog4,
            blog5,
            blog6,
            blog7,
            blog8,
            blog9,
            blog10,
            blog11,
            blog12,
            blog13,
            blog14
        )

        val blogsAdapter = BlogsAdapter(blogList)

        binding.rvBlogs.adapter = blogsAdapter
    }
}